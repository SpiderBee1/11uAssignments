/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 */
public class A7Q8 {
    //method to check if the digits of a number are odd

    public void allDigitsOdd(String text) throws InterruptedException {

        for (int i = 0; i < text.length(); i++) {
            //I Needed to make it a string even though it only needs to be a character
            //parseInt doesn't like characters
            String digit = "" + text.charAt(i);
            int val = 0;
            //unnescesarry but easy to implement
            if (text.charAt(i) == '-' && i == 0) {
                System.out.println("I asked for a POSITIVE number but, okay.");
                //prevents division checker from getting confused and dying if the number is negative
                val = val * -1;
            } else {
                val = Integer.parseInt(digit);
                //division checker
                if (val % 2 != 1) {
                    System.out.println("False");
                    Thread.sleep(100);
                    System.out.println("This number contains even digits.");
                    Thread.sleep(100);
                    break;
                }
                //end of for statement is built into the for statement because otherwise it will print true every time
                if (i == text.length() - 1) {
                    System.out.println("true");
                    Thread.sleep(100);
                    System.out.println("Every digit is odd");
                    Thread.sleep(100);
                }
            }
        }
    }

    /**
     * this question makes the least sense to use a method for
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("You are now running the odd digits number tester. type \"Quit\" to quit");
        Scanner input = new Scanner(System.in);
        A7Q8 run = new A7Q8();
        //infinite loop
        while (true) {
            System.out.println("Enter an positive integer.");
            String text = input.nextLine();
            if (text.equalsIgnoreCase("Quit")) {
                break;
            } else {
                //run the method
                //there isn't a need to change the string to a interger
                run.allDigitsOdd(text);
            }
        }
    }
}
