
import java.util.Scanner;

public class valutaKalk {

    public static void main(String[] args)
    {
    
    //lager objekter fra klassen valuta
    Valuta euro = new Valuta("Euro", 11.94);
    Valuta baht = new Valuta("baht", 0.32);
    Valuta dong = new Valuta("Dong", 0.00044);

    System.out.println("///////////////////////");
    System.out.println("Hvilken valuta ønsker du?");
    System.out.println("1: Euro");
    System.out.println("2: Baht");
    System.out.println("3: Dong");
    System.out.println("4: avslutt");
    Scanner meny = new Scanner(System.in);        //bruker velger fra menyen
    int valg = meny.nextInt();

    Valuta valutatype;  //definerer variabelen valutatype med datatypen Valuta
        switch (valg) {
            case 1 -> {
                valutatype = euro;
            }
            case 2 -> {
                valutatype = baht;
            }
            case 3 -> {
                valutatype = dong;
            }
            case 4 -> {
                System.out.println("avslutter");
                valutatype = euro;
                System.exit(0);
            }
            default -> {
                System.out.println("dette er ikke en gyldig input, avslutter");
                valutatype = euro;
                System.exit(0);
            }
        }
        System.out.println("////////////////");
        System.out.println("1: til nok");
        System.out.println("2: fra nok");

        valg = meny.nextInt();
            switch (valg)
            {
                case 1 -> 
                {
                    System.out.println("sett in beløp");
                    valg = meny.nextInt();
                    double beløp = valg;
                    System.out.println(valutatype.tilNok(beløp) + "nok");
                }
                case 2 -> 
                {
                    System.out.println("sett in beløp");
                    valg = meny.nextInt();
                    double beløp = valg;
                    System.out.println(valutatype.fraNok(beløp));
                }


                
            }

    
    }
}
