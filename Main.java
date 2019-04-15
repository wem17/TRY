package com.company;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 1;

        do {
            System.out.println("Enter an integer: ");
            Scanner scnr = new Scanner(System.in);
            NumberFormat.testNumber(scnr.next());
            if (scnr.hasNextInt()) {
                System.out.println("Result = " + scnr.next());
                x = 2;
            }

            System.out.println("Enter a float: ");
            Scanner scn = new Scanner(System.in);
            NumFloat.testNum(scn.next());
            if (scn.hasNextFloat()) {
                System.out.println("Result = " + scn.next());
                x = 2;
            }

            System.out.println("Enter a String: ");
            Scanner sc = new Scanner(System.in);
            StrFormat.testlet(sc.next());
            if (sc.hasNextLine()) {
                System.out.println("String = " + sc.next());
                x = 2;
            }

            System.out.println("Enter 3 integers: ");
            Scanner s = new Scanner(System.in);
            numAFormat.testNumbers(s.next());
            if (s.hasNextInt()) {
                System.out.println("Your 3 integers = " + s.next());
                x = 2;
            }
        }while (x == 1) ;
        {
        }
    }
}
