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
public class A6Q2 {

    /**
     * the majority of this code is copied from question 1 because question 2
     * essentially contains question 1 with some additional steps
     */
    public static void main(String[] args) {
        System.out.println("How many people are in the focus group?");
        Scanner input = new Scanner(System.in);
        //variable records the total number of participants
        int total = input.nextInt();
        //array holds marks for each participant
        int[] participantNum = new int[total];
        System.out.println("Enter the heights");
        //gets an integer from the user for every participant one by one
        for (int i = 0; i < total; i++) {
            participantNum[i] = input.nextInt();
        }
        double average = 0;
        //adds the marks to the average one by one 
        for (int i = 0; i < total; i++) {
            average = average + participantNum[i];
        }
        //divides the combined total of all participants by the number of participants to find average
        average = average / total;
        System.out.println("The average height is " + average);
        System.out.println("The heights that are above average are:");
        int p = 0;
        //checks participants one by one
        for (int i = 0; i < total; i++) {
            //compares the height to the average
            if (participantNum[i] > average) {
                //above average heights are printed for the user
                System.out.println(participantNum[i]);
                p = p + 1;
            }
        }
        //special output for a list of identical numbers
        if (p == 0) {
            System.out.println("None!");
        }

    }
}
