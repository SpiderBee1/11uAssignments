/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * by Matthew Goodman
 */
public class A7Q5 {

    public void chaotic(int maxPile, int rows) {
        if (maxPile * rows == 1339) {
            //just for fun
            System.out.println("                   *** *** *** ***\n"
                    + "               ***                 ***\n"
                    + "           ***                         ***\n"
                    + "        ***                               ***\n"
                    + "      ***                                   ***\n"
                    + "    ***              *         *              ***\n"
                    + "   ***               *         *               ***\n"
                    + "  ***                *         *                ***\n"
                    + " ***                 *         *                 ***\n"
                    + " ***                 *         *                 ***\n"
                    + " ***                                             ***\n"
                    + " ***                                             ***\n"
                    + " ***                                             ***\n"
                    + "  ***         **                     **         ***\n"
                    + "   ***          ***               ***          ***\n"
                    + "    ***            ***************            ***\n"
                    + "      ***                                   ***\n"
                    + "        **                                ***\n"
                    + "           ***                         ***\n"
                    + "               ***                 ***\n"
                    + "                   *** *** *** ***");
        } else {
            //an array to hold the asterisk that w
            String[] pile = new String[maxPile + 1];
            for (int i = 0; i < pile.length; i++) {
                for (int p = 0; p < i; p++) {
                    if (pile[i] == null) {
                        pile[i] = "*";
                    } else {
                        pile[i] = pile[i - 1] + "*";
                    }
                }
            }
            for (int i = 0; i < rows; i++) {
                //generates a random number of astericks
                System.out.println(pile[(int) (Math.random() * (maxPile - 1 + 1)) + 1]);
            }
        }
    }

    /**
     * 13 x 103 = 1339 :)
     */
    public static void main(String[] args) {
        System.out.println("You are running the SUPER asterisk randomizer. type \"Quit\" to quit");
        Scanner input = new Scanner(System.in);
        A7Q5 run = new A7Q5();
        //infinite loop
        while (true) {
            System.out.println("Enter the maximum number of astericks");
            String text = input.nextLine();
            if (text.equalsIgnoreCase("Quit")) {
                break;
            }
            //changes input text to an Integer
            int maxPile = Integer.parseInt(text);
            System.out.println("Enter the number of lines");
            text = input.nextLine();
            if (text.equalsIgnoreCase("Quit")) {
                break;
            }
            //changes input text to an integer
            int rows = Integer.parseInt(text);
            //run method
            run.chaotic(maxPile, rows);
        }
    }
}
