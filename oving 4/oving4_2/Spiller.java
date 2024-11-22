

public class Spiller
{
    private String spillerNavn; 
    private int sumPoeng;

    //metode som lager nytt spiller objekt
    public Spiller(String spillerNavn, int sumPoeng)
    {
        this.spillerNavn = spillerNavn;
        this.sumPoeng = sumPoeng;
    }

    //metode for å hente total poengsum
    public int getSumPoeng()
    {
        return sumPoeng;
    }

    public String getSpillerNavn()
    {
        return spillerNavn;
    }

    public int resetPoeng()
    {
        return sumPoeng = 0;
    }

    public int addSumPoeng(int poeng)
    {
        return sumPoeng += poeng; 
    }

    //metode for å kaste terning
    public int kastTerning()
    {
        java.util.Random terning = new java.util.Random();      //lager tilfeldig tall generator
        int terningKast = terning.nextInt(6);
        return terningKast + 1;
    }

}