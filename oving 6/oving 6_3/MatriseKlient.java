public class MatriseKlient {
    
    public static void main(String[] args){

        double[][] data1 = {
            {1, 2},
            {2, 1}
        };
        double[][] data2 = {
            {1, 2},
            {2, 1},
            
        };

        //oppretter matrise objekt
        Matrise matrise1 = new Matrise(data1);
        Matrise matrise2 = new Matrise(data2);

        //printer matrisene
        System.out.println("Matrisene:");
        matrise1.print();
        System.out.println("");
        matrise2.print();

        System.out.println("");

        //kaller på metode for å addere matriser og printer
        System.out.println("Addisjon:");
        Matrise addisjonResultat = matrise1.add(matrise2);
        if (addisjonResultat == null){
            System.out.println("ikke mulig å addere grunnet ulike dimensjoner");
        }
        else{
            addisjonResultat.print();
        }
       
        System.out.println("");

        //kaller på metode for å multiplisere matriser og printer
        System.out.println("Multiplikasjon:");
        Matrise multiplikasjonResultat = matrise1.multiply(matrise2);
        if (multiplikasjonResultat == null){
            System.out.println("ikke mulig å addere grunnet ulike dimensjoner");
        }
        else{
            multiplikasjonResultat.print();
        }

        System.out.println("");

        //kaller på metode for å transponere matrise
        System.out.println("Transponert:");
        Matrise transponert = matrise2.transpose();
        transponert.print();

        
    }

}
