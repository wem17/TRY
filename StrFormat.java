package com.company;

public class StrFormat {
    public static void testlet(String letter) {
        try {
            new Integer(letter);
            System.out.println(letter + " is a number, please enter a String.");
            return;
        } catch (Exception notAString) {
            System.out.println(letter + " is not a String at all, please enter a String.");
        }
    }
    }
