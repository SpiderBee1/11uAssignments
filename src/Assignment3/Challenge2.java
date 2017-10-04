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
public class Challenge2 {

    /**
     * I made Langton's ant!
     */
    public static void main(String[] args) {
        City Lang = new City();
        Robot Ant = new Robot(Lang, 25, 25, Direction.EAST, 1000);
        Robot Ant2 = new Robot(Lang, 28, 26, Direction.SOUTH, 1000);
        Robot Ant3 = new Robot(Lang, 25, 26, Direction.EAST, 1000);
        Robot Ant4 = new Robot(Lang, 28, 26, Direction.NORTH, 1000);
        while (Ant.getCity() == Lang) {
            if (Ant.canPickThing() == true) {
                Ant.pickThing();
                Ant.turnLeft();
                Ant.move();
            } else {
                Ant.putThing();
                Ant.turnLeft();
                Ant.turnLeft();
                Ant.turnLeft();
                Ant.move();
            }
            if (Ant2.canPickThing() == true) {
                Ant2.pickThing();
                Ant2.turnLeft();
                Ant2.move();
            } else {
                Ant2.putThing();
                Ant2.turnLeft();
                Ant2.turnLeft();
                Ant2.turnLeft();
                Ant2.move();
            }
            if (Ant3.canPickThing() == true) {
                Ant3.pickThing();
                Ant3.turnLeft();
                Ant3.move();
            } else {
                Ant3.putThing();
                Ant3.turnLeft();
                Ant3.turnLeft();
                Ant3.turnLeft();
                Ant3.move();
            }
            if (Ant4.canPickThing() == true) {
                Ant4.pickThing();
                Ant4.turnLeft();
                Ant4.move();
            } else {
                Ant4.putThing();
                Ant4.turnLeft();
                Ant4.turnLeft();
                Ant4.turnLeft();
                Ant4.move();
            }
        }
    }
}

