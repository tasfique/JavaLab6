//Student's Full name: Tasfique Enam
//Student's ID: 5886429
//Task2
package labtask6;

/**
 *
 * @author Tasfique
 */
import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args){
        Scanner read = new Scanner (System.in);
          Circle object = new Circle();
          Circle object2 = new Circle();
          Double radius, radius2;
          
          System.out.println("Enter the radius of the circle ");
          radius = read.nextDouble();
          
          System.out.println("Enter the radius of the circle 2 ");
          radius2 = read.nextDouble();
          
          
          object.setRadius(radius);
          object2.setRadius(radius2);
          
          System.out.println("Radius of the circle is "+object.getRadius());
          System.out.println("Area of the circle is "+object.getArea());
          System.out.println("Diameter of the circle is "+object.getDiameter());
          System.out.println("Circumference of the circle is "+object.getCircumference());
          
          System.out.println("Radius of the circle is "+object2.getRadius());
          System.out.println("Area of the circle is "+object2.getArea());
          System.out.println("Diameter of the circle is "+object2.getDiameter());
          System.out.println("Circumference of the circle is "+object2.getCircumference());
          
    }
    
}
