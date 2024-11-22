public class KlienTest {
    public static void main(String[] args) {
        Person person = new Person("Ola", "Nordmann", 1990);
        ArbTaker arbTaker = new ArbTaker(person, 123456789, 2010, 30000, 20);
        System.out.println("navn:");
        System.out.println(arbTaker.getNavn());
        System.out.println("");
        System.out.println("arbtakernr:");
        System.out.println(arbTaker.getarbtakernr());
        System.out.println("");
        System.out.println("Ansettelsesår:");
        System.out.println(arbTaker.getAnsettelsesår());
        System.out.println("");
        System.out.println("Månedslønn:");
        System.out.println(arbTaker.getMånedslønn());
        System.out.println("");
        System.out.println("Skatteprosent:");
        System.out.println(arbTaker.getSkatteprosent());
        System.out.println("");
        System.out.println("Bruttolønn:");
        System.out.println(arbTaker.getBruttolønn());
        System.out.println("");
        System.out.println("Alder:");
        System.out.println(arbTaker.getAlder());
        System.out.println("");
        System.out.println("År ansatt:");
        System.out.println(arbTaker.getÅrAnsatt());
        System.out.println("");
        System.out.println("Skattetrekk per måned:");
        System.out.println(arbTaker.getSkattetrekkMåned());


       
    }
}
