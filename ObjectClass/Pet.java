package ObjectClass;

public class Pet {
    String species;
    String name;
    int months;

    public Pet(String name, String species, int months) {
        this.name = name;
        this.species = species;
        this.months = months;
    }
    
    double price(){
        switch(species){
            case "Cat": {
                if(months < 12) {
                    return 120.0;
                } else {
                    return 180.0;
                }
            }
            case "Dog": {
                if(months < 12) {
                    return 150.0;
                } else {
                    return 250.0;
                }
            }
            case "Hamster": {
                if(months < 12) {
                    return 80.0;
                } else {
                    return 130.0;
                }
            }
            default: return 0;
        }
    }

public String toString() {
    return "Pet: " + name + ", " + species + ", " + months + " months, Price: RM" + price();
}

}
