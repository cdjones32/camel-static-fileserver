package co.cdjones.camel.static_fs;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author chrisjones
 * @date 9/10/2017
 */
public class CamelStaticFileServer implements Processor {

    final FileType fileType;
    final String baseUrl;

    public CamelStaticFileServer(FileType fileType, String baseUrl) {
        baseUrl = baseUrl.trim();
        if (!baseUrl.equals("/")) {
            if (baseUrl.endsWith("/")) {
                baseUrl = baseUrl.substring(0, baseUrl.length() - 1);
            }
        }
        this.baseUrl = baseUrl;
        this.fileType = fileType;
    }

    @Override
    public void process( Exchange exchange ) throws Exception {
        Message in = exchange.getIn();
        Message out = exchange.getOut();

        // Get the requested path from the request
        String relativePath = in.getHeader(Exchange.HTTP_PATH, String.class);

        // If there was no file specified, we need to send a redirect to include the root path "/"
        // If we don't, the browsers will not follow appropriate relative URLs
        if (relativePath == null || relativePath.isEmpty()) {
            String path = in.getHeader(Exchange.HTTP_URI, String.class);
            out.setHeader(Exchange.HTTP_RESPONSE_CODE, HttpStatus.SC_MOVED_TEMPORARILY);
            out.setHeader(HttpHeaders.LOCATION, path + "/");
            return;
        }

        // If no file was specified, set the default as index.html
        if (relativePath.endsWith("/")) {
            relativePath += "index.html";
        }

        // Ensure the relative path starts with a /
        if (!relativePath.startsWith("/")) relativePath = "/" + relativePath;

        // Handle illegal characters
        if (relativePath.contains("~") || relativePath.contains("..")) {
            out.setHeader(Exchange.HTTP_RESPONSE_CODE, HttpStatus.SC_FORBIDDEN);
            out.setBody("Illegal characters in path");
            return;
        }

        String extension = relativePath.substring(relativePath.lastIndexOf(".") + 1);

        try {
            InputStream fileStream;

            if (fileType.equals(FileType.FILE_SYSTEM)) {
                // File System, get from there
                File file = new File(baseUrl + relativePath);
                fileStream = new FileInputStream(file);
            } else {
                fileStream = this.getClass().getResourceAsStream(baseUrl + relativePath);
            }

            if (fileStream == null) {
                notFound(out, relativePath + " not found.");
                return;
            }
            String mimeType = MimeTypes.getMimeType(extension);

            out.setBody(fileStream);
            out.setHeader(Exchange.CONTENT_TYPE, mimeType);
        } catch (FileNotFoundException fex) {
            notFound(out, relativePath + " not found.");
        }
    }

    private void notFound(Message out, String message) {
        out.setBody(message);
        out.setHeader(Exchange.HTTP_RESPONSE_CODE, HttpStatus.SC_NOT_FOUND);
    }

    public interface HttpStatus {
        /** {@code 302 Moved Temporarily} (Sometimes {@code Found}) (HTTP/1.0 - RFC 1945) */
        public static final int SC_MOVED_TEMPORARILY = 302;
        /** {@code 200 OK} (HTTP/1.0 - RFC 1945) */
        public static final int SC_OK = 200;
        /** {@code 403 Forbidden} (HTTP/1.0 - RFC 1945) */
        public static final int SC_FORBIDDEN = 403;
        /** {@code 404 Not Found} (HTTP/1.0 - RFC 1945) */
        public static final int SC_NOT_FOUND = 404;
    }

    public interface HttpHeaders {
        /** RFC 1945 (HTTP/1.0) Section 10.11, RFC 2616 (HTTP/1.1) Section 14.30 */
        public static final String LOCATION = "Location";
    }

    public enum FileType {
        FILE_SYSTEM,
        RESOURCE
    }
}

