import java.util.ArrayList;

public class OppgaveOversikt{

    private ArrayList<Student> studenter;
    private int antStud;

    public OppgaveOversikt(ArrayList<Student> studenter, int antStud) {
        this.studenter = studenter;
        this.antStud = antStud;
    }

    public void regStud(Student nyStudent) {
        studenter.add(nyStudent);
        antStud += 1;
    }

    public int getAntStud() {
        return antStud;
    }

    public int getAntOppgStud(String navn) {
        int i = 0;
        while (i < studenter.size()) {
            if (studenter.get(i).getNavn().equals(navn)) {
                return studenter.get(i).getAntOppg();
            }
            i++;
        }
        return -1;
    }

    public void økOppgStud(String navn, int økning) {
        int i = 0;
        while (i < studenter.size()) {
            if (studenter.get(i).getNavn().equals(navn)) {
                System.out.println("jepp");
                studenter.get(i).økAntOppg(økning);
            }
            i++;
        }
    }

    public String toString() {
        return "OppgaveOversikt{" +
                "studenter=" + studenter.toString() +
                ", antStud=" + antStud +
                '}';
    }
}