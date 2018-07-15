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
