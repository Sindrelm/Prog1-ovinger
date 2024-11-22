import java.util.Arrays;
import java.util.List;

public class TekstBehandlingKlient{
    public static void main(String[] args) {
        String text = "Hei. Hadde vært nice om du godkjente øvingen min. Tusen takk!";

        TekstBehandling tekstBehandling = new TekstBehandling(text);

        String tekst = tekstBehandling.getText();
        System.out.println(tekst);

        int antallOrd = tekstBehandling.getNumberOfWords();
        System.out.println(antallOrd);

        int avaerageWordLength = tekstBehandling.getAverageWordLength();
        System.out.println(avaerageWordLength);

        int antallBokstaver = tekstBehandling.letterAmount();
        System.out.println(antallBokstaver);

        int averageWordLength = tekstBehandling.getAverageWordLength();
        System.out.println(averageWordLength);

        String storeBokstaver = tekstBehandling.getBigLetters();
        System.out.println(storeBokstaver);

        List<Integer> averageWordLengthPerSentence = tekstBehandling.getAverageWordLengthPerSentence();
        System.out.println((averageWordLengthPerSentence));

        String newText = tekstBehandling.changeWord("Tusen", "Tusentusen");
        System.out.println(newText);
    }
}


