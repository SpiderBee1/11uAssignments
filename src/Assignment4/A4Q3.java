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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please type four numbers on 4 different lines");
        //creates four scanners, one four each line
        Scanner LineA = new Scanner(System.in);
        Scanner LineB = new Scanner(System.in);
        Scanner LineC = new Scanner(System.in);
        Scanner LineD = new Scanner(System.in);
        //creates four variables, one for each line
        double uno = LineA.nextDouble();
        double duo = LineB.nextDouble();
        double trio = LineC.nextDouble();
        double quattro = LineD.nextDouble();
        //outputs the four values on one line
        System.out.println("You typed " + uno + ", " + duo + ", " + trio + ", and " + quattro);
    }
}
