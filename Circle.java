/**
* @author  Paydreanne E. Hinton
* instructor Professor Van Custodio
* courseSection ITSC1213-106-27949
* lab 1 - PART C
*/

package pkg1213debugginglab;
public class Circle {
    /**
     * The following program stores methods that assign value to radius and color, and calculate area of a circle
     */
    
    /**
    * The radius, color, and area are private instance variables
    */
    private double radius;
    private String color;
    private double area;
    
    /**
    * This method assigns values to radius and color (public method) 
    */
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    
    /**
    * @param r is a variable name assigned to radius
    * @param clr is a variable name assigned to color
    * The method takes r and clr as parameters, and sets radius and color to r and parameters, respectively (setter method)
    */
    public Circle(double r, String clr) {
        radius = r;
        color = clr;
    }
    
    /**
    * @return getRadius returns radius
    */
    public double getRadius() {
        return radius;
    }
    
    /**
    * @return getArea returns area
    */
    public double getArea() {
        calculateArea();
        return area;
    }
    
    /**
    * The calculateArea method calculates and stores area value (private method)
    */
    private void calculateArea() {
        area = radius * radius * Math.PI;
    }
}
