import static javax.swing.JOptionPane.*;

public class oving3_1 {
    
        public static void main(String[] args) {
        
        String readnumber = showInputDialog("Dette programmnet skriver ut en del av gangetabellen, hvilken del skal programmet starte på?: ");
        String readnumber2 = showInputDialog("hvilken del skal programmet slutte på?: ");

        int i = 0;
        int t = Integer.parseInt(readnumber);
        int n = Integer.parseInt(readnumber2);
        
        while (t < n+1){
            System.out.println(t + "-gangen:");

            while (i < 10 ){
                i = i+1;
                int tall = i * t;
                System.out.println(t + "*" + i + "=" + tall);
            }
        i = 0;
        t = t+1;  
        }

    
    }
}

