/*-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -
Group Members: Carlos Abraham Hernandez
               Junior Betancour
               Andy Tamayo
Student IDs: Student IDs of Group members
COP 2805C –Java Programming 2
Spring 2018 - T Th 6:15 PM - 9:30PM
Project # 2
Plagiarism Statement: I certify that this assignment is my own work and that I have not copied in part or
whole or otherwise plagiarized the work of other students and/or persons.

@author SRC Group
-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- */
package project2;

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
    public void compareTo(Student AverageChecker) {

        if (average < AverageChecker.average)
            System.out.println("Its Higher");
        else if (average > AverageChecker.average)
            System.out.println("Its Lower");
        else
            System.out.println("Same");
    }

    /**
     * Returns a double with the value of the average of all the grades
     *
     * @return average - average between all grades
     */
    public double computeAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }

    /**
     * Returns an string telling if the student is passing the class or not
     *
     * @return
     *
     * <ul>
     * <li><b>Passing</b> if the student grade average is over 70</li>
     * <li><b>Failing</b> if the student grade average is below 70</li>
     * </ul>
     */
    public String computeStatus() {

        if (computeAverage() > 70)
            return ("Passing");
        else
            return ("Failing");
    }

    /**
     * Compute Letter Grade returns a char value of the student's grade.
     *
     * @return
     *
     * <ul>
     * <li>A if the average is greater or equals to 90</li>
     * <li>B if the average is greater or equals to 80</li>
     * <li>C if the average is greater or equals to 70</li>
     * <li>D if the average is greater or equals to 60</li>
     * <li>F is the average is below 60
     * <ul>
     *
     */
    public char computeLetterGrade() {

        if (computeAverage() >= 90)
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
