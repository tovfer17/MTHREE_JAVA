/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ft.com.mthree.shapesperimeters;

import ft.com.mthree.shapesperimeters.Shape;

/**
 *
 * @author fer
 */
public class Square extends Shape{
     @Override
    public double getArea(){
        return getWidth()*getWidth();
        
    }

    @Override
    public double getPerimeter() {
       return 4*(getWidth());
    }
}
