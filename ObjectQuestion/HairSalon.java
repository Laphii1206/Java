package ObjectQuestion;
class HairSalon {
    String ServiceDescription;
    double Price;
    int avgTime;
    
    public HairSalon(String s, double p, int a){
        ServiceDescription = s;
        Price = p;
        avgTime = a;
    }
    public double getPrice(){
        return Price;
    }


    public static HairSalon findCheapestHairSalon(HairSalon[] h){
        HairSalon cheapest = h[0];

        for(int i=1;i<h.length;i++){
            if (cheapest == null){
                cheapest = h[i];
                continue;
            }
            if(h[i].Price<cheapest.Price){
                cheapest = h[i];
            }
        }
        return cheapest;
    }
    public static void main(String[] args) {
                    HairSalon MySalon[] = new HairSalon[2];
            MySalon[0] = new HairSalon("Cut", 12.00, 10);
            MySalon[1] = new HairSalon("Trim", 69.50, 65);

    }
}

