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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a unit in inches to be converted into centimeters");     
        //create a scanner for input
        Scanner Input = new Scanner(System.in);
        //get value from user
        double inches = Input.nextDouble();
        //new variable based on old variable
        double centimeters = 2.54 * inches;
        //displays the results
        System.out.println(inches + " inches converts to " + centimeters + " centimeters.");
    }
}
