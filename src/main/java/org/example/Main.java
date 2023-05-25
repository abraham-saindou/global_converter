package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    String spe_character = "!$%&?@&#'{([-|`_^]}=£*";
    public static void main(String[] args) {
        checkword();
    }
    public static List<Character> mkword(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to translate : ");
        String word = input.nextLine();
        List<Character> charList = new ArrayList<>();

        for (int i = 0; i < word.length(); ++i){
            charList.add(word.charAt(i));
        }

        System.out.println(charList);
        return charList;
    }

    public static String checkword(){
        boolean arrow = false;
        Main myObj = new Main();
        String wordtoconvert = mkword();
        for (int i = 0; i < wordtoconvert.length(); ++i){
            for (int j = 0; j < myObj.spe_character.length(); ++j){
                if (wordtoconvert.charAt(i) == myObj.spe_character.charAt(j)){
                    System.out.println("This character " + myObj.spe_character.charAt(j) + " is in your word. Try a new word");
                    mkword();
                }
                else {
                    System.out.println("Your word to analyze is good.");
                    arrow = true;
                    break;
                }
            }
            if (arrow){
                break;
            }

        }
        return wordtoconvert;
    }
    public static void ask_conversion(){
        Scanner input = new Scanner(System.in);
        System.out.println("Which base do you want to convert your word into ?");
        System.out.println("a for octal, b for hexadecimal, c for binary and d for text");
        String choice = input.next();
    }
}