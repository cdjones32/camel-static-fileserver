package co.cdjones.camel.static_fs;

import java.util.HashMap;

/**
 * Map file extensions to MIME types. Based on the Apache mime.types file.
 * http://www.iana.org/assignments/media-types/
 */
public class MimeTypes {

    static final String MIME_APPLICATION_ANDREW_INSET  = "application/andrew-inset";
    static final String MIME_APPLICATION_JSON      = "application/json";
    static final String MIME_APPLICATION_ZIP       = "application/zip";
    static final String MIME_APPLICATION_X_GZIP      = "application/x-gzip";
    static final String MIME_APPLICATION_TGZ       = "application/tgz";
    static final String MIME_APPLICATION_MSWORD      = "application/msword";
    static final String MIME_APPLICATION_POSTSCRIPT    = "application/postscript";
    static final String MIME_APPLICATION_PDF       = "application/pdf";
    static final String MIME_APPLICATION_JNLP      = "application/jnlp";
    static final String MIME_APPLICATION_MAC_BINHEX40  = "application/mac-binhex40";
    static final String MIME_APPLICATION_MAC_COMPACTPRO  = "application/mac-compactpro";
    static final String MIME_APPLICATION_MATHML_XML    = "application/mathml+xml";
    static final String MIME_APPLICATION_OCTET_STREAM  = "application/octet-stream";
    static final String MIME_APPLICATION_ODA       = "application/oda";
    static final String MIME_APPLICATION_RDF_XML     = "application/rdf+xml";
    static final String MIME_APPLICATION_JAVA_ARCHIVE  = "application/java-archive";
    static final String MIME_APPLICATION_RDF_SMIL    = "application/smil";
    static final String MIME_APPLICATION_SRGS      = "application/srgs";
    static final String MIME_APPLICATION_SRGS_XML    = "application/srgs+xml";
    static final String MIME_APPLICATION_VND_MIF     = "application/vnd.mif";
    static final String MIME_APPLICATION_VND_MSEXCEL   = "application/vnd.ms-excel";
    static final String MIME_APPLICATION_VND_MSPOWERPOINT= "application/vnd.ms-powerpoint";
    static final String MIME_APPLICATION_VND_RNREALMEDIA = "application/vnd.rn-realmedia";
    static final String MIME_APPLICATION_X_BCPIO     = "application/x-bcpio";
    static final String MIME_APPLICATION_X_CDLINK    = "application/x-cdlink";
    static final String MIME_APPLICATION_X_CHESS_PGN   = "application/x-chess-pgn";
    static final String MIME_APPLICATION_X_CPIO      = "application/x-cpio";
    static final String MIME_APPLICATION_X_CSH     = "application/x-csh";
    static final String MIME_APPLICATION_X_DIRECTOR    = "application/x-director";
    static final String MIME_APPLICATION_X_DVI     = "application/x-dvi";
    static final String MIME_APPLICATION_X_FUTURESPLASH  = "application/x-futuresplash";
    static final String MIME_APPLICATION_X_GTAR      = "application/x-gtar";
    static final String MIME_APPLICATION_X_HDF     = "application/x-hdf";
    static final String MIME_APPLICATION_X_JAVASCRIPT  = "application/x-javascript";
    static final String MIME_APPLICATION_X_KOAN      = "application/x-koan";
    static final String MIME_APPLICATION_X_LATEX     = "application/x-latex";
    static final String MIME_APPLICATION_X_NETCDF    = "application/x-netcdf";
    static final String MIME_APPLICATION_X_OGG     = "application/x-ogg";
    static final String MIME_APPLICATION_X_SH      = "application/x-sh";
    static final String MIME_APPLICATION_X_SHAR      = "application/x-shar";
    static final String MIME_APPLICATION_X_SHOCKWAVE_FLASH = "application/x-shockwave-flash";
    static final String MIME_APPLICATION_X_STUFFIT     = "application/x-stuffit";
    static final String MIME_APPLICATION_X_SV4CPIO     = "application/x-sv4cpio";
    static final String MIME_APPLICATION_X_SV4CRC    = "application/x-sv4crc";
    static final String MIME_APPLICATION_X_TAR       = "application/x-tar";
    static final String MIME_APPLICATION_X_RAR_COMPRESSED= "application/x-rar-compressed";
    static final String MIME_APPLICATION_X_TCL       = "application/x-tcl";
    static final String MIME_APPLICATION_X_TEX       = "application/x-tex";
    static final String MIME_APPLICATION_X_TEXINFO   = "application/x-texinfo";
    static final String MIME_APPLICATION_X_TROFF     = "application/x-troff";
    static final String MIME_APPLICATION_X_TROFF_MAN   = "application/x-troff-man";
    static final String MIME_APPLICATION_X_TROFF_ME    = "application/x-troff-me";
    static final String MIME_APPLICATION_X_TROFF_MS    = "application/x-troff-ms";
    static final String MIME_APPLICATION_X_USTAR     = "application/x-ustar";
    static final String MIME_APPLICATION_X_WAIS_SOURCE = "application/x-wais-source";
    static final String MIME_APPLICATION_VND_MOZZILLA_XUL_XML = "application/vnd.mozilla.xul+xml";
    static final String MIME_APPLICATION_XHTML_XML     = "application/xhtml+xml";
    static final String MIME_APPLICATION_XSLT_XML    = "application/xslt+xml";
    static final String MIME_APPLICATION_XML       = "application/xml";
    static final String MIME_APPLICATION_XML_DTD     = "application/xml-dtd";
    static final String MIME_IMAGE_BMP         = "image/bmp";
    static final String MIME_IMAGE_CGM         = "image/cgm";
    static final String MIME_IMAGE_GIF         = "image/gif";
    static final String MIME_IMAGE_IEF         = "image/ief";
    static final String MIME_IMAGE_JPEG          = "image/jpeg";
    static final String MIME_IMAGE_TIFF          = "image/tiff";
    static final String MIME_IMAGE_PNG         = "image/png";
    static final String MIME_IMAGE_SVG_XML       = "image/svg+xml";
    static final String MIME_IMAGE_VND_DJVU        = "image/vnd.djvu";
    static final String MIME_IMAGE_WAP_WBMP        = "image/vnd.wap.wbmp";
    static final String MIME_IMAGE_X_CMU_RASTER      = "image/x-cmu-raster";
    static final String MIME_IMAGE_X_ICON        = "image/x-icon";
    static final String MIME_IMAGE_X_PORTABLE_ANYMAP   = "image/x-portable-anymap";
    static final String MIME_IMAGE_X_PORTABLE_BITMAP   = "image/x-portable-bitmap";
    static final String MIME_IMAGE_X_PORTABLE_GRAYMAP  = "image/x-portable-graymap";
    static final String MIME_IMAGE_X_PORTABLE_PIXMAP   = "image/x-portable-pixmap";
    static final String MIME_IMAGE_X_RGB         = "image/x-rgb";
    static final String MIME_AUDIO_BASIC         = "audio/basic";
    static final String MIME_AUDIO_MIDI          = "audio/midi";
    static final String MIME_AUDIO_MPEG          = "audio/mpeg";
    static final String MIME_AUDIO_X_AIFF        = "audio/x-aiff";
    static final String MIME_AUDIO_X_MPEGURL       = "audio/x-mpegurl";
    static final String MIME_AUDIO_X_PN_REALAUDIO    = "audio/x-pn-realaudio";
    static final String MIME_AUDIO_X_WAV         = "audio/x-wav";
    static final String MIME_CHEMICAL_X_PDB        = "chemical/x-pdb";
    static final String MIME_CHEMICAL_X_XYZ        = "chemical/x-xyz";
    static final String MIME_MODEL_IGES          = "model/iges";
    static final String MIME_MODEL_MESH          = "model/mesh";
    static final String MIME_MODEL_VRLM          = "model/vrml";
    static final String MIME_TEXT_PLAIN          = "text/plain";
    static final String MIME_TEXT_RICHTEXT       = "text/richtext";
    static final String MIME_TEXT_RTF          = "text/rtf";
    static final String MIME_TEXT_HTML         = "text/html";
    static final String MIME_TEXT_CALENDAR       = "text/calendar";
    static final String MIME_TEXT_CSS          = "text/css";
    static final String MIME_TEXT_SGML         = "text/sgml";
    static final String MIME_TEXT_TAB_SEPARATED_VALUES = "text/tab-separated-values";
    static final String MIME_TEXT_VND_WAP_XML      = "text/vnd.wap.wml";
    static final String MIME_TEXT_VND_WAP_WMLSCRIPT    = "text/vnd.wap.wmlscript";
    static final String MIME_TEXT_X_SETEXT       = "text/x-setext";
    static final String MIME_TEXT_X_COMPONENT      = "text/x-component";
    static final String MIME_VIDEO_QUICKTIME       = "video/quicktime";
    static final String MIME_VIDEO_MPEG          = "video/mpeg";
    static final String MIME_VIDEO_VND_MPEGURL     = "video/vnd.mpegurl";
    static final String MIME_VIDEO_X_MSVIDEO       = "video/x-msvideo";
    static final String MIME_VIDEO_X_MS_WMV        = "video/x-ms-wmv";
    static final String MIME_VIDEO_X_SGI_MOVIE     = "video/x-sgi-movie";
    static final String MIME_X_CONFERENCE_X_COOLTALK   = "x-conference/x-cooltalk";

    private static HashMap<String, String> mimeTypeMapping;

    static {
        mimeTypeMapping = new HashMap<String, String>(200) {
            private void put1(String key, String value) {
                if (put(key, value) != null) {
                    throw new IllegalArgumentException("Duplicated extension: " + key);
                }
            }
            {
                put1("xul", MIME_APPLICATION_VND_MOZZILLA_XUL_XML);
                put1("json", MIME_APPLICATION_JSON);
                put1("ice", MIME_X_CONFERENCE_X_COOLTALK);
                put1("movie", MIME_VIDEO_X_SGI_MOVIE);
                put1("avi", MIME_VIDEO_X_MSVIDEO);
                put1("wmv", MIME_VIDEO_X_MS_WMV);
                put1("m4u", MIME_VIDEO_VND_MPEGURL);
                put1("mxu", MIME_VIDEO_VND_MPEGURL);
                put1("htc", MIME_TEXT_X_COMPONENT);
                put1("etx", MIME_TEXT_X_SETEXT);
                put1("wmls", MIME_TEXT_VND_WAP_WMLSCRIPT);
                put1("wml", MIME_TEXT_VND_WAP_XML);
                put1("tsv", MIME_TEXT_TAB_SEPARATED_VALUES);
                put1("sgm", MIME_TEXT_SGML);
                put1("sgml", MIME_TEXT_SGML);
                put1("css", MIME_TEXT_CSS);
                put1("ifb", MIME_TEXT_CALENDAR);
                put1("ics", MIME_TEXT_CALENDAR);
                put1("wrl", MIME_MODEL_VRLM);
                put1("vrlm", MIME_MODEL_VRLM);
                put1("silo", MIME_MODEL_MESH);
                put1("mesh", MIME_MODEL_MESH);
                put1("msh", MIME_MODEL_MESH);
                put1("iges", MIME_MODEL_IGES);
                put1("igs", MIME_MODEL_IGES);
                put1("rgb", MIME_IMAGE_X_RGB);
                put1("ppm", MIME_IMAGE_X_PORTABLE_PIXMAP);
                put1("pgm", MIME_IMAGE_X_PORTABLE_GRAYMAP);
                put1("pbm", MIME_IMAGE_X_PORTABLE_BITMAP);
                put1("pnm", MIME_IMAGE_X_PORTABLE_ANYMAP);
                put1("ico", MIME_IMAGE_X_ICON);
                put1("ras", MIME_IMAGE_X_CMU_RASTER);
                put1("wbmp", MIME_IMAGE_WAP_WBMP);
                put1("djv", MIME_IMAGE_VND_DJVU);
                put1("djvu", MIME_IMAGE_VND_DJVU);
                put1("svg", MIME_IMAGE_SVG_XML);
                put1("ief", MIME_IMAGE_IEF);
                put1("cgm", MIME_IMAGE_CGM);
                put1("bmp", MIME_IMAGE_BMP);
                put1("xyz", MIME_CHEMICAL_X_XYZ);
                put1("pdb", MIME_CHEMICAL_X_PDB);
                put1("ra", MIME_AUDIO_X_PN_REALAUDIO);
                put1("ram", MIME_AUDIO_X_PN_REALAUDIO);
                put1("m3u", MIME_AUDIO_X_MPEGURL);
                put1("aifc", MIME_AUDIO_X_AIFF);
                put1("aif", MIME_AUDIO_X_AIFF);
                put1("aiff", MIME_AUDIO_X_AIFF);
                put1("mp3", MIME_AUDIO_MPEG);
                put1("mp2", MIME_AUDIO_MPEG);
                put1("mp1", MIME_AUDIO_MPEG);
                put1("mpga", MIME_AUDIO_MPEG);
                put1("kar", MIME_AUDIO_MIDI);
                put1("mid", MIME_AUDIO_MIDI);
                put1("midi", MIME_AUDIO_MIDI);
                put1("dtd", MIME_APPLICATION_XML_DTD);
                put1("xsl", MIME_APPLICATION_XML);
                put1("xml", MIME_APPLICATION_XML);
                put1("xslt", MIME_APPLICATION_XSLT_XML);
                put1("xht", MIME_APPLICATION_XHTML_XML);
                put1("xhtml", MIME_APPLICATION_XHTML_XML);
                put1("src", MIME_APPLICATION_X_WAIS_SOURCE);
                put1("ustar", MIME_APPLICATION_X_USTAR);
                put1("ms", MIME_APPLICATION_X_TROFF_MS);
                put1("me", MIME_APPLICATION_X_TROFF_ME);
                put1("man", MIME_APPLICATION_X_TROFF_MAN);
                put1("roff", MIME_APPLICATION_X_TROFF);
                put1("tr", MIME_APPLICATION_X_TROFF);
                put1("t", MIME_APPLICATION_X_TROFF);
                put1("texi", MIME_APPLICATION_X_TEXINFO);
                put1("texinfo", MIME_APPLICATION_X_TEXINFO);
                put1("tex", MIME_APPLICATION_X_TEX);
                put1("tcl", MIME_APPLICATION_X_TCL);
                put1("sv4crc", MIME_APPLICATION_X_SV4CRC);
                put1("sv4cpio", MIME_APPLICATION_X_SV4CPIO);
                put1("sit", MIME_APPLICATION_X_STUFFIT);
                put1("swf", MIME_APPLICATION_X_SHOCKWAVE_FLASH);
                put1("shar", MIME_APPLICATION_X_SHAR);
                put1("sh", MIME_APPLICATION_X_SH);
                put1("cdf", MIME_APPLICATION_X_NETCDF);
                put1("nc", MIME_APPLICATION_X_NETCDF);
                put1("latex", MIME_APPLICATION_X_LATEX);
                put1("skm", MIME_APPLICATION_X_KOAN);
                put1("skt", MIME_APPLICATION_X_KOAN);
                put1("skd", MIME_APPLICATION_X_KOAN);
                put1("skp", MIME_APPLICATION_X_KOAN);
                put1("js", MIME_APPLICATION_X_JAVASCRIPT);
                put1("hdf", MIME_APPLICATION_X_HDF);
                put1("gtar", MIME_APPLICATION_X_GTAR);
                put1("spl", MIME_APPLICATION_X_FUTURESPLASH);
                put1("dvi", MIME_APPLICATION_X_DVI);
                put1("dxr", MIME_APPLICATION_X_DIRECTOR);
                put1("dir", MIME_APPLICATION_X_DIRECTOR);
                put1("dcr", MIME_APPLICATION_X_DIRECTOR);
                put1("csh", MIME_APPLICATION_X_CSH);
                put1("cpio", MIME_APPLICATION_X_CPIO);
                put1("pgn", MIME_APPLICATION_X_CHESS_PGN);
                put1("vcd", MIME_APPLICATION_X_CDLINK);
                put1("bcpio", MIME_APPLICATION_X_BCPIO);
                put1("rm", MIME_APPLICATION_VND_RNREALMEDIA);
                put1("ppt", MIME_APPLICATION_VND_MSPOWERPOINT);
                put1("mif", MIME_APPLICATION_VND_MIF);
                put1("grxml", MIME_APPLICATION_SRGS_XML);
                put1("gram", MIME_APPLICATION_SRGS);
                put1("smil", MIME_APPLICATION_RDF_SMIL);
                put1("smi", MIME_APPLICATION_RDF_SMIL);
                put1("rdf", MIME_APPLICATION_RDF_XML);
                put1("ogg", MIME_APPLICATION_X_OGG);
                put1("oda", MIME_APPLICATION_ODA);
                put1("dmg", MIME_APPLICATION_OCTET_STREAM);
                put1("lzh", MIME_APPLICATION_OCTET_STREAM);
                put1("so", MIME_APPLICATION_OCTET_STREAM);
                put1("lha", MIME_APPLICATION_OCTET_STREAM);
                put1("dms", MIME_APPLICATION_OCTET_STREAM);
                put1("bin", MIME_APPLICATION_OCTET_STREAM);
                put1("mathml", MIME_APPLICATION_MATHML_XML);
                put1("cpt", MIME_APPLICATION_MAC_COMPACTPRO);
                put1("hqx", MIME_APPLICATION_MAC_BINHEX40);
                put1("jnlp", MIME_APPLICATION_JNLP);
                put1("ez", MIME_APPLICATION_ANDREW_INSET);
                put1("txt", MIME_TEXT_PLAIN);
                put1("ini", MIME_TEXT_PLAIN);
                put1("c", MIME_TEXT_PLAIN);
                put1("h", MIME_TEXT_PLAIN);
                put1("cpp", MIME_TEXT_PLAIN);
                put1("cxx", MIME_TEXT_PLAIN);
                put1("cc", MIME_TEXT_PLAIN);
                put1("chh", MIME_TEXT_PLAIN);
                put1("java", MIME_TEXT_PLAIN);
                put1("csv", MIME_TEXT_PLAIN);
                put1("bat", MIME_TEXT_PLAIN);
                put1("cmd", MIME_TEXT_PLAIN);
                put1("asc", MIME_TEXT_PLAIN);
                put1("rtf", MIME_TEXT_RTF);
                put1("rtx", MIME_TEXT_RICHTEXT);
                put1("html", MIME_TEXT_HTML);
                put1("htm", MIME_TEXT_HTML);
                put1("zip", MIME_APPLICATION_ZIP);
                put1("rar", MIME_APPLICATION_X_RAR_COMPRESSED);
                put1("gzip", MIME_APPLICATION_X_GZIP);
                put1("gz", MIME_APPLICATION_X_GZIP);
                put1("tgz", MIME_APPLICATION_TGZ);
                put1("tar", MIME_APPLICATION_X_TAR);
                put1("gif", MIME_IMAGE_GIF);
                put1("jpeg", MIME_IMAGE_JPEG);
                put1("jpg", MIME_IMAGE_JPEG);
                put1("jpe", MIME_IMAGE_JPEG);
                put1("tiff", MIME_IMAGE_TIFF);
                put1("tif", MIME_IMAGE_TIFF);
                put1("png", MIME_IMAGE_PNG);
                put1("au", MIME_AUDIO_BASIC);
                put1("snd", MIME_AUDIO_BASIC);
                put1("wav", MIME_AUDIO_X_WAV);
                put1("mov", MIME_VIDEO_QUICKTIME);
                put1("qt", MIME_VIDEO_QUICKTIME);
                put1("mpeg", MIME_VIDEO_MPEG);
                put1("mpg", MIME_VIDEO_MPEG);
                put1("mpe", MIME_VIDEO_MPEG);
                put1("abs", MIME_VIDEO_MPEG);
                put1("doc", MIME_APPLICATION_MSWORD);
                put1("xls", MIME_APPLICATION_VND_MSEXCEL);
                put1("eps", MIME_APPLICATION_POSTSCRIPT);
                put1("ai", MIME_APPLICATION_POSTSCRIPT);
                put1("ps", MIME_APPLICATION_POSTSCRIPT);
                put1("pdf", MIME_APPLICATION_PDF);
                put1("exe", MIME_APPLICATION_OCTET_STREAM);
                put1("dll", MIME_APPLICATION_OCTET_STREAM);
                put1("class", MIME_APPLICATION_OCTET_STREAM);
                put1("jar", MIME_APPLICATION_JAVA_ARCHIVE);
            }};
    }

    /**
     * Registers MIME type for provided extension. Existing extension type will be overriden.
     */
    public static void registerMimeType(String ext, String mimeType) {
        mimeTypeMapping.put(ext, mimeType);
    }

    /**
     * Returns the corresponding MIME type to the given extension.
     * If no MIME type was found it returns 'application/octet-stream' type.
     */
    public static String getMimeType(String ext) {
        String mimeType = lookupMimeType(ext);
        if (mimeType == null) {
            mimeType = MIME_APPLICATION_OCTET_STREAM;
        }
        return mimeType;
    }

    /**
     * Simply returns MIME type or <code>null</code> if no type is found.
     */
    public static String lookupMimeType(String ext) {
        return mimeTypeMapping.get(ext.toLowerCase());
    }
}

