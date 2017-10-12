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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //six questions with a scanner and variable for each
        System.out.println("How much does the food for prom cost?");
        Scanner Food = new Scanner(System.in);
        double food = Food.nextDouble();
        System.out.println("How much does the DJ cost?");
        Scanner DJ = new Scanner(System.in);
        double dj = DJ.nextDouble();
        System.out.println("How much does it cost to rent the hall?");
        Scanner Hall = new Scanner(System.in);
        double hall = Hall.nextDouble();
        System.out.println("How much do decorations cost?");
        Scanner Deco = new Scanner(System.in);
        double deco = Deco.nextDouble();
        System.out.println("How much does it cost for staff");
        Scanner Staff = new Scanner(System.in);
        double staff = Staff.nextDouble();
        System.out.println("How much for miscelaneous costs?");
        Scanner Misc = new Scanner(System.in);
        double misc = Misc.nextDouble();
        //calculates total cost
        double total = food + dj + hall + deco + staff + misc;
        //calculates number of tickets required
        double tickets = total / 35;
        //rounds the numeber of tickets to an integer
        int explained = (int) Math.ceil(tickets);
        //give user results of calculation
        System.out.println("You need to sell " + explained + " tickets to make your money back for prom");
    }
}
