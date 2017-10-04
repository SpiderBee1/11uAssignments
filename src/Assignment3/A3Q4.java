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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City a3Q4 = new City();
        Robot tron = new Robot(a3Q4, 3, 3, Direction.SOUTH);
        //walls facing north
        new Wall(a3Q4, 1, 1, Direction.NORTH);
        new Wall(a3Q4, 1, 2, Direction.NORTH);
        new Wall(a3Q4, 1, 4, Direction.NORTH);
        new Wall(a3Q4, 1, 5, Direction.NORTH);
        new Wall(a3Q4, 4, 1, Direction.NORTH);
        new Wall(a3Q4, 4, 2, Direction.NORTH);
        new Wall(a3Q4, 4, 4, Direction.NORTH);
        new Wall(a3Q4, 4, 5, Direction.NORTH);
        //walls facing east
        new Wall(a3Q4, 1, 2, Direction.EAST);
        new Wall(a3Q4, 2, 2, Direction.EAST);
        new Wall(a3Q4, 4, 2, Direction.EAST);
        new Wall(a3Q4, 5, 2, Direction.EAST);
        new Wall(a3Q4, 1, 5, Direction.EAST);
        new Wall(a3Q4, 2, 5, Direction.EAST);
        new Wall(a3Q4, 4, 5, Direction.EAST);
        new Wall(a3Q4, 5, 5, Direction.EAST);
        //walls facing south
        new Wall(a3Q4, 2, 1, Direction.SOUTH);
        new Wall(a3Q4, 2, 2, Direction.SOUTH);
        new Wall(a3Q4, 2, 4, Direction.SOUTH);
        new Wall(a3Q4, 2, 5, Direction.SOUTH);
        new Wall(a3Q4, 5, 1, Direction.SOUTH);
        new Wall(a3Q4, 5, 2, Direction.SOUTH);
        new Wall(a3Q4, 5, 4, Direction.SOUTH);
        new Wall(a3Q4, 5, 5, Direction.SOUTH);
        //walls facing west
        new Wall(a3Q4, 1, 1, Direction.WEST);
        new Wall(a3Q4, 2, 1, Direction.WEST);
        new Wall(a3Q4, 4, 1, Direction.WEST);
        new Wall(a3Q4, 5, 1, Direction.WEST);
        new Wall(a3Q4, 1, 4, Direction.WEST);
        new Wall(a3Q4, 2, 4, Direction.WEST);
        new Wall(a3Q4, 4, 4, Direction.WEST);
        new Wall(a3Q4, 5, 4, Direction.WEST);
        //integer for counting how many blocks it has finished
        int quart = 0;
        //integer for how many corners it has made per block
        int corner = 0;
        //robot instructions
        while (quart < 4) {
            tron.move();
            tron.move();
            tron.move();
            //turns left only when the robot is not in the center of the grid
            if (corner != 3) {
                tron.turnLeft();
                corner = corner + 1;
            } else {
                corner = 0;
                quart = quart + 1;
            }
        }
    }
}
