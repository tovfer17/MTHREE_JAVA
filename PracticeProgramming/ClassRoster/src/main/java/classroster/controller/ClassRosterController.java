/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classroster.controller;

import classroster.dao.ClassRosterDao;
import classroster.dao.ClassRosterDaoFileImpl;
import classroster.dto.ClassRosterView;
import classroster.dto.Student;
import classroster.dto.UserIO;
import classroster.dto.UserIOConsoleImpl;
import java.util.List;

/**
 *
 * @author fer
 */
public class ClassRosterController {
    
      private ClassRosterView view = new ClassRosterView();
      //private UserIO io = new UserIOConsoleImpl();
      
      private ClassRosterDao dao = new ClassRosterDaoFileImpl();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {

           menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    listStudents();
                    break;
                case 2:
                    createStudent();
                    break;
                case 3:
                    viewStudent();
                    break;
                case 4:
                     removeStudent();
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
            }

        }
        //io.print("GOOD BYE");
        exitMessage();
    }
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void createStudent() {
    view.displayCreateStudentBanner();
    Student newStudent = view.getNewStudentInfo();
    dao.addStudent(newStudent.getStudentId(), newStudent);
    view.displayCreateSuccessBanner();
}
    private void listStudents() {
    view.displayDisplayAllBanner();
    List<Student> studentList = dao.getAllStudents();
    view.displayStudentList(studentList);
}
    private void viewStudent() {
    view.displayDisplayStudentBanner();
    String studentId = view.getStudentIdChoice();
    Student student = dao.getStudent(studentId);
    view.displayStudent(student);
}
    private void removeStudent() {
    view.displayRemoveStudentBanner();
    String studentId = view.getStudentIdChoice();
    Student removedStudent = dao.removeStudent(studentId);
    view.displayRemoveResult(removedStudent);
}
    private void unknownCommand() {
    view.displayUnknownCommandBanner();
}

    private void exitMessage() {
    view.displayExitBanner();
}

}
