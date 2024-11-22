public class ArbTaker {
    
    private final Person person;
    private final long arbtakernr;
    private final int ansettelsesår;
    private double månedslønn;
    private int skatteprosent;

    public ArbTaker(Person person, long arbtakernr, int ansettelsesår, double månedslønn, int skatteprosent){
        this.person = person;
        this.arbtakernr = arbtakernr;
        this.ansettelsesår = ansettelsesår;
        this.månedslønn = månedslønn;
        this.skatteprosent = skatteprosent;
    }

    //get metoder:
    public String getNavn(){
        String navn = this.person.getEtternavn() + ", " + this.person.getFornavn(); 
        return navn;
    }
    public long getarbtakernr(){
        return arbtakernr;
    }
    public int getAnsettelsesår(){
        return ansettelsesår;
    }
    public double getMånedslønn(){
        return månedslønn;
    }
    public int getSkatteprosent(){
        return skatteprosent;
    }
    public double getBruttolønn(){
        return månedslønn;
    }
    public int getAlder(){
        java.util.Calendar nå = java.util.Calendar.getInstance();
        int år = nå.get(java.util.Calendar.YEAR);
        int alder = år - person.getFødselsår();
        return alder;
    }
    public int getÅrAnsatt(){
        java.util.Calendar nå = java.util.Calendar.getInstance();
        int år = nå.get(java.util.Calendar.YEAR);
        int årAnsatt = år - ansettelsesår;
        return årAnsatt;
    }

    public double getSkattetrekkMåned(){
        double skatteTrekk = månedslønn * skatteprosent / 100;
        return skatteTrekk;
    }
    public double getSkattetrekkÅr(){
        double skattetrekk = månedslønn * 10.5 / 100;
        return skattetrekk;
    }


    //set metoder
    public void setMånedslønn(int nyMånedslønn){
        månedslønn = nyMånedslønn;
    }
    public void setSkatteprosent(int nySkatteprosent){
        skatteprosent = nySkatteprosent;
    }

    //andre metoder
    public boolean ansattLengreEnn(int år){
        int årAnsatt = getÅrAnsatt();
        return årAnsatt > år;
    }
    
}
