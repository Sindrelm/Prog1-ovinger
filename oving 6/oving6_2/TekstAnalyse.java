import java.util.Arrays;

public class TekstAnalyse{

    private String tekst;
    private char tegn;
    private int[] antallTegn;
    private char bokstav;


    //konstruktør for tekstanalyse
    public TekstAnalyse(String tekst){
        antallTegn = new int[30];
        analyseMetode(tekst);
    }


    //metode for å plasere tegn i teksten
    public void analyseMetode(String tekst){
        tekst = tekst.toLowerCase();
        int lengde = tekst.length();
        int i = 0;

        while (i < lengde){
            tegn = tekst.charAt(i);
            if(tegn >= 'a' && tegn <= 'z'){
                antallTegn[tegn - 97]++;
            }
            else if(tegn == 'æ'){
                antallTegn[26]++;
            }
            else if(tegn == 'ø'){
                antallTegn[27]++;
            }
            else if(tegn == 'å'){
                antallTegn[28]++;
            }
            else{
                antallTegn[29]++;
            }
            i = i +1;
        }
    }

    //metode for å finne antall bokstaver i teksten
    public int getAntallBokstaver(){
        int antall = 0;
        int i = 0;
        while (i < 29){
            antall = antall + antallTegn[i];
            i = i + 1;
        }
        return antall;
    }

    //metode for å finne forskjellige bokstaver
    public int getAntallUnikeBokstaver(){
        int antall = 0;
        int i = 0;
        while (i<29){
            if(antallTegn[i] != 0){
                antall = antall + antallTegn[i]/antallTegn[i];
            }
            i = i + 1;
        }
        return antall;
    }

    //metode for hvor stor andell av teksten er bokstaver i %
    public String getProsentIkkeBokstaver(){
        double total = getAntallBokstaver() + antallTegn[29];
        double antall = antallTegn[29];
        double prosent = (antall / total) * 100;
        return Math.round(prosent) + "%"; 
}

    //metode for å finne forekomst av bokstav
    public int getForekomstBokstav(String bokstavString){
        bokstavString = bokstavString.toLowerCase();
        char bokstav = bokstavString.charAt(0);
        int forekomst = 0;
        if(bokstav >= 'a' && bokstav <= 'z'){
            forekomst = antallTegn[bokstav - 97];
        }
        else if(bokstav == 'æ'){
            forekomst = antallTegn[26];
        }
        else if(bokstav == 'ø'){
            forekomst = antallTegn[27];
        }
        else if(bokstav == 'å'){
            forekomst = antallTegn[28];
        }
        return forekomst;
    }
    
    //metode for å finne bokstaven/bokstavene som forekommer oftest
    public String getForekommerOftest(){
        int i = 0;
        int maxBokstav = 0;
        int bokstavNr = 0;
        char bokstav = 'a';
        char bokstav2 = 'b';
        int bokstavNr2 = 0;
        boolean svar2 = false; 
        while(i < 30){
            if (antallTegn[i] > maxBokstav){
                maxBokstav = antallTegn[i];
                bokstavNr = i;
            }
            i = i + 1;
        }
        i = bokstavNr + 1;
        while(i<30){
            if(antallTegn[i] == maxBokstav){
                bokstavNr2 = i;
                svar2 = true;
            }
            i = i + 1;
        }
        if (svar2 == true){
            bokstav = getBokstavFraNr(bokstavNr);
            bokstav2 = getBokstavFraNr(bokstavNr2);
            return bokstav + " og " + bokstav2;
        }
        bokstav = getBokstavFraNr(bokstavNr);
        return "" + bokstav;
    }


    //metode for å gå fra bokstavNr til bokstaven
    public char getBokstavFraNr(int bokstavNr){
        bokstavNr = bokstavNr + 97;
        if (bokstavNr < 123){
            bokstav = (char) bokstavNr;
        }
        else if(bokstavNr == 123){
            bokstav = 'æ';
        }
        else if(bokstavNr == 124){
            bokstav = 'ø';
        }
        else if(bokstavNr == 125){
            bokstav = 'å';
        }
        return bokstav;
    }

    //Metode for å hente tabell
    public String getAntallTegn(){
        return Arrays.toString(antallTegn);
    }
}