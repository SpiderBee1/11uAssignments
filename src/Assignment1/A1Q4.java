/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author goodm9679
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A1Q4 = new City();
        new Wall(A1Q4, 0, 1, Direction.WEST);
        new Wall(A1Q4, 1, 1, Direction.WEST);
        new Wall(A1Q4, 1, 1, Direction.SOUTH);
        Robot Xo = new Robot(A1Q4, 0, 0, Direction.SOUTH);
        Robot Yo = new Robot(A1Q4, 0, 1, Direction.SOUTH);
        Yo.move();
        Xo.move();
        Yo.turnLeft();
        Yo.move();
        Xo.move();
        Yo.turnLeft();
        Yo.turnLeft();
        Yo.turnLeft();
        Yo.move();
        Xo.turnLeft();
        Xo.move();
        Yo.turnLeft();
        Yo.turnLeft();
        Yo.turnLeft();
        Yo.move();
    }
}
