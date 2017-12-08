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
public class A7Q1 {

    public void circleArea(double radius) {
        //equation for area of a circle
        double area= Math.pow(radius, 2) * Math.PI;
        //output result
        System.out.println("The area of the circle is " + area);
    }

    /**
     * I did question 2 first by accident so i just ended up copying most of the code
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        A7Q1 run = new A7Q1();
        //infinite loop
        while (true) {
            System.out.println("Enter the radius of a circle. type \"Quit\" to quit");
            String text = input.nextLine();
            if (text.equalsIgnoreCase("Quit")) {
                break;
            } else {
                //changes input text to a double
                double radius = Double.parseDouble(text);
                //run method
                run.circleArea(radius);
            }
        }
    }
}
