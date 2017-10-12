/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author goodm9679
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ask name
        System.out.println("What is your name?");
        //create a scanner for input
        Scanner Input = new Scanner(System.in);
        //name variable
        String handle = Input.nextLine();
        //output the variable
        System.out.println("welcome to java " + handle + "!");
    }
}
