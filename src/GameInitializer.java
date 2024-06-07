import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class GameInitializer implements WordScrambler, Identifier{
    String words = "hello i am happy why where lahore karachi multan fly apple banana joker xylophone phobia bottle computer umbrella xeven system";
    String[] wordsList = words.split("\\s+");
    ArrayList<String> wordsListAL = new ArrayList<>();
    static int score = 0;
    @Override
    public void displayWord() {
        for (int j = 0; j < 3; j++) {
            generateRandom();
        }
        System.out.println("Avalible alphabets ");
        for(char letter: alphabets) {
            System.out.print(letter);
        }
        printWords();
    }

    @Override
    public void takeInputWord() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Enter Word!\n");
        String word = input.nextLine();
        word = word.toLowerCase(Locale.ROOT);
        wordIdentifier(word);
    }

    @Override
    public void wordIdentifier(String word) {
        if (wordsListAL.contains(word)) {
            score += 10;
            System.out.println("Successfull! Score + 10 ");
        }
        else {
            System.out.println("NOPE!");
        }
    }

    // !!!!
    // temp
    // !!!
    public void printWords() {
        for(String word: wordsList) {
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


}