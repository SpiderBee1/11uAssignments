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
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what number are you measuring to?");
        int max = input.nextInt();
        //make an array where every number is the same as it's value
        int[] array = new int[max + 1];
        boolean[] prime = new boolean[max + 1];
        for (int i = 0; i < max + 1; i++) {
            array[i] = i;
            prime[i] = true;
        }
        //for every number between 2 and the max
        for (int i = 2; i < max + 1; i++) {
            //that is not a multiple of numbers already checked 
            if (prime[i] == true) {
                //multiply by every number between two and max, whose product is less than the highest number in the number array
                for (int p = 2; p * array[i] < max + 1; p++) {
                    //and set that number's position in the prime array to false
                    prime[p * array[i]] = false;
                }
            }
        }
        //variable to count primes. this allows me to add a period after the last number
        int count = 0;
        //check every position in array and count primes
        for (int i = 2; i < max + 1; i++) {
            if (prime[i] == true) {
                count = count + 1;
            }
        }
        //hold the value of how many primes are in the current row. it starts at 8 because it makes the first line look clean
        int roll = 8;
        int tally = 1;
        //lists the prime numbers
        System.out.print("The prime numbers between 2 and " + max + " are: ");
        for (int i = 2; i < max + 1; i++) {
            if (prime[i] == true) {
                //continues list on next line, unless it is the last number in the list, preventing the period from being printed on the next line
                if (roll == 10) {
                    if (tally != count) {
                        System.out.println(array[i]);
                    } else {
                        System.out.print(array[i]);
                    }
                    roll = 0;
                    //continues the list on the same line
                } else {
                    System.out.print(array[i]);
                    if (tally != count) {
                        System.out.print(", ");
                        roll = roll + 1;
                    }
                }
                tally = tally + 1;
            }
        }
        System.out.println(".");
        //how to be funny 2017
        if (count >= 1339) {
            System.out.println("That was easy");
        }
    }
}
