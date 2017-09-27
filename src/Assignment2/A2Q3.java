/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author goodm9679
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A2Q3 = new City();
        Robot Sam = new Robot(A2Q3, -10, -10, Direction.NORTH);
        while(Sam.getStreet()>0){
            while(Sam.getDirection()!=Direction.NORTH){
                Sam.turnLeft();
            }
            Sam.move();
        }
        while(Sam.getStreet()<0){
            while(Sam.getDirection()!=Direction.SOUTH){
                Sam.turnLeft();
            }
            Sam.move();
        }
        while(Sam.getAvenue()>0){
            while(Sam.getDirection()!=Direction.WEST){
                Sam.turnLeft();
            }
            Sam.move();
        }
        while(Sam.getAvenue()<0){
            while(Sam.getDirection()!=Direction.EAST){
                Sam.turnLeft();
            }
            Sam.move();
        }
    }
}
