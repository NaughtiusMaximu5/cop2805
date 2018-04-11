package tests;
public class Student implements comparable<Student>{

    private String name;
    private String status;
    private double average;
    private double grade1, grade2, grade3;
    
    Student(String name, double grade1, double grade2, double grade3) {

        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setGrade1(int grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(int grade2) {
        this.grade2 = grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public void setGrade3(int grade3) {
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
        
        if(average < AverageChecker.average){
            System.out.println("Its Higher");
        }
        else if (average > AverageChecker.average){
            System.out.println("Its Lower");
        }
        else {
            System.out.println("Same");
        }
    }
    
    /**
     * Compute the average of all grades
     * 
     * @return average
     */
    public double computeAverage(){
        return (grade1 + grade2 + grade3) / 3;
    }
    
    public String computeStatus() {
        if (computeAverage() > 70)
            return("Passing");
        else
            return("Failed");
    }
}
