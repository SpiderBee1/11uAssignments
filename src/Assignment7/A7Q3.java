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
public class A7Q3 {

    public void factors(int parameter) {
        //begining of output statement
        System.out.print("The factors of " + parameter + " are: 1");
        //for statement checks every whole number less than the parameter
        for (int count = 2; count < parameter + 1; count++) {
            if (parameter % count == 0) {
                //outputs numbers which divide the parameter evenly
                System.out.print(", " + count);
            }
        }
        System.out.println(".");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        A7Q3 run = new A7Q3();
        //infinite loop
        while (true) {
            System.out.println("Enter an Interger. type \"Quit\" to quit");
            String text = input.nextLine();
            if (text.equalsIgnoreCase("Quit")) {
                break;
            } else {
                //changes input text to a integer
                int parameter = Integer.parseInt(text);
                //run method
                run.factors(parameter);
            }
        }
    }
}
