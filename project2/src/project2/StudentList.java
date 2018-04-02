package project2;

/**
 *
 * @author SRC Group
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class StudentList {

    private ArrayList<Student> students = new ArrayList<>();
    private String path;

    /**
     * Prompts the user for an input file name and reads the contents of the
     * input file into the students array list.
     */
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

                    switch (tempArray.length) {
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
                    students.add(student);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        }
    }

    /**
     * Prompts the user for an DataBase file name (.accdb) and writes the
     * contents of students to the DB.
     */
    public void saveStudentsToDB() throws SQLException, FileNotFoundException, ClassNotFoundException {

        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Open DataBase to save information");

        File accessDB = null;

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            accessDB = chooser.getSelectedFile();
            path = accessDB.getAbsolutePath();
        }

        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://" + path);
        Statement add = connection.createStatement();

        for (Student student : students) {

            //Sql statements to add information to .accdb from .txt file
            add.executeUpdate(
                    "INSERT INTO StudentsTbl"
                    + "(FirstName,"
                    + " LastName, "
                    + " Grade1, "
                    + " Grade2, "
                    + " Grade3, "
                    + " Average, "
                    + " Status, "
                    + " LetterGrade)"
                    + "values("
                    + "'" + student.getFirstName() + "',"
                    + "'" + student.getLastName() + "',"
                    + String.format("%.2f", student.getGrade1()) + ","
                    + String.format("%.2f", student.getGrade2()) + ","
                    + String.format("%.2f", student.getGrade3()) + ","
                    + String.format("%.2f", student.computeAverage()) + ","
                    + "'" + student.computeStatus() + "',"
                    + "'" + student.computeLetterGrade() + "');");
        }
    }

    public void findStudent() {
        
//        JFrame f = new JFrame();
//        f.setTitle("Find Student");
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//        JPanel panel = (JPanel)f.getContentPane();
//        panel.setLayout(null);
//        
//        //Label
//        JLabel label = new JLabel("Search Student");
//        panel.add(label);
//        
//        //Button
//        JButton button = new JButton("Search");
//        panel.add(button);
//        
//        
//        //
//        
//        
//        
//        Dimension labelSize = label.getPreferredSize();
//        Dimension buttonSize = button.getPreferredSize();
//        label.setBounds(40, 25, labelSize.width, labelSize.height);
//        button.setBounds(275, 120, buttonSize.width, buttonSize.height);
//        
//        
//        f.setSize(400, 200);
//        f.setVisible(true);
        JTextField nameField,lastNameField,tf3;  
        JButton b1,b2;
        JLabel copyrigth, searchTitle, name, lastName;
  
    
     
        JFrame frame = new JFrame();
        
        
        nameField = new JTextField();  
        nameField.setBounds(50,50,150,20);  
        
        lastNameField=new JTextField();  
        lastNameField.setBounds(50,100,150,20);  
        
        tf3=new JTextField();  
        tf3.setBounds(50,150,150,20);  
        
        tf3.setEditable(false);   
        b1=new JButton("Find");  
        b1.setBounds(400,280,70,40);  
        b2=new JButton("End");  
        b2.setBounds(500,280,70,40);  
        
        copyrigth = new JLabel();
        copyrigth.setText("<html><h3 font='Verdana';> 2018 &copy; 𝓢𝓡𝓒 Group.</h3></html>");
        copyrigth.setBounds(50, 270, 200, 100);
        frame.add(copyrigth);
        
        JPanel panel = new JPanel();
        panel.setVisible(true);
        panel.setBounds(50, 150, 150, 20);
        panel.setBackground(Color.red);
        panel.setBorder(new LineBorder(Color.BLACK));
        JLabel search = new JLabel();
        search.setFont(new Font("Verdana",1,12));
        search.setBorder(BorderFactory.createEmptyBorder(-3/*TOP*/, 0, 0, 0));
        panel.add(search);
        
        
        
        
       
        
        
        ActionListener actionListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                 String s1 = nameField.getText();
                 String s2 = lastNameField.getText();
                 String result = null;
            
                if(e.getSource() == b1){
                //result =   String.valueOf(s1+" " +s2);
                //jp.setBackground(Color.GREEN);
                panel.setBackground(Color.red);
                search.setText("<html><div style='text-align: center'; color='#FFFFFF'> Student Not Found</div></html>");
                }
                
                else if(e.getSource() == b2){
                    panel.setBackground(Color.GREEN);
                    search.setText("<html><div style='text-align: center'; color='#00000'> Student Found</div></html>");
                }
                
                tf3.setText(result);
            }  
        };
                
        
        
        b1.addActionListener(actionListener);
        b2.addActionListener(actionListener);  
        
        frame.add(nameField);frame.add(lastNameField);/*frame.add(tf3);*/frame.add(b1);frame.add(b2); frame.add(panel); 
        frame.setSize(700,400);  
        frame.setLayout(null);  
        frame.setVisible(true);  
    }

    //Remove array list getter, just for testing
    public ArrayList<Student> getStudents() {
        return students;
    }
}
