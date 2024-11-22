
import java.util.Arrays;




public class tilfeldigTallForekomst{

    public static void main(String[] args){
        java.util.Random random = new java.util.Random();

        int[] antall = new int[10];
        int i = 1;
        while(i <= 1000){
            int tall = random.nextInt(10);
            //System.out.println(tall);  (feilkjøring)
            antall[tall] += 1;
            i += 1;
        }
        System.out.println(Arrays.toString(antall));
        
    }
}