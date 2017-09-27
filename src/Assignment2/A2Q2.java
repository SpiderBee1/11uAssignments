/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author goodm9679
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A2Q2 = new City();
        new Wall(A2Q2, 1, 0, Direction.SOUTH);
        new Wall(A2Q2, 1, 1, Direction.SOUTH);
        new Wall(A2Q2, 1, 2, Direction.SOUTH);
        new Wall(A2Q2, 1, 3, Direction.SOUTH);
        new Wall(A2Q2, 1, 4, Direction.SOUTH);
        new Wall(A2Q2, 1, 5, Direction.SOUTH);
        new Wall(A2Q2, 1, 6, Direction.SOUTH);
        new Wall(A2Q2, 1, 7, Direction.SOUTH);
        new Wall(A2Q2, 1, 8, Direction.SOUTH);
        new Wall(A2Q2, 1, 0, Direction.EAST);
        new Wall(A2Q2, 1, 1, Direction.EAST);
        new Wall(A2Q2, 1, 3, Direction.EAST);
        new Wall(A2Q2, 1, 6, Direction.EAST);
        new Thing(A2Q2, 1, 8);
        Robot Frog = new Robot(A2Q2, 1, 0, Direction.EAST);
        while(!Frog.canPickThing()){
            if(Frog.frontIsClear()){
                Frog.move();
            }else{
                Frog.turnLeft();
                Frog.move();
                Frog.turnLeft();
                Frog.turnLeft();
                Frog.turnLeft();
                Frog.move();
                Frog.turnLeft();
                Frog.turnLeft();
                Frog.turnLeft();
                Frog.move();
                Frog.turnLeft();
            }
        }
    }
}
