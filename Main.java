package com.company;

/*  
Project: Lab 13
Purpose Details: TRY CATCH EXCEPTION
Course: IST 242 
Author:Wilmer Monsalve 
Date Developed:4-13-19 
Last Date Changed:4-13-19 
Revision:Yes 
*/ 

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 1;

        //will iterate until user inputs correct integer
        do {
            System.out.println("Enter an integer: ");
            Scanner scnr = new Scanner(System.in);
            NumberFormat.testNumber(scnr.next());
            if (scnr.hasNextInt()) {
                System.out.println("Result = " + scnr.next());
                x = 2;
            }
            //will iterate until user inputs correct float

            System.out.println("Enter a float: ");
            Scanner scn = new Scanner(System.in);
            NumFloat.testNum(scn.next());
            if (scn.hasNextFloat()) {
                System.out.println("Result = " + scn.next());
                x = 2;
            }
            //will iterate until user inputs correct string

            System.out.println("Enter a String: ");
            Scanner sc = new Scanner(System.in);
            StrFormat.testlet(sc.next());
            if (sc.hasNextLine()) {
                System.out.println("String = " + sc.next());
                x = 2;
            }
            //will iterate until user inputs correct array integers
            System.out.println("Enter 3 integers: ");
            Scanner s = new Scanner(System.in);
            numAFormat.testNumbers(s.next());
            if (s.hasNextInt()) {
                ArrayList<length>
                System.out.println("Your 3 integers = " + s.next());
                x = 2;
            }

        }while (x == 1) ;
        {
        }
    }
}
