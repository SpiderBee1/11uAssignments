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
public class A4Q5 {

    /**
     * variables are named based on the number of the test and ended by a letter.
     * T = total (total available marks for the test)
     * S = score (how many marks you get)
     * P = percent 
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Please enter your name");
        Scanner Name = new Scanner(System.in);
        String name = Name.nextLine();
        
        System.out.println("What was the first test out of?");
        Scanner OneT = new Scanner(System.in);
        double oneT = OneT.nextDouble();
        System.out.println("What mark did you get?");
        Scanner OneS = new Scanner(System.in);
        double oneS = OneS.nextDouble();
        double oneP = oneS/oneT *100;
        
        System.out.println("What was the second test out of?");
        Scanner TwoT = new Scanner(System.in);
        double twoT = TwoT.nextDouble();
        System.out.println("What mark did you get?");
        Scanner TwoS = new Scanner(System.in);
        double twoS = TwoS.nextDouble();
        double twoP = twoS/twoT *100;
        
        System.out.println("What was the third test out of?");
        Scanner ThreeT = new Scanner(System.in);
        double threeT = ThreeT.nextDouble();
        System.out.println("What mark did you get?");
        Scanner ThreeS = new Scanner(System.in);
        double threeS = ThreeS.nextDouble();
        double threeP = threeS/threeT *100;
        
        System.out.println("What was the fourth test out of?");
        Scanner FourT = new Scanner(System.in);
        double fourT = FourT.nextDouble();
        System.out.println("What mark did you get?");
        Scanner FourS = new Scanner(System.in);
        double fourS = FourS.nextDouble();
        double fourP = fourS/fourT *100;
        
        System.out.println("What was the fith test out of?");
        Scanner FiveT = new Scanner(System.in);
        double fiveT = FiveT.nextDouble();
        System.out.println("What mark did you get?");
        Scanner FiveS = new Scanner(System.in);
        double fiveS = FiveS.nextDouble();
        double fiveP = fiveS/fiveT *100;
        
        System.out.println("Test scores for " + name);
        System.out.println("Test 1: " + oneP + "%");
        System.out.println("Test 2: " + twoP + "%");
        System.out.println("Test 3: " + threeP + "%");
        System.out.println("Test 4: " + fourP + "%");
        System.out.println("Test 5: " + fiveP + "%");
        
        double average = oneP/5 + twoP/5 + threeP/5 + fourP/5 + fiveP/5 ;
        System.out.println("Average: " + average + "%");
        Thread.sleep(5000);
        if(average>= 70){
            System.out.println("Nice grades!");
            System.out.println(
"             ___________\n" +
"            '._==_==_=_.'\n" +
"            .-\\:      /-.\n" +
"           | (|:.     |) |\n" +
"            '-|:.     |-'\n" +
"              \\::.    /\n" +
"               '::. .'\n" +
"                 ) (\n" +
"               _.' '._\n" +
"              `\"\"\"\"\"\"\"`");
        }else{
            System.out.println("Try harder!");
        }
        
    }
}
