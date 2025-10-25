package ObjectClass;
import java.util.*;
public class StudentArray {
    static Scanner scanner = new Scanner(System.in);
 public static void main(String[] args) {
    Student [] students = new Student[5];
    addStudent(students);
    addStudent(students);
    System.err.println(Arrays.toString(students));
}

public static void addStudent(Student[] s){
    System.out.print("Enter Student Name: ");
    String name = scanner.nextLine();
    System.out.print("Enter Student Total: ");
    int total = scanner.nextInt();
    scanner.nextLine(); // consume the newline character
    s[Student.count] = new Student(name,total);
        }
    }
 

 