// To use a class defined in another package, you have to import it. 
// Point and Rectangle are in the java.awt package, so you import 
// them like this:
import java.awt.Point;
import java.awt.Rectangle;

/**
 * Rectangles.java
 * Joey Koumjian 
 * 7/3/22
 */
public class Rectangles
{   
    public static void main(String [] args)
    {
        System.out.println("\f");
        Rectangle box = new Rectangle(30,20,100,50);
        System.out.println("box = " + box);
        
        // 1) Use box.translate to move box to the location x=80, y=50
        box.translate(50,30);
        System.out.println("1) after translating, box = " + box);        

        // 2) Use box.translate to move box to the location in Point p
        //    by figuring out the change in x based on p.x and box.x
        //    and the change in y and using translate with these values
        Point p = new Point(250,210);
        int dx = p.x - box.x;
        int dy = p.y - box.y;
        box.translate(dx,dy);
        System.out.println("2) after translating, box = " + box);        
        System.out.println("2) should be [x=250,y=210,width=100,height=50");        
        
        
        // 3) Write a method that returns the lower right point of a rectangle
        //    then uncomment the two lines below and test it. 
        
        Rectangle box2 = new Rectangle(100,200,20,30);
        Point pLR = lowerRight(box2);   // define lowerRight below main        
        System.out.println("3) lower right corner of box2 = " + pLR);    
        System.out.println("3) should be [x=120,y=230]");    
        
        // 4) Write a method that returns a new Rectangle that is next to the 
        //    one passed to it. Then uncomment the next two lines and test it. 
       
        Rectangle box3 = adjacentRectangle(box2);  // define adjacentRectangle below main
        System.out.println("4) rectangle adjacent to box2 = " + box3);    
        System.out.println("4) should be [x=120,y=200,width=20,height=30]");    
        System.out.println("4) box2 (should still be [100,200,20,30]) = " + box2);    
        
    }
    
    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }
    
    public static double distance(Point p1, Point p2) {
        double dx = p2.x - p1.x;  
        double dy = p2.y - p1.y;
        return Math.sqrt(dx*dx + dy*dy);
    }    
    
    public static Point findCenter(Rectangle rect) {
        int x = rect.x + rect.width/2;
        int y = rect.y + rect.height/2;
        return new Point(x, y);
    }    
    
    public static Point lowerRight(Rectangle r) {
        int x = r.x + r.width;
        int y = r.y + r.height;
        return new Point(x,y);
    }
    
    public static Rectangle adjacentRectangle(Rectangle r) {
        int x = r.x + 20;
        return new Rectangle(x, r.y, r.width, r.height);
    }
}
