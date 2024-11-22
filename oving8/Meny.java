import java.util.Scanner;

public class Meny {
    public static void main(String[] args){
        Person person1 = new Person("Sindre", "Mjøs", 2004);
        ArbTaker arbTaker1 = new ArbTaker(person1, 123456789, 2022, 30000, 20);
        
        boolean kjør = true;
        while(kjør == true){
            System.out.println("//////////////////////////////");
            System.out.println("Informasjon om arbeidstaker:");
            System.out.println("Navn: " + arbTaker1.getNavn());
            System.out.println("Arbeidstakernr: " + arbTaker1.getarbtakernr());
            System.out.println("Ansettelsesår: " + arbTaker1.getAnsettelsesår());
            System.out.println("Månedslønn: " + arbTaker1.getMånedslønn());
            System.out.println("Skatteprosent: " + arbTaker1.getSkatteprosent());
            System.out.println("Bruttolønn: " + arbTaker1.getBruttolønn());
            System.out.println("Alder: " + arbTaker1.getAlder());
            System.out.println("År ansatt: " + arbTaker1.getÅrAnsatt());
            System.out.println("Skattetrekk per måned: " + arbTaker1.getSkattetrekkMåned());
            System.out.println("Skattetrekk per år: " + arbTaker1.getSkattetrekkÅr());
            System.out.println("//////////////////////////////");

            System.out.println("//////////////////////////////");
            System.out.println("Hva vild du gjøre videre?");
            System.out.println("1. Endre månedslønn");
            System.out.println("2. Endre skatteprosent");
            System.out.println("3. Avslutt");
            System.out.println("//////////////////////////////");

            Scanner scanner = new Scanner(System.in);
            int valg = scanner.nextInt();

            switch(valg){
                case 1:
                    System.out.println("Skriv inn ny månedslønn:");
                    int nyMånedslønn = scanner.nextInt();
                    arbTaker1.setMånedslønn(nyMånedslønn);
                    break;
                case 2:
                    System.out.println("Skriv inn ny skatteprosent:");
                    int nySkatteprosent = scanner.nextInt();
                    arbTaker1.setSkatteprosent(nySkatteprosent);
                    break;
                case 3:
                    System.out.println("Avslutter...");
                    kjør = false;
                    break;
                default:
                    System.out.println("Ugyldig valg");
                    break;
            }
        }
    }
}
