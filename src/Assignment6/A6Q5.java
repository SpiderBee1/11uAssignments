/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author goodm9679
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many marks are you going to enter?");
        int total = input.nextInt();
        if (total > 1) {
            System.out.println("Enter the " + total + " marks:");
            //array with two parts
            double[] array = new double[total];
            for (int i = 0; i < total; i++) {
                array[i] = input.nextDouble();
            }
            //interger stores the value of the first number being compared
            int x = 0;
            while (x < total) {
                for (int i = x; i < total; i++) {
                    if (array[x] > array[i]) {
                        //temporary value to allow switching numbers
                        double hold = array[x];
                        array[x] = array[i];
                        array[i] = hold;
                    }
                }
                x = x + 1;
            }
            System.out.print("arranged from lowest to highest, the order is ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i != array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(".");
            int med = total / 2;
            if (total % 2 == 0) {
                double ian = (array[med] + array[med-1])/2;
                System.out.println("The median is " + ian + ".");
            }else{
                System.out.println("The median is " + array[med] + ".");
            }
        } else {
            /**
             * this code is not required to make the program work with single
             * number orders, but i wanted to have some fun and give the program
             * some personality
             */
            System.out.println("seriously?");
            System.out.println("well, enter the mark I guess:");
            double stupid = input.nextDouble();
            System.out.println("the order of the marks is: " + stupid + ".");
            System.out.println("What a surprise.");
            System.out.println("the median is also " + stupid + ".");
        }
    }
}
