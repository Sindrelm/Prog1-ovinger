

public class Valuta
{
    private double kurs;
    private String valutaNavn;


    //metode for å lage nytt valuta objekt
    public Valuta(String valutaNavn, double kurs)
    {
        this.valutaNavn = valutaNavn;
        this.kurs = kurs;
    }

    //metode for å omregne til kr
    public double tilNok(double beløp)
    {
        return beløp * kurs;
    } 

    //metode for å omregne fra kr
    public double fraNok(double beløp)
    {
        return beløp / kurs;
    }

    //metode for å hente navnet på valutaen
    public String getValutaNavn()
    {
        return valutaNavn;
    }
}
