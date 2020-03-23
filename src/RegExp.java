import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

  /**
   * Get IP address from text.
   * @param text text to parse
   * @return String with IP address
   */

  public static String getIpAddress(String text) {
    Pattern p = Pattern.compile("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
    Matcher m = p.matcher(text);
    String answer = "";
    while (m.find()) {
      answer = m.group();
      System.out.println(answer);
    }

    return answer;
  }
}