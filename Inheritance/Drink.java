package Inheritance;

public abstract class Drink {
protected int ml;
protected String packaging;
protected String flavor;
public Drink(int ml, String packaging, String flavor) {
this.ml=ml;
this.packaging=packaging;
this.flavor=flavor;
}
public abstract boolean isHealty();
public String toString(){
return "Flavor: " + flavor + "\nML: "+ml +
"\nPackaging: " + packaging;
}
}

