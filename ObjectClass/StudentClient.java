package ObjectClass;
public class StudentClient {
    public static void main(String[] args) {
        Student s1=new Student(); // object declaration
        Student s2=new Student("Laphii",80);
        s1.name="Peter";
     //   s1.total=65;
        s1.setTotal(65);
        System.out.println(s1.name+" "+s1.getTotal()+" "+s1.grade());
        System.out.println(s2);

    }
}

// Student S1= new Student();
// Student is a class, S1 is an reference name, new is a operator, Student() is a constructor
// constructor is a special method to create an object
