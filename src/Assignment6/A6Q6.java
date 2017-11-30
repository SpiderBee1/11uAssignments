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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many students are in the class?");
        int total = input.nextInt();
        System.out.println("Enter the  marks for the " + total + " students:");
        //array with chosen number of spots
        double[] array = new double[total];
        for (int i = 0; i < total; i++) {
            array[i] = input.nextDouble();
        }
        //interger stores the value of the first number being compared
        int x = 0;
        while (x < total) {
            for (int i = x; i < total; i++) {
                //checks if numbers are in the wrong order, and switches if so
                if (array[x] > array[i]) {
                    //temporary value to allow switching numbers
                    double hold = array[x];
                    array[x] = array[i];
                    array[i] = hold;
                }
            }
            x = x + 1;
        }
        //outputs the results
        System.out.println("The lowest mark is " + array[0] + ".");
        System.out.println("The highest mark is " + array[total-1] + ".");
        double average = 0;
        //adds the marks to the average one by one 
        for (int i = 0; i < total; i++) {
            average = average + array[i];
        }
        //divides the combined total of all marks by the number of students to find average
        average = average / total;
        System.out.println("The average is " + average + ".");
    }
}

