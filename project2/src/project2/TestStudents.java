package project2;


/**
 *
 * @author SRC Group
 */


public class TestStudents{

    public static void main(String[] args) {

        StudentList studentList = new StudentList();

//        JOptionPane joption = new JOptionPane();
//       
//        
//        String s = joption.showInputDialog(null,"Enter a letter","test", joption.INFORMATION_MESSAGE);      
//        System.out.println(s);


        studentList.readStudents();
        studentList.saveStudentsToDB();
        studentList.findStudent();
        
        //studentList.writeStudents();
    }
}