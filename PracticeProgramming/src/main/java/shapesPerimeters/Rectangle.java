/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapesPerimeters;

/**
 *
 * @author fer
 */
public class Rectangle extends Shape {
    @Override
    public double getArea(){
        return getLength()*getWidth();
        
    }

    @Override
    public double getPerimeter() {
       return 2*(getLength()+getWidth());
    }
    
}
