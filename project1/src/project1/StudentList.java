package project1;

import java.util.*;
import java.io.*;
import javax.swing.JFileChooser;

public class StudentList {

    private ArrayList<Student> students = new ArrayList<>();

    public void readStudents() {

        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

            File fileObject = chooser.getSelectedFile();
            Scanner input;
            try {
                input = new Scanner(fileObject);
                while (input.hasNext()) {
                    //getting an entire line from the chosen text document
                    String temp = input.next();
                    // create a string array to hold the split string
                    String[] tempArray = temp.split("\\|");
                    String name = tempArray[0];
                    double grade1 = Integer.parseInt(tempArray[1]);
                    double grade2 = Integer.parseInt(tempArray[2]);
                    double grade3 = Integer.parseInt(tempArray[3]);

                    students.add(new Student(name, grade1, grade2, grade3));
                }
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
        }
    }

    public void writeStudents() {

        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            PrintWriter output = null;
            try {
                File fileObject = chooser.getSelectedFile();
                output = new PrintWriter(fileObject);
                output.println("Name\t\t"
                    + "Grade 1\t\t"
                    + "Grade 2\t\t"
                    + "Grade 3\t\t"
                    + "Average\t\t"
                    + "Status");
                
                for (Student student : students) {

                    output.println(student.getName()
                    + "\t\t" + String.format("%.2f", student.getGrade1())
                    + "\t\t" + String.format("%.2f", student.getGrade2())
                    + "\t\t" + String.format("%.2f", student.getGrade3())
                    + "\t\t" + String.format("%.2f", student.computeAverage())
                    + "\t\t" + student.computeStatus());
                }
                output.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found");

            } finally {
                output.close();
            }
        }
    }
}