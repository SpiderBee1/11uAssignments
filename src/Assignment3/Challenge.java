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
public class Challenge {

    /**
     * I made Langton's ant!
     * insert these values for selected patterns
     * 
     * PULSE:
     * Ant 1:25,25,east
     * Ant 2:28,26,south
     * (set speed faster to see pattern)
     */
    public static void main(String[] args) {
        City Lang = new City();
        Robot Ant = new Robot(Lang, 25, 25, Direction.EAST, 1000);
        Robot Ant2 = new Robot(Lang, 28, 26, Direction.SOUTH, 1000);
        while(Ant.getCity()== Lang){
            if(Ant.canPickThing()==true){
                Ant.pickThing();
                Ant.turnLeft();
                Ant.move();
            }else{
                Ant.putThing();
                Ant.turnLeft();
                Ant.turnLeft();
                Ant.turnLeft();
                Ant.move();
            }
            if(Ant2.canPickThing()==true){
                Ant2.pickThing();
                Ant2.turnLeft();
                Ant2.move();
            }else{
                Ant2.putThing();
                Ant2.turnLeft();
                Ant2.turnLeft();
                Ant2.turnLeft();
                Ant2.move();
            }
        }
    }
}
