/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package inheritanceExample;

/**
 *
 * @author fer
 */
public class MethodOverridingManager extends Employee {

   public void hire() {
        // code to hire someone...
    }
    
    public void fire() {
        // code to fire someone...
    }
    
    public void givePerformanceReview() {
        // code to give performance review
    }
    
    @Override
    public void createYearlyObjectives() {
        // we're overriding the version of this method in Employee
        // put new code here...
         super.createYearlyObjectives(); //calls the parent's version of the methof that you are overriding
        // put more new code here...
    }
}
