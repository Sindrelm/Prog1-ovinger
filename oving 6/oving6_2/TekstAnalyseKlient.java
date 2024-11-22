import java.util.Scanner;

public class TekstAnalyseKlient {
    public static void main(String[] args) {
        boolean kjør = true;
        boolean kjør2;
        Scanner input = new Scanner(System.in);
        
        while (kjør == true){
            kjør2 = true;
            System.out.println("input teksten du vil analysere");
            String tekst = input.nextLine();
            System.out.println("");

            TekstAnalyse analyse = new TekstAnalyse(tekst);

            System.out.println("Det er: " + analyse.getAntallBokstaver() + " bokstaver i teksten");
            System.out.println("");

            System.out.println("Det er: " + analyse.getAntallUnikeBokstaver() + " unike bokstaver i teksten");
            System.out.println("");

            System.out.println(analyse.getProsentIkkeBokstaver() + " av teksten er ikke bokstaver");
            System.out.println("");

            System.out.println(analyse.getForekommerOftest() + " forekommer oftest i teksten");
            System.out.println("");

            while(kjør2 == true){
                System.out.println("hva ønsker du å gjøre videre?");
                System.out.println("1: utforske forekomst av en spesifikk bokstav i teksten");
                System.out.println("2: analysere en ny tekst");
                System.out.println("3: avslutte");

                int valg = input.nextInt();

                input.nextLine();

                switch (valg){
                    case 1 ->{
                        System.out.println("");
                        System.out.println("Hvilken bokstav ønsker du å utforske?");

                        String bokstav = input.nextLine();

                        System.out.println("");
                        System.out.println("bokstaven " + bokstav + " forekommer " + analyse.getForekomstBokstav(bokstav) + " ganger i teksten");
                    }
                    case 2 ->{
                        kjør2 = false;
                    }
                    case 3 ->{
                        kjør2 = false;
                        kjør = false;
                    }
                }
            }
            
   
        }
    }


}
