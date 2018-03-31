package project2;

/**
 *
 * @author SRC Group
 */


public class Student {

    private String firstName;
    private String lastName;
    private String status;
    private double average;
    private char letterGrade;
    private double grade1, grade2, grade3;

    
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLetterGrade(char letterGrade) {
        this.letterGrade = letterGrade;
    }
    
    
    public char getLetterGrade() {
        return letterGrade;
    }




    public String getStatus() {
        return status;
    }



    public void setStatus(String status) {
        this.status = status;
    }



    public double getGrade1() {
        return grade1;
    }



    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }



    public double getGrade2() {
        return grade2;
    }



    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }



    public double getGrade3() {
        return grade3;
    }



    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }



    public double getAverage() {
        return average;
    }



    public void setAverage(double average) {
        this.average = average;
    }

 

    /**
     * Compare two Students based on their averages
     * 
     * @param AverageChecker
     */

    public void compareTo(Student AverageChecker ) {

        if(average < AverageChecker.average)
            System.out.println("Its Higher");

        else if (average > AverageChecker.average)
            System.out.println("Its Lower");

        else 
            System.out.println("Same");
    }

    

    /**
     * Compute the average of all grades
     * 
     * @return average
     */

    public double computeAverage(){

        return (grade1 + grade2 + grade3) / 3;

    }

    
    /**
     * Returns the String <b>Passing</b> if average is 
     * greater than 70 otherwise returns <b>Failed</b>
     * @return 
     */
    public String computeStatus() {

        if (computeAverage() > 70)
            return("Passing");
        else
            return("Failing");

    }
    
    /**
     * Compute Letter Grade 
     * 
     * @return
     * 
     * A if average greater or equals to 90
     * B if average greater or equals to 80
     * C if average greater or equals to 70
     * D if average greater or equals to 60
     * F average below 60
     * 
     *  
     */
    public char computeLetterGrade(){
        
        if(computeAverage() >= 90)
            return ('A');
        else if (computeAverage() >= 80)
            return ('B');
        else if (computeAverage() >= 70)
            return ('C');
        else if (computeAverage() >= 60)
            return ('D');
        else
            return ('F');
    }

}