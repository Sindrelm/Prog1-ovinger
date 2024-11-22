import static javax.swing.JOptionPane.*;

public class oving2_1 {
    public static void main(String[] args) {
        
        String readnumber = showInputDialog("årstall: ");       //bruker deffinert input
        
        int year = Integer.parseInt(readnumber);                //angir variabelen year som den brukerdeffinerte inputten

        int rest = year % 4;
        int rest2 = year % 400;                                    //Finner resten av årstallet dividert med 4

        if (rest!= 0){                                  
            System.out.println(year + " er ikke et skuddår");     //dersom resten av årstaller dividert med 4 ikke er null, så er ikke årstallet et skuddår
        }
        
        else {                                                    //start på ny blokk inne i blokken
            if (rest2 == 0) {                                       
                System.out.println(year + " er ett hundreår");    //dersom årstallet delt på 400 ikke får noe rest, er året ett hundreår
            }
            else {
                System.out.println(year + " er et skuddår");      //Dersom året ikke har rest delt på 4 men rest delt på 400 er det et skuddår
            }
        }                                                         
    }                                                             
}
