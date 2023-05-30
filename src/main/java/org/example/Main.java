package org.example;

import java.util.*;

public class Main {
    String spe_character = "!$%&?@&#'{([-|`_^]}=£*";
    boolean arrow = false;


    public static void main(String[] args) {
        Main myObj = new Main();
        ascii_to_other tohex = new ascii_to_other();

        WordResult result = mkword();
        List<Character> charList = result.getCharList(); String choice = result.getChoice();
        String value;
        List<Character> n = checkword(charList);
        List<Integer> j = create_ascii(n);
        StringBuilder wordtotranslate  = new StringBuilder(); StringBuilder translate_word = new StringBuilder();

        switch (choice){
            case "-h":
                for (int i = 0; i < j.size(); ++i){
                    int val = j.get(i);
                    String newest = ascii_to_other.asciiToHexa(val);
                    wordtotranslate.append(n.get(i));
                    translate_word.append(newest).append(" ");
                }
                System.out.println(wordtotranslate);
                System.out.println(translate_word);

                break;
            case "-o":
                for (int i = 0; i < j.size(); ++i){
                    int val = j.get(i);
                    String newest = ascii_to_other.asciiToOctal(val);
                    wordtotranslate.append(n.get(i));
                    translate_word.append(newest).append(" ");
                }
                System.out.println(wordtotranslate);
                System.out.println(translate_word);
                break;
            case "-b":
                for (int i = 0; i < j.size(); ++i){
                    int val = j.get(i);
                    String newest = ascii_to_other.asciiToBinary(val);
                    wordtotranslate.append(n.get(i));
                    translate_word.append(newest).append(" ");
                }
                System.out.println(wordtotranslate);
                System.out.println(translate_word);
                break;
            case "-d":
                for (int i = 0; i < j.size(); ++i){
                    int val = j.get(i);
                    int newest = ascii_to_other.letterToAscii(n.get(i));
                    wordtotranslate.append(n.get(i));
                    translate_word.append(newest).append(" ");
                }
                System.out.println(wordtotranslate);
                System.out.println(translate_word);
                break;
            case "-t":
                break;
        }

    }
    public static WordResult mkword(){
        Scanner input = new Scanner(System.in);
        List<Character> charList = new ArrayList<>();

        String word, choice;
        System.out.println("Bienvenue au global converter ecrivez qqch contenant uniquement lettres et chiffres, et choisissez son type de sortie parmi : ");
        System.out.print("-o pour octal, -h pour hexadecimal, -b pour binary, -d pour decimal text");
        System.out.println("Saisir : ");

        word = input.next(); choice = input.next();

        for (int i = 0; i < word.length(); ++i){
            charList.add(word.charAt(i));
        }
        System.out.println(charList);
        return new WordResult(charList, choice);
    }

    public static List<Character> checkword(List<Character> list){
        Main myObj = new Main();
        for (Character character : list) {
            for (int j = 0; j < myObj.spe_character.length(); ++j) {
                if (character == myObj.spe_character.charAt(j)) {
                    System.out.println("Ce caractère " + myObj.spe_character.charAt(j) + " est dans votre mot. Veuillez recommencer.");
                    mkword();
                } else {
                    System.out.println("Votre mot est correct.");
                    myObj.arrow = true;
                    break;
                }
            }
            if (myObj.arrow) {
                break;
            }
        }
        return list;
    }
    public static List<Integer> create_ascii(List<Character> list){
        List<Integer> map1 = new ArrayList<>();
        Main myObj = new Main();
        for (int i = 0; i < list.size(); ++i){
            int n = list.get(i);
            map1.add(n);
        }
        System.out.println(map1);
        return map1;
    }
}