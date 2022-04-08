/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg1213debugginglab;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 * @author Paydreanne E. Hinton
 * instructor Professor Van Custodio
 * courseSection ITSC1213-106-27949
 * lab 1 - PART B
 * The following program outputs the properties of rectangle and calculates area of intersecting rectangles
 */

public class RectangleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Changing size and shape of rectangles
        Rectangle box1 = new Rectangle(10,10,40,30);
        Rectangle box2 = new Rectangle(100,50);
        
        // Displaying rectangle's current properties
        System.out.println("box1: " + box1);
        System.out.println("box2: " + box2);
        
        // Changing x and y positions of rectangle
        box1.setLocation(20,20);
        box2.setSize(50,30);

        
        // Displaying rectangle's current properties
        System.out.println("box1: " + box1);
        System.out.println("box2: " + box2);
        box1.createIntersection(box2);
        
        Rectangle box3 = box1.intersection(box2);
        
        System.out.println("Area of intersecting rectangle: " + box3.getWidth() * box3.getHeight());
        System.out.println("box3: " + box3);
    }
    
}
