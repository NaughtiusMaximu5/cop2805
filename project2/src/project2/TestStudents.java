package project2;

/**
 *
 * @author SRC Group
 */


public class TestStudents{

    public static void main(String[] args) {

        StudentList studentList = new StudentList();



        studentList.readStudents();
       
         System.out.println("Grade: "+ studentList.getStudents().get(0).computeLetterGrade());
        //studentList.writeStudents();
    }
}