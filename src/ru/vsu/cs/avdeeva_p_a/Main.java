package ru.vsu.cs.avdeeva_p_a;

import Utils.Utils;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printResult(removeAllExpBrackets(readText()));
    }

    private static String readText() {
        System.out.println("Please, write the text to check the correctness of the brackets :\n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void printResult(String text) {

        if(IsBracketsCorrect.isBracketsCorrect(text)) {
            System.out.println("Everything is fine. The brackets are correctly placed.");
        } else {
            System.out.println("An error, since the brackets are incorrectly placed.");
        }
    }

    private static String removeAllExpBrackets(String text){
        return Utils.removeAllButNotBrackets(text);
    }
}
