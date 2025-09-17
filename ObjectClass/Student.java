package ObjectClass;

public class Student {
String name;
private int total;
char grade(){
    if(total>=70) return 'A';
    else if(total>=50) return 'B';
    return 'F';
    }

    public void setTotal(int total) {
        if(total>=0 && total<=100)
        this.total = total;
    }
}

//package statement is always the first statement in a java file because it defines the folder structure
// without public is a friendly function, can be accessed within the same package