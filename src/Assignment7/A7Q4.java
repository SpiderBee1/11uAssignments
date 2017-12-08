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
public class A7Q4 {

    public void compoundIntrest(double initPrin, double intRate, int years) {
        double balance = initPrin * Math.pow(1 + intRate, years);
        System.out.println("The balance after " + years + " years is $" + balance);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        A7Q4 run = new A7Q4();
        System.out.println("You are now running the compound intrest calculator. type \"Quit\" to quit");
        //infinite loop
        while (true) {
            System.out.println("Enter the initial principal.");
            String text = input.nextLine();
            if (text.equalsIgnoreCase("Quit")) {
                break;
            }
            //changes input text to a double
            double initPrin = Double.parseDouble(text);

            System.out.println("Enter the intrest rate.");
            text = input.nextLine();
            if (text.equalsIgnoreCase("Quit")) {
                break;
            }
            //changes input text to a double as a percent
            double intRate = Double.parseDouble(text) * 0.01;

            System.out.println("how many years?");
            text = input.nextLine();
            if (text.equalsIgnoreCase("Quit")) {
                break;
            }
            //changes input text to a integer
            int years = Integer.parseInt(text);
            //run method compound intrest
            run.compoundIntrest(initPrin, intRate, years);
        }
    }
}
