package org.example;

import java.util.*;

public class Main {
    String spe_character = "!$%&?@&#'{([-|`_^]}=£*";
    public static void main(String[] args) {
        convert_to_ascii();
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

    public static List<Character> checkword(){
        boolean arrow = false;
        Main myObj = new Main();
        List<Character> wordtoconvert = mkword();

        for (Character character : wordtoconvert) {
            for (int j = 0; j < myObj.spe_character.length(); ++j) {
                if (character == myObj.spe_character.charAt(j)) {
                    System.out.println("This character " + myObj.spe_character.charAt(j) + " is in your word. Try a new word");
                    mkword();
                } else {
                    System.out.println("Your word to analyze is good.");
                    arrow = true;
                    break;
                }
            }
            if (arrow) {
                break;
            }
        }
        return wordtoconvert;
    }
    public static Map<Character, Integer> convert_to_ascii(){
        List<Character> list = checkword();

        Scanner input = new Scanner(System.in);
        System.out.println("Which base do you want to convert your word into ?");
        System.out.println("a for octal, b for hexadecimal, c for binary and d for text");
        String choice = input.next();

        Map<Character, Integer> map1 = new LinkedHashMap<>();

        for (int i = 0; i < list.size(); ++i){
            int ascii = list.get(i);
            map1.put(list.get(i), ascii);
        }
        System.out.println(map1);
        return map1;
    }
}