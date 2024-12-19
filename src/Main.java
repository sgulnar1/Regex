import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("/d");
        Matcher matcher = pattern.matcher("Abttagffe");
        while(matcher.find()) {
            MatchResult matchResult = matcher.toMatchResult();
            System.out.println("character start: " + matchResult.start());
            System.out.println("character end : " + matchResult.end());
            System.out.println("character group : " + matchResult.group());

        }
        while(true) {

        }
    }
}
