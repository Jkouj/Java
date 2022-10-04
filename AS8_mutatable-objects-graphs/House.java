/* 
 * Example code for Think Java (http://thinkapjava.com)
 *
 * Adapted from http://en.wikibooks.org/wiki/Java_Programming/Canvas
 *
 * Copyright(c) 2011 Allen B. Downey
 * GNU General Public License v3.0 (http://www.gnu.org/copyleft/gpl.html)
 *
 * @author Allen B. Downey
 */

import java.awt.Color;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Polygon;
import javax.swing.JFrame;
import java.util.Scanner;

public class House extends Canvas {   
    
    public static void main(String[] args) {
        // Create a JFrame object, which is a window that can contain the canvas,
        // buttons, menus, and other window components;
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas
        // Canvas class is used to create an area in a frame to be 
        //   used for displaying graphics.
        Canvas canvas = new House(); // Create a Canvas object called canvas
        canvas.setSize(700, 500);          // Set the size of our canvas
        frame.getContentPane().add(canvas);// Add our canvas to the JFrame object

        // Display the frame on the screen.
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
    // draw a blue circle
        Rectangle box = new Rectangle(100,100, 500,300);        
        g.setColor(Color.yellow);
        g.fillRect(box.x, box.y, box.width, box.height);
        
        g.setColor(Color.green);
        g.fillRect(200,200,50,50);
        g.fillRect(450,200,50,50);
        
        g.setColor(Color.blue);
        g.fillRect(325,300,50,100);
        
        g.setColor(Color.red);
        Polygon triangle = new Polygon();
        triangle.addPoint(100,100); 
        triangle.addPoint(600,100);
        triangle.addPoint(325,10);
        g.drawPolygon(triangle);
        g.fillPolygon(triangle);
        
        // Replace the above statements with code that draws an image of a house. 
        
    }
    
}
