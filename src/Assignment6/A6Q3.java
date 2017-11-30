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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers:");
        //array with two parts
        int[] array = new int[2];
        //defines first number
        array[0] = input.nextInt();
        //defines second number
        array[1] = input.nextInt();
        //'rotates' numbers so they are in ascending order
        if(array[1] < array[0]){
            //temporary integer to allow switching numbers
            int hold = array[1];
            array[1] = array[0];
            array[0] = hold;
        }
        System.out.println("the numbers in ascending order are: " + array[0] + " " + array[1]);
    }
}
