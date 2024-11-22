import java.util.ArrayList;
import java.util.Scanner;

public class klient {

    public static void main(String[] args) {
        ArrayList<Student> studenter = new ArrayList<Student>();
        OppgaveOversikt oppgaveOversikt = new OppgaveOversikt(studenter, 0);

        Scanner input = new Scanner(System.in);
        boolean kjør = true;
        while (kjør == true) {
            System.out.println("hva ønsker du å gjøre?");
            System.out.println("    1 - skrive ut antall studenter");
            System.out.println("    2 - Registrer ny student");
            System.out.println("    3 - Finne ut hvor mange oppgaver en student har løst");
            System.out.println("    4 - Skrive ut oversikt over alle studenter og oppgaver løst");
            System.out.println("    5 - Øke antall oppgaver en student har løst");
            System.out.println("    6 - Avslutt");
            System.out.println("");
            int valg = input.nextInt();
            input.nextLine();

            switch(valg){
                case 1 -> {
                    int antStud = oppgaveOversikt.getAntStud();
                    System.out.println("Antall studenter er: " + antStud);
                }
                case 2 -> {
                    System.out.println("hva er navnet til Studenten?");
                    String navn = input.nextLine();
                    oppgaveOversikt.regStud(new Student(navn, 0));
                }
                case 3 -> {
                    System.out.println("hva er navnet til Studenten?");
                    String navn = input.nextLine();
                    System.out.println("Studenten har løst: " + oppgaveOversikt.getAntOppgStud(navn));
                }
                case 4 -> {
                    System.out.println(oppgaveOversikt.toString());
                }
                case 5 -> {
                    System.out.println("hva er navnet til studenten?");
                    String navn = input.nextLine();
                    System.out.println("hvor mange oppgaver skal det økes med?");
                    int opg = input.nextInt();
                    input.nextLine();
                    System.out.println(opg);
                    oppgaveOversikt.økOppgStud(navn, opg);
                }
                case 6 -> {
                    kjør = false;
                }
                
            }
        } 
        input.close();
    }
    
}
