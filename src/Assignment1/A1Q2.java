/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author goodm9679
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A1Q2 = new City();
        new Wall(A1Q2, 1, 1, Direction.NORTH);
        new Wall(A1Q2, 1, 1, Direction.WEST);
        new Wall(A1Q2, 1, 2, Direction.EAST);
        new Wall(A1Q2, 1, 2, Direction.SOUTH);
        new Wall(A1Q2, 1, 2, Direction.NORTH);
        new Wall(A1Q2, 2, 1, Direction.SOUTH);
        new Wall(A1Q2, 2, 1, Direction.WEST);
        new Thing(A1Q2, 2, 2);
        Robot Duo = new Robot(A1Q2, 1, 2, Direction.SOUTH);
        Duo.turnLeft();
        Duo.turnLeft();
        Duo.turnLeft();
        Duo.move();
        Duo.turnLeft();
        Duo.move();
        Duo.turnLeft();
        Duo.move();
        Duo.pickThing();
        Duo.turnLeft();
        Duo.turnLeft();
        Duo.move();
        Duo.turnLeft();
        Duo.turnLeft();
        Duo.turnLeft();
        Duo.move();
        Duo.turnLeft();
        Duo.turnLeft();
        Duo.turnLeft();
        Duo.move();
        Duo.turnLeft();
        Duo.turnLeft();
        Duo.turnLeft();
        
        
    }
}
