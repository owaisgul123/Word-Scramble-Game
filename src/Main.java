import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //float score;
        int i = 1;
        Scoring scrambler = new Scoring();
        while (i > 0) {

            scrambler.displayWord();
            scrambler.assignScoreAlphabets();
            //scrambler.displayAssignScore();
            scrambler.takeInputWord();
            //String word = input.nextLine();
            //System.out.println(" \n" + scrambler.calcultateScore(word));
            //scrambler.calcultateScore(word);
            //scrambler.printCharacter("hello");
            // scrambler.wordIdentifier();
            System.out.println("Do you want to continue ? ");
            int flag = input.nextInt();
            if (flag == 1) {
                Scoring.printScore();
                break;
            }
            //   scrambler.printWords();

        }

    }
}