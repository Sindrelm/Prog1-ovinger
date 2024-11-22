
public class BrokTest {
    
    public static void main(String[] args) {
    
        Brok test1 = new Brok(2, 6);

        Brok test2 = new Brok(1, 2);

        System.out.println(test1.getNevner());
        System.out.println(test2.getNevner());

        System.out.println("produkt:");
        test1.getProdukt(test2);

        System.out.println("kvotient:");
        test1.getKvotient(test2);

        System.out.println("Sum:");
        test1.getSum(test2);

        System.out.println("Differanse:");
        test1.getDifferens(test2);
    

    
    
    
    }
}
