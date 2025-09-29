package ObjectClass;
//blueprint
public class Student {
    static int count=0;
String name,id;
private int total=100;
{
    count++;
//generate id
//add record to database
}
public Student(){ // default constructor
    name="unknown";
    total=0;
}
public Student(String name){ // parameterized constructor
    this.name=name; // this is a reference variable that refers to the current object
}

public Student(String name,int total){ // parameterized constructor
    this.name=name;
    this.total=total;
}

public void setStudent(String name,int total){
    this.name=name;
    this.total=total;
}

@Override
public String toString(){ // override the toString() method of Object class
    return name +" "+ total + " "+ grade();
}

char grade(){
    if(total>=70) return 'A';
    else if(total>=50) return 'B';
    return 'F';
    }

    public void setTotal(int total) {
        if(total>=0 && total<=100)
        this.total = total;
    }
    public int getTotal(){
        return total;
    }

}

//package statement is always the first statement in a java file because it defines the folder structure
// without public is a friendly function, can be accessed within the same package
