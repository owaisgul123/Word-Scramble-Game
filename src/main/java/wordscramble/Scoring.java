package wordscramble;
import java .util.HashMap;
import java.util.Random;

public class Scoring extends Gameinitializer implements WordScrambler {
    // some sory of mechanism to assign score to individual alphabets. and calcultate scores for each word.
    HashMap<Character, Integer> alphabetsDictionery = new HashMap<Character, Integer>();

    // Overriding Word identifier method, to assign the score based on score of individual aplhabets.
    //@Override
    //public void


    // Will make changes, 01 Remove take input method.
    // In check guess method controller class, pass input from text field as argumetn into this.
    // chenge return type to string, either successfull or fail.
    @Override
    public String wordIdentifier(String word) {
        String message;
        if (wordsListAL.contains(word)) {
            score += calculateScore(word);
            message = "Successfull! Congrats";

        } else {
            //System.out.println("NOPE!");
            //printScore();
            message = "NOPE! Wrong guess";
        }
        return message;
    }

    // Done being used in controller class initialize method.
    public void assignScoreAlphabets() {
        for (char singleChar : alphabets) {
            alphabetsDictionery.put(singleChar, eRandom());
        }
    }



    //@Override
    static int eRandom() {
        int i = 10;
        Random rand = new Random();
        int num = rand.nextInt(i);
        return num;
    }

    // !!!!
    // Important
    // Will update this one for the Update score label. FXML
    public int calculateScore(String word) {
        word = word.toUpperCase();
        char dictionaryCharacter;
        int num = word.length();
        int scoreWord = 0;
        // Loop to iterate over the String
        for (int i = 0; i < num; i++) {
            // gets the individual character from string
            dictionaryCharacter = word.charAt(i);
            // System.out.println(alphabetsDictionery.get(dictionaryCharacter));
            if (alphabetsDictionery.containsKey(dictionaryCharacter)) {

                scoreWord += alphabetsDictionery.get(dictionaryCharacter);
                //System.out.println(dictionaryCharacter);
            }

        }


        return scoreWord;
    }

}
