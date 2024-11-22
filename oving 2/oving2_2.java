
public class oving2_2 {
        public static void main(String[] args) {


            double aPris = 35.9;    //pris på kjøttdeig i kr
            double bPris = 39.5;    

            double aVekt = 0.45;     //vekt i kg
            double bVekt = 0.5;

            double aKilopris = aPris / aVekt;
            double bKilopris = bPris / bVekt;

            if (aKilopris < bKilopris){
                    System.out.println("kjøttdeig a med en kilopris på " + aKilopris + 
                    "kr er billigere enn kjøttdeig b med en kilopris på" + bKilopris + "kr");
             }

            else {
                 if (aKilopris > bKilopris) {
                     System.out.println("kjøttdeig b med en kilopris på " + bKilopris + 
                     "kr er billigere enn kjøttdeig a med en kilopris på" + aKilopris + "kr");
                     }

                 else {
                      System.out.println("kjøttdeigene er like dyre med en kilopris på" + aKilopris + "kr");
                  }
                }
            
                  }



            }
