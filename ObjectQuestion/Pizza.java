package ObjectQuestion;

class Pizza {
    private String name;
    private String description;
    private char size;
    private float discount=0;

    public Pizza(String n, String d,char s){
        this.name = n;
        this.description = d;
        this.size = s;
    }

    public void setDiscount(float d){
        this.discount = d;
    }
    public double price(char size){
        switch (size) {
            case 'P': return 9.9;
            case 'R': return 25.9;
            case 'L': return 37.9;
            default: return 0;
        }
    }
    public static void main(String[] args) {
        Pizza p[] = new Pizza[3];
        p[0] = new Pizza("Blazing Seafood", "Spicy sweet sour sauce, tuna, crabsticks,pineapples", 'L');
        p[1] = new Pizza("Chicken Pepperoni", "Tomato sauce, chicken pepperoni, mozzarella cheese", 'R');
        p[2] = new Pizza("Deluxe Cheese", "Tomato sauce, mozzarella cheese",'P');
        p[0].setDiscount(0.15f);
        p[1].setDiscount(0.15f);
        p[2].setDiscount(0.15f);

    }
}
