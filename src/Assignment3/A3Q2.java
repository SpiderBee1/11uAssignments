/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import java.awt.Color;

/**
 *
 * @author goodm9679
 */
public class A3Q2 {

    /**
     * move 10 pancakes from the kitchen to the customer
     */
    public static void main(String[] args) {
        //establish the pancake house
        City dennys = new City();
        //cook the pancakes
        new Thing(dennys, 1, 1);
        new Thing(dennys, 1, 1);
        new Thing(dennys, 1, 1);
        new Thing(dennys, 1, 1);
        new Thing(dennys, 1, 1);
        new Thing(dennys, 1, 1);
        new Thing(dennys, 1, 1);
        new Thing(dennys, 1, 1);
        new Thing(dennys, 1, 1);
        new Thing(dennys, 1, 1);
        dennys.showThingCounts(true);
        //hire a chef
        Robot chef = new Robot(dennys, 1, 1, Direction.EAST);
        //give chef a white apron and hat
        chef.setColor(Color.WHITE);
        chef.setLabel("☖");
        //create integer for turns (slightly overcomplicated)
        int turn = 0;
        //tells the chef when to stop serving the customer
        while (turn < 38) {
            //tells chef if he should leave a pancake or take a pancake or nothing
            if (chef.countThingsInBackpack() > 0) {
                chef.putThing();
            } else {
                if (chef.canPickThing() == true) {
                    chef.pickThing();
                }
            }
            //tells chef when to stop making rounds
            if (turn < 37) {
                chef.move();
            }
            if (turn < 36) {
                chef.turnLeft();
            }
            turn = turn + 1;
        }
    }
}
