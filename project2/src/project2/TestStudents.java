package project2;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SRC Group
 */


public class TestStudents{

    public static void main(String[] args) throws SQLException, FileNotFoundException, ClassNotFoundException {

        StudentList studentList = new StudentList();
//
//
//
//        //
//        
//        JOptionPane joption = new JOptionPane();
//       
//        
//        String s = joption.showInputDialog(null,"Enter a letter","test", joption.INFORMATION_MESSAGE);
//        
//        
//        System.out.println(s);
    studentList.readStudents();
    studentList.saveStudentsToDB();
        
        //studentList.writeStudents();
    }
}