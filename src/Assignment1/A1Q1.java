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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A1Q1 = new City();
        new Wall(A1Q1, 1, 1, Direction.NORTH);
        new Wall(A1Q1, 1, 1, Direction.WEST);
        new Wall(A1Q1, 1, 2, Direction.EAST);
        new Wall(A1Q1, 1, 2, Direction.NORTH);
        new Wall(A1Q1, 2, 2, Direction.SOUTH);
        new Wall(A1Q1, 2, 2, Direction.EAST);
        new Wall(A1Q1, 2, 1, Direction.SOUTH);
        new Wall(A1Q1, 2, 1, Direction.WEST);
        Robot Uno = new Robot(A1Q1, 0, 2, Direction.WEST);
        Uno.move();
        Uno.move();
        Uno.turnLeft();
        Uno.move();
        Uno.move();
        Uno.move();
        Uno.turnLeft();
        Uno.move();
        Uno.move();
        Uno.move();
        Uno.turnLeft();
        Uno.move();
        Uno.move();
        Uno.move();
        Uno.turnLeft();
        Uno.move();
        
    }
}
