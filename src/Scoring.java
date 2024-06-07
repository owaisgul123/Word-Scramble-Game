import java .util.HashMap;
import java.util.Random;

public class Scoring extends GameInitializer implements WordScrambler {
    // some sory of mechanism to assign score to individual alphabets. and calcultate scores for each word.
    HashMap<Character, Integer> alphabetsDictionery = new HashMap<Character, Integer>();

    // Overriding Word identifier method, to assign the score based on score of individual aplhabets.
    //@Override
    //public void


    @Override
    public void wordIdentifier(String word) {
        if (wordsListAL.contains(word)) {
            score += calculateScore(word);
            System.out.println("Successfull! ");

        } else {
            System.out.println("NOPE!");
            printScore();
        }
    }

    public void assignScoreAlphabets() {
        for (char singleChar : alphabets) {
            alphabetsDictionery.put(singleChar, eRandom());
        }
    }

    // !!
    // Temp
    // !!
    public void displayAssignScore() {
        for (char singleChar : alphabetsDictionery.keySet()) {
            System.out.println(singleChar + "             " + alphabetsDictionery.get(singleChar));
        }
    }


    //@Override
    static int eRandom() {
        int i = 10;
        Random rand = new Random();
        int num = rand.nextInt(i);
        return num;
    }

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
                System.out.println(dictionaryCharacter);
            }

        }


        return scoreWord;
    }

}