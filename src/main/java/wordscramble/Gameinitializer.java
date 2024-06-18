package wordscramble;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class Gameinitializer implements WordScrambler, Identifier {
    String words = "hello i am happy why where lahore karachi multan fly apple banana will people yard rio cocomo joker xylophone phobia bottle computer logistics umbrella xeven system";
    String[] wordsList = words.split("\\s+");
    ArrayList<String> wordsListAL = new ArrayList<>();
    public int score = 0;


    // Methods
    @Override
    public String displayWord() {
        for (int j = 0; j < 3; j++) {
            generateRandom();
        }
        //System.out.println("Avalible alphabets ");
        StringBuilder sb = new StringBuilder();
        // Make a string using String Builder class, then set the word label to the string.
        for (char letter : alphabets) {
            //System.out.print(letter);
            sb.append(letter);
        }
        return sb.toString();
        //addWordsArrayList();
    }

    @Override
    public void takeInputWord() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Word!    :      ");
        String word = input.nextLine();
        word = word.toLowerCase(Locale.ROOT);
        wordIdentifier(word);
    }

    @Override
    public String wordIdentifier(String word) {
        if (wordsListAL.contains(word)) {
            score += 10;
            System.out.println("Successfull! Score + 10 ");
        } else {
            System.out.println("NOPE!");
        }
        return " ";
    }

    // !!!!
    // temp
    // !!!
    // Adding into the array list. For ease of contain methods.
    public void addWordsArrayList() {
        for (String word : wordsList) {
            wordsListAL.add(word);
            //System.out.println(word);
        }
    }

    static void generateRandom() {
        int num = alphabets.length;
        Random Rand = new Random();
        int i = Rand.nextInt(num);
        manipulateAlphabets(i);
    }

    static void manipulateAlphabets(int num) {
        alphabets[num] = ' ';
    }

    public int updatedScore() {
        //System.out.println(score);
        return score;
    }

    // temp
    //
//    public void printCharacter(@org.jetbrains.annotations.NotNull String word) {
//        int num = word.length();
//        int scoreWord = 0;
//        // Loop to iterate over the String
//        for (int i = 0; i < num; i++) {
//            // gets the individual character from string
//            char dictionaryCharacter = word.charAt(i);
//            //scoreWord += alphabetsDictionery.get(dictionaryCharacter);
//            System.out.println(dictionaryCharacter);
//        }
//
//    }
}