/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author goodm9679
 */
public class Quiz1 {

    /**
     * the robot removes mines, based on how many are in the mine
     */
    public static void main(String[] args) {
        City quiz = new City();
        //creates outside wall and defines mine dropping position
        new Wall(quiz, 0, 0, Direction.WEST);
        //creates mine walls
        new Wall(quiz, 0, 2, Direction.NORTH);
        new Wall(quiz, 0, 3, Direction.NORTH);
        new Wall(quiz, 0, 4, Direction.NORTH);
        new Wall(quiz, 0, 5, Direction.NORTH);
        new Wall(quiz, 0, 6, Direction.NORTH);
        new Wall(quiz, 0, 7, Direction.NORTH);
        new Wall(quiz, 0, 8, Direction.NORTH);
        new Wall(quiz, 0, 2, Direction.SOUTH);
        new Wall(quiz, 0, 3, Direction.SOUTH);
        new Wall(quiz, 0, 4, Direction.SOUTH);
        new Wall(quiz, 0, 5, Direction.SOUTH);
        new Wall(quiz, 0, 6, Direction.SOUTH);
        new Wall(quiz, 0, 7, Direction.SOUTH);
        new Wall(quiz, 0, 8, Direction.SOUTH);
        //creates variable distance end wall
        new Wall(quiz, 0, 10, Direction.EAST);
        //create 7 things from 0,1 to 0,7
        new Thing(quiz, 0, 2);
        new Thing(quiz, 0, 3);
        new Thing(quiz, 0, 4);
        new Thing(quiz, 0, 5);
        new Thing(quiz, 0, 6);
        new Thing(quiz, 0, 7);
        new Thing(quiz, 0, 8);
        //displayes number of mines when stacked
        quiz.showThingCounts(true);
        //creates a robot
        Robot swep = new Robot(quiz, 0, 0, Direction.EAST);
        //integer for how many mines remain
        int minesLeft = 0;
        //sets integer according to mines
        while (swep.frontIsClear() == true) {
            swep.move();
            if (swep.canPickThing() == true) {
                minesLeft = minesLeft + 1;
            }
        }
        //returns swep to starting position
        swep.turnLeft();
        swep.turnLeft();
        while (swep.frontIsClear() == true) {
            swep.move();
        }
        swep.turnLeft();
        swep.turnLeft();
        //repeating code until the robot is finished(when there are no mines left)
        while (minesLeft > 0) {
            //picks a mine and turns swep around
            if (swep.canPickThing() == true) {
                if (swep.countThingsInBackpack() == 0) {
                    swep.pickThing();
                    swep.turnLeft();
                    swep.turnLeft();
                }
            }
            //moves swep from starting point and back after finding a mine
            if (swep.frontIsClear() == true) {
                swep.move();
                //turns swep around and deposits mine, reducing mine counter by 1
            } else {
                swep.turnLeft();
                swep.turnLeft();
                minesLeft = minesLeft - 1;
                swep.putThing();
                //keeps swep at finish point if there are no more mines to collect
                if (minesLeft > 0) {
                    swep.move();
                }
            }
        }
    }
}
