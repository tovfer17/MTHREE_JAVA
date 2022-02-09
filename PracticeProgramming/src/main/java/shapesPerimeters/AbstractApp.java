/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapesPerimeters;

/**
 *
 * @author fer
 */
public class AbstractApp {
     public static void main(String[] args)
    {
        Shape shape;
        
        Rectangle rect = new Rectangle();
        
        
        shape = rect;

     
        rect.setValues(78, 5);
  
        System.out.println("Area of rectangle : " + shape.getArea());
        System.out.println("Perimeter of rectangle : " + shape.getPerimeter());
        
       
        Square squ = new Square();
        
         
        shape = squ;
        
           
        shape.setValues(3,3);
        
            
        System.out.println("Area of Square : " + shape.getArea());
        System.out.println("Perimeter of square : " + shape.getPerimeter());
    }
}
