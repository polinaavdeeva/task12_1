package ru.vsu.cs.avdeeva_p_a;

public class IsBracketsCorrect {

    public static boolean isBracketsCorrect(String text){

        if (text.length() == 0) {
            return true;
        }

        if (text.contains("()")) {
            return isBracketsCorrect(text.replaceFirst("\\(\\)", ""));
        }

        if (text.contains("[]")) {
            return isBracketsCorrect(text.replaceFirst("\\[\\]", ""));
        }

        if (text.contains("{}")) {
            return isBracketsCorrect(text.replaceFirst("\\{\\}", ""));
        } else {
            return false;
        }
    }
    
}

