public class oving1_3 {

    public static void main(String[] args) {

        //øving 1_3
        //omgjør en mengde sekund til timer, minutter og sekunder

    
        int totalsek = 1000;        // sett inn totalt antall sekund
        int totalsek1 = totalsek;   // definerer variabel som endres for sekund

        int hours = totalsek1 / (60*60);            // heltdalsdivisjon, finner antall timer
        totalsek1 = totalsek1 - hours * (60*60);    // regner ut ny verdi for resterende sekund til omregning

        int min = totalsek1 / 60;                   // heltalsdivisjon, finner antall minutt
        totalsek1 = totalsek1 - min * 60;           // regner ut ny verdi for resterende sekund til omregning

        int sek = totalsek1;                        // Definerer sekund som den resterende mengden av totale sekunder


        System.out.println(totalsek + " sekund tilsvarer " + hours + " timer, " + min + " minutter og " + sek + " sekunder");   //printer resultat
        
        

    }
    
}
