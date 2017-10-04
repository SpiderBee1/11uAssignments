/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author goodm9679
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City farm = new City();
        Robot dan = new Robot(farm, 1, 1, Direction.EAST, 20);
        //interger for how many seeds have been planted
        int seed = 0;
        //tells dan when to stop
        while (dan.countThingsInBackpack() > 0) {
            //move five spaces, planting five seeds along the way
            while (seed < 5) {
                dan.putThing();
                dan.move();
                seed = seed + 1;
            }
            //decides which way to turn so dan gets back to the feild
            if (dan.getDirection() == Direction.WEST) {
                dan.turnLeft();
                dan.move();
                dan.turnLeft();
                dan.move();
            } else {
                while (dan.getDirection() != Direction.SOUTH) {
                    dan.turnLeft();
                }
                dan.move();
                while (dan.getDirection() != Direction.WEST) {
                    dan.turnLeft();
                }
                dan.move();
            }
            //reset seed count to 0
            seed = 0;
        }
    }
}
