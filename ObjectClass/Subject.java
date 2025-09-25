package ObjectClass;

public class Subject {
String title;
private Coursework c1;
public Subject(String title, Coursework cw){
    this.title=title;
    this.c1=cw;}

public Subject(String title,String cwTitle,int percentage){
    this.title=title;
    this.c1=new Coursework("No title",0);
}

public String toString(){
    return title+" "+c1.title+" "+c1.getPercentage();
}

    public Coursework getC1() {
        return c1;
    }

    public void setC1(Coursework c1) {
        this.c1 = c1;
    }

}
