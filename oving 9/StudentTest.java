import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Sindre", 0);

        String navn = student1.getNavn();
        System.out.println(navn);

        int oppgaver = student1.getAntOppg();
        System.out.println(oppgaver);

        student1.økAntOppg(3);
        oppgaver = student1.getAntOppg();
        System.out.println(oppgaver);

        String student = student1.toString();
        System.out.println(student);


        System.out.println("");

        ArrayList<Student> studenter = new ArrayList<Student>();

        OppgaveOversikt oppgaveOversikt = new OppgaveOversikt(studenter, 0);

        oppgaveOversikt.regStud(student1);
        oppgaveOversikt.regStud(new Student("Bjarte", 5));

        int antStud = oppgaveOversikt.getAntStud();
        System.out.println(antStud);

        int oppgSindre = oppgaveOversikt.getAntOppgStud("Sindre");
        System.out.println(oppgSindre);

        int oppgBjarte = oppgaveOversikt.getAntOppgStud("Bjarte");
        System.out.println(oppgBjarte);

        System.out.println("");
        System.out.println(oppgaveOversikt.toString());

    }
}

