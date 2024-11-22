public class MinRandomTest {
    

    private int heltall;
    private double desimaltall;
    private java.util.Random random;

    public MinRandomTest(){
        random = new java.util.Random();
    }

    public int nesteHeltall(int nedre, int øvre){
        heltall = random.nextInt(øvre - nedre) + nedre;
        return heltall;

    }

    public double nesteDesimaltall(double nedre, double øvre){
        desimaltall = random.nextDouble(øvre - nedre) + nedre;
        return desimaltall;

    }

    public static void main(String[] args) {
        MinRandomTest random = new MinRandomTest();
        System.out.println(random.nesteHeltall(0,10));
        System.out.println(random.nesteDesimaltall(0.1, 9.9));

        
        
    }
}
