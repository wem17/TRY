package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class numAFormat {
    public static void testNumbers(String numbers) {
        //This is to get a valid response from user input instead of an error message
        try {
            new Double(numbers);
            System.out.println(numbers + " is a floating-point number, please enter an integer.");
            return;
        } catch (Exception notAFloat) {
            System.out.println(numbers + " is not a number at all, please enter 3 integers.");
        }
        try {
            new ArrayList<>(3);
            System.out.println("You did not type in 3 integers try again" + numbers);
            return;
        } catch (Exception e) {
            System.out.println("You did not type in 3 integers try again" + numbers);
        }
    }
}

