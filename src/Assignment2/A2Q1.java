/*
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author goodm9679
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       City A2Q1 = new City();
       Robot Durv = new Robot(A2Q1, 1, 1, Direction.EAST);
       new Thing(A2Q1, 1, 2);
       new Thing(A2Q1, 1, 3);
       new Thing(A2Q1, 1, 4);
       new Thing(A2Q1, 1, 5);
       new Thing(A2Q1, 1, 6);
       new Thing(A2Q1, 1, 7);
       new Thing(A2Q1, 1, 8);
       new Thing(A2Q1, 1, 9);
       new Thing(A2Q1, 1, 10);
       new Thing(A2Q1, 1, 11);
       /**
        * hey guys it's durv here and today we are going to be counting down the
        * top 7 things about being on street 1 on an avenue lower than 12
        */
       while(Durv.getAvenue()<12){
           Durv.move();
           if(Durv.countThingsInBackpack()<7){
               Durv.pickThing();
           }
       }
    }
}
