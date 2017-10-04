/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author goodm9679
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the city
        City a3Q1 = new City();
        //build the block
        new Wall(a3Q1, 1, 1, Direction.NORTH);
        new Wall(a3Q1, 1, 1, Direction.WEST);
        new Wall(a3Q1, 1, 2, Direction.EAST);
        new Wall(a3Q1, 1, 2, Direction.NORTH);
        new Wall(a3Q1, 2, 2, Direction.SOUTH);
        new Wall(a3Q1, 2, 2, Direction.EAST);
        new Wall(a3Q1, 2, 1, Direction.SOUTH);
        new Wall(a3Q1, 2, 1, Direction.WEST);
        Robot uno = new Robot(a3Q1, 0, 2, Direction.WEST);
        //create an integer for counting corners
        int quart = 0;
        //does a quarter of the rotation 8 times then stops
        while (quart < 8) {
            uno.move();
            uno.move();
            uno.turnLeft();
            uno.move();
            quart = quart + 1;
        }
    }
}