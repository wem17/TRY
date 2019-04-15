package com.company;

public class NumberFormat {
    public static void testNumber(String number) {
            //This is to get a valid response from user input instead of an error message
            try {
                    new Double(number);
                    System.out.println(number + " is a floating-point number, please enter an integer.");
                    return;
                } catch (NumberFormatException notAFloat) {
                    System.out.println(number + " is not a number at all, please enter an integer.");
                }
            }
    }

