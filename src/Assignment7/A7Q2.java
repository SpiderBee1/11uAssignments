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
public class A7Q2 {

    //method for calculating grade
    public void grader(double mark) {
        String grade = "";
        //coin sorter. value slids down track until it falls into a hole it fits into
        if (mark < 50) {
            grade = "F";
        } else if (mark >= 50 && mark < 60) {
            grade = "D";
        } else if (mark >= 60 && mark < 70) {
            grade = "C";
        } else if (mark >= 70 && mark < 80) {
            grade = "B";
        } else if (mark >= 80) {
            grade = "A";
        }
        System.out.println(grade);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        A7Q2 run = new A7Q2();
        //infinite loop
        while (true) {
            System.out.println("Enter a mark. type \"Quit\" to quit");
            String text = input.nextLine();
            if (text.equalsIgnoreCase("Quit")) {
                break;
            } else {
                //changes input text to a double
                double mark = Double.parseDouble(text);
                //run method
                run.grader(mark);
            }
        }
    }
}
