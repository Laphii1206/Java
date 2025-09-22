package ObjectClass;

public class Student {
String name;
private int total;
char grade(){
    if(total>=70) return 'A';
    else if(total>=50) return 'B';
    return 'F';
    }
public Student(){
    name = "N/A";
    total = 0;
}
public Student(String name,int total){
    this.name = name;
    this.total = total;
}  
    
    public void setTotal(int total) {
        if(total>=0 && total<=100)
        this.total = total;
    }
    public int getTotal(){
        return total;
    }
public String toString(){
    return name + " " + total + " " + grade();
}
}

//package statement is always the first statement in a java file because it defines the folder structure
// without public is a friendly function, can be accessed within the same package
