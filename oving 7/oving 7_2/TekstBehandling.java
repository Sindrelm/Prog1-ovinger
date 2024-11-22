import java.util.ArrayList;
import java.util.List;


public class TekstBehandling{

    public String string;

    public TekstBehandling(String string)
    {
        this.string = string;
    }

    public int letterAmount(){
        String text = string.toLowerCase();
        int length = text.length();
        int i = 0;
        char letter = 'a';
        int letterAmount = 0;

        while (i < length){
            letter = text.charAt(i);
            if((letter >= 'a' && letter <= 'z') || (letter == 'æ') || (letter == 'ø') || (letter == 'å')){
                letterAmount ++;
            }
            i++;
        }
        return letterAmount;
    }

    public String getText(){
        return string;
    }

    public int getNumberOfWords()
    {
        int i = 0;
        int words = 1;
        while(i < string.length()){
            if (string.charAt(i) == ' '){
                words ++;
            }
        i ++;
        }
        return words;
    }

    public int getAverageWordLength(){
        int averageWordLength = letterAmount() / getNumberOfWords();
        return averageWordLength;
    }

    public String getBigLetters(){
        String text = string.toUpperCase();
        return text;
    }

    public List<Integer> getAverageWordLengthPerSentence(){
        String[] textList = string.split("[.!?]");
        List<Integer> periodAverageList = new ArrayList<Integer>();
        int i = 0;
        while(i < textList.length){
            TekstBehandling period = new TekstBehandling(textList[i].trim());
            int averageLength = period.getAverageWordLength();
            periodAverageList.add(averageLength);
            i++;
        }

        return periodAverageList;
    }

    public String changeWord(String wordToChange, String newWord){
        String text = string;
        String[] textList = text.split(" ");
        int i = 0;
        while(i < textList.length){
            if (textList[i].equals(wordToChange)){
                textList[i] = newWord;
            }
            i++;
        }
        String newText = String.join(" ", textList);
        return newText;
    }
}
