package ObjectQuestion;

class Country {

    private String countryName;
    private int activeCase;

    public String getCountry() {    
        return countryName;
    }

    public double getActiveCase() {
        return activeCase;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setActiveCase(int activeCase) {
        this.activeCase = activeCase;
    }

    public boolean isRedZone() {
        if (activeCase > 500) {
            return true;
        } else {
            return false;
        }
    }

    public int countRedZoneCountry(Country[] countryList) {
        int count = 0;
        for (int i = 0; i < countryList.length - 1; i++) {
            if (countryList[i].isRedZone() == true) {
                count++;
            }

        }
        return count;

    }

}

class COVIDTest {

    public static void main(String[] args) {
        Country[] countryList = new Country[200];

    }
}
