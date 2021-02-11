
/**
 *Utility class for HTML form encoding. This class contains static methods for converting a String to the application/x-www-form-urlencoded MIME format. For more information about HTML form encoding, consult the HTML <a href="https://www.w3.org/TR/html4/" target="_blank">specification</a> .
 *<br>
 * When encoding a String, the following rules apply: <br>
 *  <ul>
  <li>The alphanumeric characters "a" through "z", "A" through "Z" and "0" through "9" remain the same.</li>
  <li>The special characters ".", "-", "*", and "_" remain the same.</li>
  <li>The space character " " is converted into a plus sign "+".</li>
  <li>All other characters are unsafe and are first converted into one or more bytes using some encoding scheme. Then each byte is represented by the 3-character string "%xy", where xy is the two-digit hexadecimal representation of the byte. The recommended encoding scheme to use is UTF-8. However, for compatibility reasons, if an encoding is not specified, then the default encoding of the platform is used.</li>
 * </ul> 
 *
 *
 *
 * 
 *For example using UTF-8 as the encoding scheme the string "The string ü@foo-bar" would get converted to "The+string+%C3%BC%40foo-bar" because in UTF-8 the character ü is encoded as two bytes C3 (hex) and BC (hex), and the character @ is encoded as one byte 40 (hex).
 *<br><b>Since:</b>
 *  <br>   JDK1.0
 */

public class URLEncoder {
/**
 *  <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/Deprecated.html" target="">@Deprecated</a>
 * <br><b>Deprecated.</b> <i>The resulting string may vary depending on the platform's default encoding. 
 * Instead, use the encode(String,String) method to specify the encoding.</i>
<br>Translates a string into x-www-form-urlencoded format. This method uses the platform's default encoding as the encoding scheme to obtain the bytes for unsafe characters.
 * <br><b>@param</b><br> s String to be translated.
 * <br><b>@return</b><br> the translated String.
 */
public static String encode(String s)
{
    return s;
}   
/**
 * Translates a string into application/x-www-form-urlencoded format using a specific encoding scheme. This method uses the supplied encoding scheme to obtain the bytes for unsafe characters. <br>
 * <b>Note:</b> The <a href="https://www.w3.org/TR/html40/appendix/notes.html#non-ascii-chars" target=""> World Wide Web Consortium Recommendation</a> states that UTF-8 should be used. Not doing so may introduce incompatibilites.
 * <br><b>@param</b><br> s String to be translated.
 * <br><b>@param</b><br> enc The name of a supported character encoding.
 * <br><b>@return</b><br>  the translated String.
 * <br><b>@throws</b><br>  <a href="https://docs.oracle.com/javase/7/docs/api/java/io/UnsupportedEncodingException.html" target=""> UnsupportedEncodingException </a> -If the named encoding is not supported 
 * <br><b>@since</b><br>  1.4
 * <br><b>@see</b><br>  <a href="https://docs.oracle.com/javase/7/docs/api/java/net/URLDecoder.html#decode(java.lang.String,%20java.lang.String)" target=""> URLDecoder.decode(java.lang.String, java.lang.String) </a>
 */
public static String encode(String s,String enc)
{
    return s;
}

}

