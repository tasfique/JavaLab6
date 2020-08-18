//Student's Full name: Tasfique Enam
//Student's ID: 5886429
//Task2
package labtask6;

/**
 *
 * @author Tasfique
 */
public class Circle {
    private double radius;

    public Circle(){
        radius = 0.0;

}
    void setRadius(Double radius){
        this.radius = radius;
    }
    
    Double getRadius(){
        return radius;
    }
    
    Double getArea(){
        double area = Math.PI*(radius*radius);
        return area;
    }
    
    Double getDiameter(){
        double diameter = (radius*radius);
        return diameter;
    }
    
    Double getCircumference(){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
    
}



