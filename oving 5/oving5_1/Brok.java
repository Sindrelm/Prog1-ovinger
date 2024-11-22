
import java.util.Arrays;



public class Brok{

    private int teller;
    private int nevner;
    private int produktNevner;
    private int produktTeller;
    private int kvotientNevner;
    private int kvotientTeller;
    private int sumTeller;
    private int sumNevner;
    private int differensNevner;
    private int differensTeller;
    


    public Brok(int teller, int nevner){
        if (nevner == 0){
            throw new IllegalArgumentException("Nevner kan ikke være lik 0");
        }
        this.teller = teller;
        this.nevner = nevner;
    }

    public Brok(int teller){
        this.teller = teller;
        nevner = 1;
    }

    public int getTeller(){
        return teller;
    }
    public int getNevner(){
        return nevner;
    }


    public int[] forkortBrok(int teller, int nevner){
        int i = 2;
        while (i < teller + 1 & i < nevner + 1){
            int restNevner = nevner % i;
            int restTeller = teller % i;

            if (restNevner == 0 & restTeller == 0){
                teller = teller / i;
                nevner = nevner / i;
            }

            else{
                i = i + 1;
            }
        }
        int brok[]= {teller, nevner};
        return brok;
    }

    public void getProdukt(Brok Brok1){
        produktTeller = teller * Brok1.getTeller();
        produktNevner = nevner * Brok1.getNevner();

        System.out.println(Arrays.toString(forkortBrok(produktTeller, produktNevner)));
        
    }


    public void getKvotient(Brok Brok1){
        kvotientTeller = teller * Brok1.getNevner();
        kvotientNevner = nevner * Brok1.getTeller();

        System.out.println(Arrays.toString(forkortBrok(kvotientTeller, kvotientNevner)));
    }



    public void getSum(Brok Brok1){
        sumNevner = nevner * Brok1.getNevner();
        sumTeller = teller * Brok1.getNevner() + Brok1.getTeller() * nevner;

        System.out.println(Arrays.toString(forkortBrok(sumTeller, sumNevner)));

    }



    public void getDifferens(Brok Brok1){
        differensNevner = nevner * Brok1.getNevner();
        differensTeller = teller * Brok1.getNevner() - Brok1.getTeller() * nevner;

        System.out.println(Arrays.toString(forkortBrok(differensTeller, differensNevner)));

    }

    public static void main(String[] args) {
    
        Brok test1 = new Brok(1, 2);

        Brok test2 = new Brok(1, 1);

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

    




