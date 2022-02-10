/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapesperimeters;

/**
 *
 * @author fer
 */
public abstract class Shape {
    
    private double length;
    private double width;
    
    public void setValues(double length, double width){
        this.length =length;
        this.width=width;
    }
    
    public double getLength(){
        return length;
        
    }
    public double getWidth(){
        return width;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
}
