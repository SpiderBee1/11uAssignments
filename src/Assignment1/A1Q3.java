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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A1Q3 = new City();
        new Wall(A1Q3, 3, 2, Direction.WEST);
        new Wall(A1Q3, 3, 2, Direction.NORTH);
        new Wall(A1Q3, 2, 3, Direction.WEST);
        new Wall(A1Q3, 1, 3, Direction.WEST);
        new Wall(A1Q3, 1, 3, Direction.NORTH);
        new Wall(A1Q3, 1, 3, Direction.EAST);
        new Wall(A1Q3, 2, 4, Direction.NORTH);
        new Wall(A1Q3, 2, 4, Direction.EAST);
        new Wall(A1Q3, 3, 4, Direction.EAST);
        new Thing(A1Q3, 3, 1);
        Robot Trio = new Robot(A1Q3, 3, 0, Direction.EAST);
        Trio.move();
        Trio.pickThing();
        Trio.turnLeft();
        Trio.move();
        Trio.turnLeft();
        Trio.turnLeft();
        Trio.turnLeft();
        Trio.move();
        Trio.turnLeft();
        Trio.move();
        Trio.move();
        Trio.turnLeft();
        Trio.turnLeft();
        Trio.turnLeft();
        Trio.move();
        Trio.putThing();
        Trio.move();
        Trio.turnLeft();
        Trio.turnLeft();
        Trio.turnLeft();
        Trio.move();
        Trio.turnLeft();
        Trio.move();
        Trio.turnLeft();
        Trio.turnLeft();
        Trio.turnLeft();
        Trio.move();
        Trio.move();
        Trio.turnLeft();
        
    }
}
