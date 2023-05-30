package org.example;

import java.util.Map;

public class ascii_to_other {
    // String to Decimal (ASCII)
    public static int letterToAscii(char letter) {
        return Character.getNumericValue(letter);
    }

    // Ascii to Hexadecimal
    public static String asciiToHexa(int ascii) {
        StringBuilder hexa = new StringBuilder();
            while (ascii > 0) {
                int x = ascii % 16;
                char c = getHexa(x);
                hexa.insert(0, c);
                ascii /= 16;
            }
            if (hexa.length() == 0) {
                hexa.append('0');
            }
        return hexa.toString();
    }

    private static char getHexa(int value) {
        if (value >= 0 && value < 10) {
            return (char) ('0' + value);
        } else {
            return (char) ('A' + value - 10);
        }
    }
    // Ascii to Octal

    public static String asciiToOctal(int ascii) {
        StringBuilder octal = new StringBuilder();

        while (ascii > 0) {
            int x = ascii % 8;
            octal.insert(0, x);
            ascii /= 8;
        }

        if (octal.length() == 0) {
            octal.append('0');
        }
        return octal.toString();
    }

    // Ascii to Binary
    public static String asciiToBinary(int ascii) {
        StringBuilder binary = new StringBuilder();

        while (ascii > 0) {
            int remainder = ascii % 2;
            binary.insert(0, remainder);
            ascii /= 2;
        }

        if (binary.length() == 0) {
            binary.append('0');
        }
        return binary.toString();
    }



}
