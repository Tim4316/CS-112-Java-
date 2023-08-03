public class Limousine extends Automobile {
    private boolean sunroof;
    private int numbottles;

    public Limousine(String make, String model, int year, int numSeats, boolean sunroof, int numbottles) {
        super(make, model, year, numSeats);
        this.sunroof = sunroof;
        this.numbottles = numbottles;
            if (numbottles < 0)
                throw new IllegalArgumentException();

    }

    public boolean sunroof() {
        return this.sunroof; 
    }

    public int numbottles() {
        return this.numbottles;
    }

    public String toString() {
        String str = super.toString();
        str = str + " (seats up to " + (super.getNumSeats() - 2) + "customers)";
        return str;
    } 
}
