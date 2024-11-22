
import java.util.Scanner;   //scanner import

public class ny_oving3_2{

    public static void main(String[] args) {
        
        boolean start = true;        //boolean data har enten true eller false

        try (Scanner primtall = new Scanner(System.in)){
            
            System.out.println("skriv så alle tallene du øsnker å sjekke om er primtall, skriv 0 når du ikke vil teste flere tall");

            while(start == true){
                
                int nestePrimtall = primtall.nextInt();
                
                if (nestePrimtall == 0){
                    start = false;
                }
                else if (nestePrimtall <= 2){
                    System.out.println("dette programmet kan bare analysere tall over 2");

                }
                else{
                    int n = 2;
                    int rest = 0;


                    while (n < nestePrimtall) {
                        rest = nestePrimtall%n;

                        if(rest == 0){
                            System.out.println("tallet er ikke et primtall, siden tallet kan deles på " + n);
                            n = nestePrimtall;
                        }
                        n = n + 1;
                    }
                    if (rest!=0){
                        System.out.println("tallet " + n + "er et primtall");
                    }
                }
            }
        }
    }



}