package ContructorAssignment;

// 3 Create a class named Student with the following attributes:
// 1)      name (String): to store the name of the student.
// 2)      id (int): to store the student ID.
// 3)      grade (double): to store the grade of the student.
// Implement a constructor to initialize these attributes.
 
//   In the main method, create an array named studentArray that can hold up to 10 Student objects.
//   Initialize the studentArray array with different Student objects. You can use fictional student data for this.
//   Write
// a method named displayStudents that takes the studentArray array as a
// parameter and displays the details of each student in the array.

//  Q 4 Write  a method named sortStudents that takes the studentArray array as a
// parameter and sorts the array based on the grades of the students in
// ascending order. You can use any sorting algorithm of your choice (e.g.,
// bubble sort )
public class Student {
    String name;
    int id;
    double grade;

    Student(){

    }

    Student(String name,int id, double grade){
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    

    public static void main(String [] args){
        Student studentArray[] = new Student[10];
        
    }
}
