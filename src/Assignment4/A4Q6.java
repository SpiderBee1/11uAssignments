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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //prompts the user to input the speed limit and creates a corresponding integer
        System.out.println("Enter the speed limit:");
        Scanner Limit = new Scanner(System.in);
        int limit = Limit.nextInt();
        //prompts the user to input the recorded speed and creates a corresponding integer
        System.out.println("Enter the Recorded speed of the car:");
        Scanner Speed = new Scanner(System.in);
        int speed = Speed.nextInt();
        //sequentially compares the recorded speed against the speed limit to determine the charge applied to the driver
        if (speed <= limit) {
            System.out.println("Driver is within speeding limit. No charges apply.");
        } else if (speed <= limit + 20) {
            System.out.println("The driver is speeding and the fine is $100");
        } else if (speed <= limit + 30) {
            System.out.println("The driver is speeding and the fine is $270");
        } else if (speed >= limit + 31) {
            System.out.println("The driver is speeding and the fine is $500");
        }
    }
}
