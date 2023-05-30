package org.example;

import java.util.List;

public class WordResult {
    private List<Character> charList;
    private String choice;

    public WordResult(List<Character> charList, String choice) {
        this.charList = charList;
        this.choice = choice;
    }

    public List<Character> getCharList() {
        return charList;
    }

    public String getChoice() {
        return choice;
    }
}
