package com.nibesh.test;

import java.util.Scanner;

/**
 * Created by nibesh on 4/12/17.
 */
public class CelFerCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("what do you want to convert?");
            System.out.println("If you want to convert Farenite to Centigrate press C ");
            System.out.println("If you want to convert Centigrate to Farenite press F ");
            System.out.println("press Q if want to stop");

            String operation = sc.next();


            if (operation.equals("C") || operation.equals("c")) {

                System.out.println("Enter the  farenite value u convert=");
                double value = sc.nextDouble();
                double c = ((value - 32) * 5) / 9;
                System.out.println("The centigrate value of " + value + " is " + c);
            } else if (operation.equals("F") || operation.equals("f")) {

                System.out.println("Enter the centigrate value u convert=");
                double centigrate = sc.nextDouble();
                double f = ((centigrate*9) / 5) + 32;
                System.out.println("The Farenite value of " + centigrate + " is " + f);
            }
            else if (operation.equals("Q")|| operation.equals("q")){
                System.exit(0);


            }



        }

    }
}
