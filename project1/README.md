# Project

### Design a class Student that implements the comparable interface and contains the following members:

1- String fields name and status.

2- int fields grade1, grade2 and grade3

3- double field average.

4- A four-argument constructor that takes name, grade1, grade2 and grade3 as parameters.

5- compareTo method to compare two Students based on their averages.

6- computeAverage method.

7- computeStatus method (If average is &lt; 70, the status will be “Failing”. Otherwise, the status is
“Passing”)

8- get and set methods for all fields.

### Design a class StudentList that contains the following members:

1- An ArrayList of Student objects students.

2- readStudents method that prompts the user for an input file name (use JFileChooser) and reads
the contents of the input file into students. You can expect the file to be a text file with the
following format:

```
Name|Grade1|Grade2|Grade3 //Student 1 - just names no last names (e.g. Rodolfo, Julio, Maria)
Name|Grade1|Grade2|Grade3 //Student 2
Name|Grade1|Grade2|Grade3 //Student 3
```

Sample input file contents:

```
Rodolfo|78|99|100
Maria|90|100|100
Julio|78|56|99
```

**Notes:** 

- Use String.split() method to parse the input.
- The file could have any length; therefore, you cannot make assumptions about how many
students you’ll find in the file.
- You can; however, assume that the information for every student is complete (Name,
grade1, grade2 and grade3).
- Need to populate the average and status fields as appropriate.

3- writeStudents method that prompts the user for an output file name (use JFileChooser) and writes
the contents students to the output file with the following format:

```
Name Grade 1 Grade 2 Grade 3 Average Status
Rodolfo 100.00 100.00 100.00 100.00 Passing
Julio 60.00 60.00 60.00 60.00 Failing
```
Create a class TestStudents to test your work. This class will have a main that looks exactly like this:

```java
public static void main(String[] args) {
StudentList studentList = new StudentList();
studentList.readStudents();
studentList.writeStudents();
}
```

# Yeap

2018 © **Radicals √**
