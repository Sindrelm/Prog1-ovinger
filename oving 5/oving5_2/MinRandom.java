
public class MinRandom{

    private int heltall;
    private double desimaltall;
    private final java.util.Random random;

    public MinRandom(){
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
        MinRandom randomTall = new MinRandom();
        int i = 0;

        while (i < 10){
            System.out.println("heltall nr" + i + ": " + randomTall.nesteHeltall(0,10));
            System.out.println("desimaltall nr" + i + ": " + randomTall.nesteDesimaltall(0, 10));
            System.out.println("");
            i = i + 1;
        }
        
        
    }
}