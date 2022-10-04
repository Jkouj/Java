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

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */

// 0  Read the problem statement on the lab12 handout 
//    carefully so you know what we are doing below.

// 1  change Box to Dancing throughout both files
//    (Use the tools>replace command in bluej)

public class DancingBugRunner
{
    public static void main(String[] args)
    {
// 2   declare and create an array called turns
//     that has 6 numbers in it, ranging from 0 to 7
//     (just type in any 6 numbers you like)
        int[] turns = {1,2,3,4,5,6};
        ActorWorld world = new ActorWorld();
        
// 3   instead of passing 6 to the constructor,
//     pass the turns array        
        DancingBug alice = new DancingBug(turns);
        alice.setColor(Color.ORANGE);
        
// 4   instead of passing 3 to the constructor,
//     pass the turns array    
        DancingBug bob = new DancingBug(turns);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}