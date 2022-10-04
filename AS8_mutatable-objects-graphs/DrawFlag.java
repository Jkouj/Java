
/**
 * DrawFlag.java
 * Joey Koumjian
 * 7/3/22
 */
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Polygon;
import javax.swing.JFrame;
import java.util.Scanner;

public class DrawFlag extends Canvas {   // DrawFlag is a kind of Canvas
                                         // that we can draw our own pictures on 
    public static void main(String[] args) {
        // Create a JFrame object, which is a window that can contain the canvas,
        // buttons, menus, and other window components;
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the canvas
        // Canvas class is used to create an area in a frame to be 
        //   used for displaying graphics.
        Canvas canvas = new DrawFlag(); // Create a DrawFlag object called canvas
        canvas.setSize(800, 500);          // Set the size of our canvas
        frame.getContentPane().add(canvas);// Add our canvas to the JFrame object

        // Display the frame on the screen.
        frame.pack();
        frame.setVisible(true);
    }            
            
    public void paint(Graphics g) {
        //Rectangle frame = new Rectangle(10,50,200,130);
        Rectangle frame = new Rectangle(40,20,50,30);
        int count = 0;
        while (count < 5) {
            japaneseFlag(g,frame);
            frame.translate(0,40);
            columbianFlag(g,frame);
            frame.translate(0,40);
            sweedishFlag(g,frame);
            frame.translate(0,40);
            czechFlag(g,frame);
                
            // translate frame over 60 to the right
            frame.translate(60, -120);
            // add 1 to count
            count++;
        }
        count = 0;
        
    }
    
    public static void japaneseFlag(Graphics g, Rectangle frame){
        g.setColor(Color.black);
        g.drawRect(frame.x, frame.y, frame.width, frame.height);
        g.setColor(Color.white);
        g.fillRect(frame.x, frame.y, frame.width, frame.height);
        
        Point center = findCenter(frame);
        g.setColor(Color.red);
        Rectangle sun = new Rectangle(center.x, center.y, frame.width/4, frame.width/4);
        sun.translate(-sun.width/2,-sun.width/2);
        g.fillOval(sun.x,sun.y,sun.width,sun.height);
    }
    
    public static void columbianFlag(Graphics g, Rectangle frame) {
        g.setColor(Color.black);
        g.drawRect(frame.x, frame.y, frame.width, frame.height);
        g.setColor(Color.yellow);
        g.fillRect(frame.x, frame.y, frame.width, frame.height);
        
        Point center = findCenter(frame);      
                
        g.setColor(Color.red);
        g.fillRect(frame.x,center.y,frame.width, frame.height/2);
        
        g.setColor(Color.blue);
        g.fillRect(frame.x, center.y, frame.width, frame.height /4);
    }
    
    public static void sweedishFlag(Graphics g, Rectangle frame) {
        g.setColor(Color.black);
        g.drawRect(frame.x, frame.y, frame.width, frame.height);
        g.setColor(Color.blue);
        g.fillRect(frame.x, frame.y, frame.width, frame.height);
        
        Point center = findCenter(frame);
        
        g.setColor(Color.yellow);
        g.fillRect(center.x, frame.y, frame.width/5, frame.height);
        g.fillRect(frame.x, center.y, frame.width, frame.height/5);
    }
    
    public static void czechFlag(Graphics g, Rectangle frame) {
        g.setColor(Color.black);
        g.drawRect(frame.x, frame.y, frame.width, frame.height);
        g.setColor(Color.white);
        g.fillRect(frame.x, frame.y, frame.width, frame.height);
        
        Point center = findCenter(frame);
        
        g.setColor(Color.red);
        g.fillRect(frame.x, center.y, frame.width, frame.height/2);
        
        g.setColor(Color.blue);
        Polygon triangle = new Polygon();
        triangle.addPoint(frame.x,frame.y); 
        triangle.addPoint(center.x,center.y);
        triangle.addPoint(frame.x,frame.y+frame.height);
        g.drawPolygon(triangle);
        g.fillPolygon(triangle);

        
    }

    public static Point findCenter(Rectangle rect) {
        int x = rect.x + rect.width/2;
        int y = rect.y + rect.height/2;
        return new Point(x, y);
    }    
    
}
