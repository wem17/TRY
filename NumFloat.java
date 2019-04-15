package com.company;

public class NumFloat {
    public static void testNum(String num) {
        try {
            new Integer(num);
            System.out.println(num + " is an integer please enter a float.");
            return;
        } catch (Exception notAFloat) {
            System.out.println(num + " is not a number at all, please enter a float.");
        }
    }
}
