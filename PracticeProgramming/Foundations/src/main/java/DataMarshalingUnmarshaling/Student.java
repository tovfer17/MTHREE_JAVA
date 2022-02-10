/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataMarshalingUnmarshaling;

/**
 *
 * @author fer
 */
//Student class shows how student data is stored in memory:
public class Student {
    
    private String firstName;
    private String lastName;
    private String studentId;
    private String cohort; // Java or .NET + cohort month/year

    public Student(String studentId) {
        this.studentId = studentId;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentID() {
        return studentId;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }   
}

//Our file format illustrates how student data is stored in the file:

//<student id>::<first name>::<last name>::<cohort>