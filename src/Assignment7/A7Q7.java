/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author goodm9679
 */
public class A7Q7 {
//method calculates last "digit"(character) of so called "interger"(string) 

    public void lastDigit(String text) {
        if (text.charAt(0) == '-') {
            Character first = text.charAt(1);
            //output result
            System.out.println("the first digit is " + first + ".");
        } else {
            Character first = text.charAt(0);
            //output result
            System.out.println("the first digit is " + first + ".");
        }
    }

    /**
     * this question is the same as question 6 apart from a few changes
     */
    public static void main(String[] args) {
        System.out.println("You are running the First Digit finder. type \"Quit\" to quit");
        Scanner input = new Scanner(System.in);
        A7Q7 run = new A7Q7();
        //infinite loop
        while (true) {
            System.out.println("Enter an integer.");
            String text = input.nextLine();
            if (text.equalsIgnoreCase("Quit")) {
                //end the program
                break;
            }
            //run method last digit
            run.lastDigit(text);
        }
    }
}
