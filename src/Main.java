// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float score;
        int i = 1;
        while (i > 0) {
            GameInitializer scrambler = new GameInitializer();
            scrambler.displayWord();
            scrambler.takeInputWord();
            // scrambler.wordIdentifier();
            System.out.println("Do you want to continue ? ");
            int flag = input.nextInt();
            if (flag == 1) {
                GameInitializer.printScore();
                break;
            }
            //   scrambler.printWords();

        }
    }
}