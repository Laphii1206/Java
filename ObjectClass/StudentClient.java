package ObjectClass;
public class StudentClient {
    public static void main(String[] args) {
        Student s1=new Student(); // object declaration
        s1.name="Peter";
        s1.total=65;
        System.out.println(s1.name+" "+s1.total+" "+s1.grade());
    }
}

// Student S1= new Student();
// Student is a class, S1 is an reference name, new is a operator, Student() is a constructor
// constructor is a special method to create an object
