/*-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -
Group Members: Carlos Abraham Hernandez
               Junior Betancourt
               Andy Gonzalez
Student IDs:   4000026424
               1002223305
               1000784524
COP 2805C –Java Programming 2
Spring 2018 - T Th 6:15 PM - 9:30PM
Project # 2
Plagiarism Statement: I certify that this assignment is my own work and that I have not copied in part or
whole or otherwise plagiarized the work of other students and/or persons.

@author SRC Group
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- */
package project2;

public class TestStudents {

    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.readStudents();
        studentList.saveStudentsToDB();
        studentList.writeStudents();
        studentList.writeSortedStudents();
        studentList.findStudent();
    }
}
