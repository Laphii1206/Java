package ObjectQuestion;
class Month {
    private String name;
    private int days;

    public Month(String n,int d){
        this.name = n;
        this.days = d;
    }
    public String getName(){
        return name;
    }
    public int getDays(){
        return days;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDays(int days){
        this.days = days;
    }
    public String toString(){
        return name + ": "+ days + " days";
    }
public static void main(String[] args) {
        Month month[] = new Month[12];
        month[0] = new Month("January", 31);
        month[1] = new Month("February", 28);
        for(int i= 0;i<month.length;i++){
            System.out.println(month[i]);
        }
}
}
