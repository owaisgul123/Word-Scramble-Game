package com.example.helloworldfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import wordscramble.Gameinitializer;
import wordscramble.Scoring;
import wordscramble.Identifier;
import wordscramble.WordScrambler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class HelloController {

    @FXML
    private Label alphabets;
    @FXML
    private TextField wordTextField;
    @FXML
    private Label updateScore;
    @FXML
    private Label guessMessage;

    String userInputWord ;
    String userInputGuessMessage;
    int score = 0;

    Scoring wordScrambler = new Scoring();

    // Display alphabets.
    @FXML
    protected void initialize() {
        //System.out.println("");
        String avalibleLetters = wordScrambler.displayWord();
        wordScrambler.addWordsArrayList();
        wordScrambler.assignScoreAlphabets();
        alphabets.setText(avalibleLetters);
    }
    // Method to update score
   // @FXML
    @FXML
    protected void checkGuess() {
//        try {
//            if (word.equals(wordTextField.getText().toLowerCase())) {
//                guessMessage.setText("Congrats! right Guess.");
//                score += 10;
//                updateScore.setText(" " + score);
//            }
//            else {
//                guessMessage.setText("Wrong guess!");
//            }
//        }
//        catch (NullPointerException e) {
//            System.err.println("Erro Loading" + e.getMessage());
//        }
// Try my own if pass, then remove the above comments.
        try {
            userInputWord = wordTextField.getText().toLowerCase();
            userInputGuessMessage = wordScrambler.wordIdentifier(userInputWord);
            guessMessage.setText(userInputGuessMessage);
            updateScore.setText(" " + wordScrambler.updatedScore());
        }
        catch (IllegalStateException e) {
            System.err.println("Error Loading Scoring class methods" + e.getMessage());
        }
        initialize();

    }
}