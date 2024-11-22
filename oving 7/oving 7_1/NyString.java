public class NyString{

    public String string;

    public NyString(String string)
    {
        this.string = string;
    }

    public String forkort()
    {
        String[] string2 = string.split(" "); 
        StringBuilder resultat = new StringBuilder();

        int i = 0;
        while(i < string2.length)
        {
            resultat.append(string2[i].charAt(0));
            i = i + 1;
        }

        return resultat.toString();
    }

    public String fjernTegn(char tegn) 
    {
        StringBuilder resultat = new StringBuilder();
        int i = 0;

        while (i < string.length()) {
            int posisjon = string.indexOf(tegn, i);

            if (posisjon == -1) {
                resultat.append(string.substring(i));
                break;
            }

            resultat.append(string.substring(i, posisjon));

            i = posisjon + 1;
        }

        return resultat.toString();
    }
}