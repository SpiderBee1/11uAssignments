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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers:");
        //array with ten parts
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        int x = 0;
        while (x < 10) {
            for (int i = x; i < 10; i++) {
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
    }
}
