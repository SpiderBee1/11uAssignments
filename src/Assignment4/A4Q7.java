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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        //creates an integer to track the tile that the player is on
        int square = 1;
        //this code will end the program when the player wins the game
        while(square < 100){
            System.out.println("You are now on square " + square);
            System.out.println("what was your roll?");
            Scanner Roll = new Scanner(System.in);
            int roll = Roll.nextInt();
            if(!(roll < 2 || roll > 12)){
                    square = square + roll;
            }else{
                //allows me to test the snakes and ladders easily
                if(roll == 1339){
                    System.out.println("dev mode active. enter a square to move to");
                    Scanner Dev = new Scanner(System.in);
                    square = Dev.nextInt();
                }else{
                //the code to make the game quit on a false roll that is not 1339 (I made it sassy)
                Thread.sleep(100);
                System.out.println("...");
                Thread.sleep(2000);
                System.out.println("seriously?");
                Thread.sleep(2000);
                System.out.println("play again when you learn to count...");
                break;
                }
            } 
            //snake that moves player from 54 to 19
            if(square == 54){
                square = 19;
                System.out.println("You landed on a snake!");
            }
            //snake that moves player from 90 to 48
            if(square == 90){
                square = 48;
                System.out.println("You landed on a snake!");
            }
            //snake that moves player from 99 to 77
            if(square == 99){
                square = 77;
                System.out.println("You landed on a snake!");
            }
            //ladder that moves player from 9 to 34
            if(square == 9){
                square = 34;
                System.out.println("You landed on a ladder!");
            }
            //ladder that moves player from 40 to 64
            if(square == 40){
                square = 64;
                System.out.println("You landed on a ladder!");
            }
            //ladder that moves player from 67 to 86
            if(square == 67){
                square = 86;
                System.out.println("You landed on a ladder!");
            }
            if(square >= 100){
                System.out.println("You Won!");
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
            }
        }
    }
}
