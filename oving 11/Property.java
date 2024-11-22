public class Property {
    private String nameOfOwner;
    private String lotName;
    private String muncipalityName;
    private int muncipalityNumber;
    private int gnr;
    private int bnr;
    private double lotSize;

    public Property(String muncipalityName, int muncipalityNumber, int gnr, int bnr, String lotName, double lotSize, String nameOfOwner) {
        if (muncipalityNumber < 101 || muncipalityNumber > 5054) {
            throw new IllegalArgumentException("Muncipality number must be between 101 and 5054");
        }
        if (gnr < 0) {
            throw new IllegalArgumentException("Gnr must be a positive number");
        }
        if (bnr < 0) {
            throw new IllegalArgumentException("Bnr must be a positive number");
        }
        this.nameOfOwner = nameOfOwner;
        this.lotName = lotName;
        this.muncipalityName = muncipalityName;
        this.muncipalityNumber = muncipalityNumber;
        this.gnr = gnr;
        this.bnr = bnr;
        this.lotSize = lotSize;
    }

    public String toString() {
        return "Name of owner: " + nameOfOwner + "\n" + "Lot name: " + lotName + "\n" + "Muncipality name: " + muncipalityName + "\n" + "Muncipality number: " + muncipalityNumber + "\n" + "Gnr: " + gnr + "\n" + "Bnr: " + bnr + "\n" + "Lot size: " + lotSize;
    }

    public double getSize() {
        return lotSize;
    }

    public int getGnr() {
        return gnr;
    }

    public int getBnr() {
        return bnr;
    }

    public int getMuncipalityNumber() {
        return muncipalityNumber;
    }


    
}