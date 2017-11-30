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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("How many students are in the class?");
        Scanner input = new Scanner(System.in);
        //variable records the total number of students
        int total = input.nextInt();
        //array holds marks for each student
        int[] studentNum = new int[total];
        System.out.println("Enter the marks");
        //gets an integer from the user for every student one by one
        for (int i = 0; i < total; i++) {
            studentNum[i] = input.nextInt();
        }
        double average = 0;
        //adds the marks th the average one by one 
        for (int i = 0; i < total; i++) {
            average = average + studentNum[i];
        }
        //divides the combined total of all students by the number of students to find average
        average = average / total;
        System.out.println("The class average is " + average);
    }
}
