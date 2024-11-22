import java.util.Scanner;

public class TerningSpill {
    
    public static void main(String[] args) {
       
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Regler:");
        System.out.println("De to spillerne triller annenhver gang, første man som triller seg opp til summen 20 vinner.");
        System.out.println("Dersom man triller tallet 1, blir summen til denne spilleren satt tilbake til 0");
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
        
        Scanner navnScanner = new Scanner(System.in);

        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Skriv navnet til spiller 1:"); 
        String navn1 = navnScanner.next();  
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");     
        
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Skriv navnet til spiller 2:");  
        String navn2 = navnScanner.next(); 
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
        


        Spiller spiller1 = new Spiller(navn1, 0);
        Spiller spiller2 = new Spiller(navn2, 0);

        boolean kjør = true;                                //variable for å kjøre while løkke
        boolean tur = true;                                 //variabel for å avgjøre hvilken spiller som skal triller
        Scanner trillScanner = new Scanner(System.in);             //scanner for å trille terning
        int trill = 0;                                      //variabel for trill av terning
        boolean kjørTur = true;                             //variabel for kjøring av spillers tur
        int terningVerdi = 0;

        while (kjør == true)
        {
            int sumPoeng1 = spiller1.getSumPoeng();             //lagrer spillernes poeng i variabel
            int sumPoeng2 = spiller2.getSumPoeng();             //lagrer spillernes poeng i variabel
            kjørTur = true;                                    //oppdaterer kjør tur variabel

            // System.out.println(sumPoeng1);       feilkjøring
            
            if (sumPoeng1 < 20 && sumPoeng2 < 20)         //skjekker om summene fortsatt er under 100
            {   
                if (tur == true)                               //tur er true spiller 1 sin tur
                {
                    while(kjørTur == true)
                    {
                        
                        tur = false;
                        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");                                                             //oppdaterer tur variabel
                        System.out.println(spiller1.getSpillerNavn()+" sin tur, input tallet 1 for å trille");
                        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                        trill = trillScanner.nextInt();
                        if (trill == 1)
                        {
                            kjørTur = false;                    //avslutter spillerens tur
                            terningVerdi = spiller1.kastTerning();
                            if(terningVerdi == 1)
                            {
                                spiller1.resetPoeng();
                                System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                                System.out.println(spiller1.getSpillerNavn() + " trillet " + terningVerdi + " og har nå " + spiller1.getSumPoeng()+ " poeng");
                                System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                            }
                            else
                            {
                                spiller1.addSumPoeng(terningVerdi);
                                System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                                System.out.println(spiller1.getSpillerNavn() +" trillet " + terningVerdi + " og har nå " + spiller1.getSumPoeng()+ " poeng");
                                System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                            }
                            
                        }
                        else
                        {
                            System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                            System.out.println("koman, trill terningen kompis");
                            System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                        }
                    }
                    
                }
                else if (tur == false)                               //tur er false spiller 2 sin tur
                {
                    while(kjørTur == true)
                    {
                        tur = true;                                                                //oppdaterer tur variabel
                        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                        System.out.println(spiller2.getSpillerNavn()+" sin tur, input tallet 1 for å trille");
                        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                        
                        trill = trillScanner.nextInt();
                        if (trill == 1)
                        {
                            kjørTur = false;                                //avslutter spillerens tur
                            terningVerdi = spiller2.kastTerning();
                            if(terningVerdi == 1)
                            {
                                spiller2.resetPoeng();
                                System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                                System.out.println(spiller2.getSpillerNavn() + " trillet " + terningVerdi + " og har nå " + spiller2.getSumPoeng()+ " poeng");
                                System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                            }
                            else
                            {
                                spiller2.addSumPoeng(terningVerdi);
                                System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                                System.out.println(spiller2.getSpillerNavn() +" trillet " + terningVerdi + " og har nå " + spiller2.getSumPoeng()+ " poeng");
                                System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                            }
                        }
                        else
                        {
                            System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                            System.out.println("koman, trill terningen kompis");
                            System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                        }
                    }
                    
                }
                
            }
            else
            {
                kjør = false;                               //stopper kjøringen av while løkken
                if (tur == false)
                {
                    System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                    System.out.println("yuuuuhuuuu!! " +spiller1.getSpillerNavn() + " vant");
                    System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                }
                else
                {
                    System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                    System.out.println("yuuuuhuuuu!! " +spiller2.getSpillerNavn() + " vant");
                    System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
                }
            }
        }


    }

}
