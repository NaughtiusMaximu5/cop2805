package project2;

/**
 *
 * @author SRC Group COP2805
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
        chooser.setDialogTitle("Select file with Student Information");

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

    /**
     * Prompts the user for a student name and last name and shows a message
     * indicating that the student was either found or not found in the DB.
     * Continue asking the user until the user enters end.
     *
     */
    public void findStudent() {

//        JFrame f = new JFrame();
//        f.setTitle("Find Student");
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//        JPanel panel = (JPanel)f.getContentPane();
//        panel.setLayout(null);
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
        JTextField nameField,
                lastNameField;
        JButton findButton,
                endButton;
        
        //==================    LABELS    =======================
        //      Find Student        Student Info
        JLabel titleLabel,          infoTitleLabel,
                nameLabel,          nameInfoLabel,
                lastNameLabel,      lastNameInfoLabel,
                foundLabel,         averageLabel,
                copyrigthLabel,     gradeLabel,
                                    statusLabel;     

        JFrame frame = new JFrame();
        frame.setTitle("Find Student");

        //Labels of the titles
        titleLabel = new JLabel("<html><h1 font='Verdana';>Find Student</h1></html>");
        titleLabel.setBounds(50, 10, 200, 100);
        infoTitleLabel = new JLabel("<html><h1 font='Verdana';>Student Information</h1></html>");
        infoTitleLabel.setBounds(350, 10, 300, 100);

        //Label and Field for name
        nameField = new JTextField();
        nameField.setBounds(50, 110, 150, 20);
        nameLabel = new JLabel();
        nameLabel.setText("<html><p font='Verdana';>First Name</p></html>");
        nameLabel.setBounds(50, 50, 200, 100);

        //Label and Field for last name
        lastNameField = new JTextField();
        lastNameField.setBounds(50, 160, 150, 20);
        lastNameLabel = new JLabel();
        lastNameLabel.setText("<html><p font='Verdana';>Last Name</p></html>");
        lastNameLabel.setBounds(50, 100, 200, 100);

        //Buttons to find and to finish the program 
        findButton = new JButton("Find");
        findButton.setBounds(420, 280, 70, 40);
        endButton = new JButton("End");
        endButton.setBounds(500, 280, 70, 40);
        
        
        //Student Information Labels
        nameInfoLabel =  new JLabel();
        nameInfoLabel.setText("<html><p font='Verdana';>Name:</p></html>");
        nameInfoLabel.setBounds(350, 60, 200, 100);
        frame.add(nameInfoLabel);
        lastNameInfoLabel =  new JLabel();
        lastNameInfoLabel.setText("<html><p font='Verdana';>Last Name:</p></html>");
        lastNameInfoLabel.setBounds(350, 85, 200, 100);
        frame.add(lastNameInfoLabel);
        averageLabel =  new JLabel();
        averageLabel.setText("<html><p font='Verdana';>Average:</p></html>");
        averageLabel.setBounds(350, 110, 200, 100);
        frame.add(averageLabel);
        gradeLabel =  new JLabel();
        gradeLabel.setText("<html><p font='Verdana';>Grade:</p></html>");
        gradeLabel.setBounds(350, 135, 200, 100);
        frame.add(gradeLabel);
        statusLabel =  new JLabel();
        statusLabel.setText("<html><p font='Verdana';>Status:</p></html>");
        statusLabel.setBounds(350, 160, 200, 100);
        frame.add(statusLabel);
        
        
        //Label of the copyrigth
        copyrigthLabel = new JLabel();
        copyrigthLabel.setText("<html><h3 font='Verdana';> 2018 &copy; 𝓢𝓡𝓒 Group.</h3></html>");
        copyrigthLabel.setBounds(50, 260, 200, 100);

        JPanel panel = new JPanel();
        panel.setVisible(true);
        panel.setBounds(50, 200, 150, 20);
        panel.setBackground(Color.red);
        panel.setBorder(new LineBorder(Color.BLACK));

        //Label that tell if the student were found or not
        foundLabel = new JLabel();
        foundLabel.setFont(new Font("Verdana", 1, 12));
        //Align text inside the panel box vertically
        foundLabel.setBorder(BorderFactory.createEmptyBorder(-4/*TOP*/, 0, 0, 0));
        panel.add(foundLabel);
        
        
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Statement statement = new connection.
                String name = nameField.getText();
                String lastName = lastNameField.getText();

                if (e.getSource() == findButton) {
                    //result =   String.valueOf(s1+" " +s2);
                    panel.setBackground(Color.red);
                    foundLabel.setText("<html><div color='#FFFFFF'> Student Not Found</div></html>");
                } else if (e.getSource() == endButton) {
                    panel.setBackground(Color.GREEN);
                    foundLabel.setText("<html><div color='#00000'> Student Found</div></html>");
                }
            }
        };

        findButton.addActionListener(actionListener);
        endButton.addActionListener(actionListener);

        frame.add(nameField);
        frame.add(lastNameField);
        frame.add(findButton);
        frame.add(endButton);
        frame.add(panel);
        frame.add(nameLabel);
        frame.add(lastNameLabel);
        frame.add(copyrigthLabel);
        frame.add(titleLabel);
        frame.add(infoTitleLabel);
        frame.setSize(645, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    //Remove array list getter, just for testing
    public ArrayList<Student> getStudents() {
        return students;
    }
}
