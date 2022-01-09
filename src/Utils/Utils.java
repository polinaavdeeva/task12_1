package Utils;

public class Utils {

    public static String removeAllButNotBrackets(String text) {
        text = text.replaceAll("[A-Za-zА-Яа-я0-9 ]", "");
        return text;
    }
}
