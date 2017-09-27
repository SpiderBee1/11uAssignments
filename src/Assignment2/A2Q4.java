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
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City Manor = new City();
        Robot Guard = new Robot(Manor, 0, 0, Direction.EAST);
        Robot KingJava = new Robot(Manor, 2, 2, Direction.SOUTH);
        new Thing(Manor, 2, 3);
        new Thing(Manor, 3, 2);
        new Thing(Manor, 3, 3);
        new Wall(Manor, 1, 1, Direction.NORTH);
        new Wall(Manor, 1, 1, Direction.EAST);
        new Wall(Manor, 1, 1, Direction.SOUTH);
        new Wall(Manor, 1, 1, Direction.WEST);
        new Wall(Manor, 1, 4, Direction.NORTH);
        new Wall(Manor, 1, 4, Direction.EAST);
        new Wall(Manor, 1, 4, Direction.SOUTH);
        new Wall(Manor, 1, 4, Direction.WEST);
        new Wall(Manor, 4, 1, Direction.NORTH);
        new Wall(Manor, 4, 1, Direction.EAST);
        new Wall(Manor, 4, 1, Direction.SOUTH);
        new Wall(Manor, 4, 1, Direction.WEST);
        new Wall(Manor, 4, 4, Direction.NORTH);
        new Wall(Manor, 4, 4, Direction.EAST);
        new Wall(Manor, 4, 4, Direction.SOUTH);
        new Wall(Manor, 4, 4, Direction.WEST);
        new Wall(Manor, 2, 3, Direction.NORTH);
        new Wall(Manor, 2, 3, Direction.EAST);
        new Wall(Manor, 3, 2, Direction.SOUTH);
        new Wall(Manor, 3, 2, Direction.WEST);
        new Wall(Manor, 2, 2, Direction.NORTH);
        new Wall(Manor, 3, 3, Direction.EAST);
        new Wall(Manor, 3, 3, Direction.SOUTH);
        new Wall(Manor, 2, 2, Direction.WEST);
        Guard.setLabel("☻");
        KingJava.setLabel("♕");
        while(Guard.getCity()==Manor){
            Guard.move();
            Guard.move();
            Guard.turnLeft();
            Guard.turnLeft();
            Guard.turnLeft();
            Guard.move();
            Guard.turnLeft();
            Guard.move();
            Guard.turnLeft();
            Guard.move();
            Guard.turnLeft();
            Guard.turnLeft();
            Guard.turnLeft();
            Guard.move();
            Guard.move();
            Guard.turnLeft();
            Guard.turnLeft();
            Guard.turnLeft();
        }
    }
}
