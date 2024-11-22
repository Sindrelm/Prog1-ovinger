import java.util.ArrayList;

public class PropertyRegister {
    private ArrayList<Property> properties;
    
    public PropertyRegister() {
        properties = new ArrayList<Property>();
    }

    public void addProperty(Property property) {
        properties.add(property);
    }

    public void printRegister() {
        int i = 0;
        while(i < properties.size()) {
            System.out.println(properties.get(i).toString());
            System.out.println("");
            i ++;
        }
    }

    public double getAverageArea() {
        double area = 0;
        int i = 0;
        while(i < properties.size()) {
            area += properties.get(i).getSize();
            i ++;
        }
        return area / properties.size();
    }

    public String search(int muncipalityNumber, int gnr, int bnr) {
        int i = 0;
        while (i < properties.size()) {
            if (properties.get(i).getMuncipalityNumber() == muncipalityNumber && properties.get(i).getGnr() == gnr && properties.get(i).getBnr() == bnr) {
                return properties.get(i).toString();
            }
            i ++;
        }
        return "Property not found";
    }

    public void getPropertiesWithGnr(int gnr) {
        int i = 0;
        while (i < properties.size()) {
            if (properties.get(i).getGnr() == gnr) {
                System.out.println(properties.get(i).toString());
                System.out.println("");
            }
            i ++;
        }
    }
}
