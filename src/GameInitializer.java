import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class GameInitializer implements WordScrambler, Identifier {
    String words = "hello i am happy why where lahore karachi multan fly apple banana will people yard rio cocomo joker xylophone phobia bottle computer umbrella xeven system";
    String[] wordsList = words.split("\\s+");
    ArrayList<String> wordsListAL = new ArrayList<>();
    static int score = 0;


    // Methods
    @Override
    public void displayWord() {
        for (int j = 0; j < 3; j++) {
            generateRandom();
        }
        System.out.println("Avalible alphabets ");

        // Make a string using String Builder class, then set the word label to the string.
        for (char letter : alphabets) {
            System.out.print(letter);
        }
        addWordsArrayList();
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
    public void wordIdentifier(String word) {
        if (wordsListAL.contains(word)) {
            score += 10;
            System.out.println("Successfull! Score + 10 ");
        } else {
            System.out.println("NOPE!");
        }
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

    static void printScore() {
        System.out.println(score);
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
