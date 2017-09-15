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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A1Q5 = new City();
        new Wall(A1Q5, 3, 3, Direction.SOUTH);
        new Wall(A1Q5, 3, 3, Direction.EAST);
        new Wall(A1Q5, 2, 3, Direction.EAST);
        new Wall(A1Q5, 2, 3, Direction.NORTH);
        new Wall(A1Q5, 2, 3, Direction.WEST);
        new Thing(A1Q5, 2, 2);
        new Thing(A1Q5, 1, 2);
        new Thing(A1Q5, 1, 1);
        new Thing(A1Q5, 1, 0);
        new Thing(A1Q5, 0, 0);
        Robot Maria = new Robot(A1Q5, 0, 1, Direction.WEST);
        Maria.setLabel("M");
        Robot Karel = new Robot(A1Q5, 3, 3, Direction.EAST);
        Karel.setLabel("K");
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Maria.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Maria.pickThing();
        Maria.turnLeft();
        Maria.move();
        Karel.pickThing();
        Karel.move();
        Maria.pickThing();
        Maria.turnLeft();
        Maria.move();
        Karel.pickThing();
        Karel.turnLeft();
        Maria.pickThing();
    }
}
