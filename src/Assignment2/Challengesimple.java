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
public class Challengesimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City Ice = new City();
        new Wall(Ice, 1, 1, Direction.WEST);
        new Wall(Ice, 2, 1, Direction.WEST);
        new Wall(Ice, 3, 1, Direction.WEST);
        new Wall(Ice, 4, 1, Direction.WEST);
        new Wall(Ice, 5, 1, Direction.WEST);
        new Wall(Ice, 6, 1, Direction.WEST);
        new Wall(Ice, 7, 1, Direction.WEST);
        new Wall(Ice, 8, 1, Direction.WEST);
        new Wall(Ice, 9, 1, Direction.WEST);
        new Wall(Ice, 10, 1, Direction.WEST);
        new Wall(Ice, 1, 2, Direction.EAST);
        new Wall(Ice, 2, 2, Direction.EAST);
        new Wall(Ice, 3, 2, Direction.EAST);
        new Wall(Ice, 4, 2, Direction.EAST);
        new Wall(Ice, 5, 2, Direction.EAST);
        new Wall(Ice, 6, 2, Direction.EAST);
        new Wall(Ice, 7, 2, Direction.EAST);
        new Wall(Ice, 8, 2, Direction.EAST);
        new Wall(Ice, 9, 2, Direction.EAST);
        new Wall(Ice, 10, 2, Direction.EAST);
        new Wall(Ice, 2, 4, Direction.NORTH);
        new Wall(Ice, 2, 5, Direction.NORTH);
        new Wall(Ice, 2, 6, Direction.NORTH);
        new Wall(Ice, 2, 7, Direction.NORTH);
        new Wall(Ice, 5, 4, Direction.NORTH);
        new Wall(Ice, 5, 5, Direction.NORTH);
        new Wall(Ice, 5, 6, Direction.NORTH);
        new Wall(Ice, 8, 4, Direction.NORTH);
        new Wall(Ice, 8, 5, Direction.NORTH);
        new Wall(Ice, 8, 6, Direction.NORTH);
        new Wall(Ice, 8, 7, Direction.NORTH);
        new Wall(Ice, 8, 8, Direction.NORTH);
        new Wall(Ice, 1, 3, Direction.EAST);
        new Wall(Ice, 2, 7, Direction.EAST);
        new Wall(Ice, 3, 7, Direction.EAST);
        new Wall(Ice, 4, 3, Direction.EAST);
        new Wall(Ice, 5, 6, Direction.EAST);
        new Wall(Ice, 6, 3, Direction.EAST);
        new Wall(Ice, 7, 3, Direction.EAST);
        new Wall(Ice, 8, 8, Direction.EAST);
        new Wall(Ice, 9, 8, Direction.EAST);
        new Wall(Ice, 10, 3, Direction.EAST);
        new Wall(Ice, 3, 4, Direction.SOUTH);
        new Wall(Ice, 3, 5, Direction.SOUTH);
        new Wall(Ice, 3, 6, Direction.SOUTH);
        new Wall(Ice, 3, 7, Direction.SOUTH);
        new Wall(Ice, 5, 4, Direction.SOUTH);
        new Wall(Ice, 5, 5, Direction.SOUTH);
        new Wall(Ice, 5, 6, Direction.SOUTH);
        new Wall(Ice, 9, 4, Direction.SOUTH);
        new Wall(Ice, 9, 5, Direction.SOUTH);
        new Wall(Ice, 9, 6, Direction.SOUTH);
        new Wall(Ice, 9, 7, Direction.SOUTH);
        new Wall(Ice, 9, 8, Direction.SOUTH);
        new Wall(Ice, 10, 3, Direction.SOUTH);
        new Thing(Ice, 2, 3);
        new Thing(Ice, 2, 4);
        new Thing(Ice, 2, 5);
        new Thing(Ice, 2, 6);
        new Thing(Ice, 3, 3);
        new Thing(Ice, 3, 5);
        new Thing(Ice, 3, 7);
        new Thing(Ice, 5, 3);
        new Thing(Ice, 5, 4);
        new Thing(Ice, 5, 5);
        new Thing(Ice, 7, 3);
        new Thing(Ice, 8, 3);
        new Thing(Ice, 8, 4);
        new Thing(Ice, 8, 8);
        new Thing(Ice, 9, 4);
        new Thing(Ice, 9, 5);
        new Thing(Ice, 9, 7);
        Robot Water = new Robot(Ice, 1, 3, Direction.SOUTH);
        Water.setLabel("☂");
        Robot Steam = new Robot(Ice, 1, 3, Direction.SOUTH);
        Steam.setLabel("♨");
        
        while(Water.frontIsClear()==true){
            Water.turnLeft();
            while(Water.frontIsClear()==true){
                if(Water.canPickThing()==true){
                    Water.pickThing();
                }
                Water.move();
            }
            if(Water.canPickThing()==true){
                Water.pickThing();
            }
            Water.turnLeft();
            Water.turnLeft();
            while(Water.frontIsClear()==true){
                if(Water.canPickThing()==true){
                    Water.pickThing();
                }
                Water.move();
            }
            while(Water.countThingsInBackpack()>0){
                Water.putThing();
            }
            Water.turnLeft();
            Water.move();
        }
        //steam's jobs
        while(Steam.frontIsClear()==true){
            while(Steam.canPickThing()==true){
                Steam.pickThing();
            }
            Steam.move();
        }
        while(Steam.countThingsInBackpack()>0){
            Steam.putThing();
        }
    }
}