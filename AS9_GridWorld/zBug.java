/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Bug;

/**
 * A <code>zBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class zBug extends Bug
{
    private int steps;
    private int sideLength;
    private int sideNum;
    private int firstStep = 0;
    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public zBug(int length)
    {
        steps = 0;
        sideLength = length;
        sideNum = 0;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            if (firstStep == 0){
                turn();
                turn();
                firstStep++;
            }
            move();
            steps++;
        }
        else if (sideNum == 0)
        {
            turn();
            turn();
            turn();
            sideNum = 1;
            steps = 0;
        }
        else if (sideNum == 1) {
            turn();
            turn();
            turn();
            turn();
            turn();
            sideNum = 2;
            steps = 0;
        }
        else if (sideNum == 2){
        
        }
    }
}
