package project2;

/**
 *
 * @author SRC Group
 */

import java.util.*;
import java.io.*;
import javax.swing.JFileChooser;


public class StudentList {

    private ArrayList<Student> students = new ArrayList<>();

    public void readStudents() {

        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Select file to with Student information");
        
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

            File fileObject = chooser.getSelectedFile();

            Scanner input;

            try {

                input = new Scanner(fileObject);

                while (input.hasNext()) {

                    //Getting the entire line from the chosen .txt document
                    String temp = input.next();

                    // Create a string array to hold the split string
                    String[] tempArray = temp.split("\\|");

                    String firstName = tempArray[0];
                    String lastName = tempArray[1];
                     
                    Student student = new Student(firstName, lastName);
                    
                    switch(tempArray.length){
                        //When there are no quizes
                        case 2:
                            student.setGrade1(0);
                            student.setGrade2(0);
                            student.setGrade3(0);
                            break;
                        //When there is one quiz
                        case 3:
                            student.setGrade1(Double.parseDouble(tempArray[2]));
                            student.setGrade2(0);
                            student.setGrade3(0);
                            break;
                        //When there are two quizes
                        case 4:
                            student.setGrade1(Double.parseDouble(tempArray[2]));
                            student.setGrade2(Double.parseDouble(tempArray[3]));
                            student.setGrade3(0);
                            break;
                        //When thre are three quizes
                        case 5:
                            student.setGrade1(Double.parseDouble(tempArray[2]));
                            student.setGrade2(Double.parseDouble(tempArray[3]));
                            student.setGrade3(Double.parseDouble(tempArray[4]));
                            break;
                    }
                    
                    /**
                     * Add student created to the array list
                     */
                    students.add(student);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        }
    }
    
    

//    public void writeStudents() {
//
//        JFileChooser chooser = new JFileChooser();
//
//        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
//
//            PrintWriter output = null;
//
//            try {
//
//                File fileObject = chooser.getSelectedFile();
//
//                output = new PrintWriter(fileObject);
//
//                output.println("Name\t\t"
//                        + "Grade 1\t\t"
//                        + "Grade 2\t\t"
//                        + "Grade 3\t\t"
//                        + "Average\t\t"
//                        + "Status");
//
//                for (Student student : students) {
//
//                    output.println(student.getName()
//                            + "\t\t" + String.format("%.2f", student.getGrade1())
//                            + "\t\t" + String.format("%.2f", student.getGrade2())
//                            + "\t\t" + String.format("%.2f", student.getGrade3())
//                            + "\t\t" + String.format("%.2f", student.computeAverage())
//                            + "\t\t" + student.computeStatus());
//
//                }
//
//                output.close();
//
//            } catch (FileNotFoundException e) {
//
//                System.out.println("File not found");
//
//            } finally {
//
//                output.close();
//
//            }
//
//        }
//    }

    
    
    public void saveStudentsToDB(){
        
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Open DataBase to save information");
        
        
    }
    
    //Remove array list getter, just for testing
    public ArrayList<Student> getStudents() {
        return students;
    }
}
