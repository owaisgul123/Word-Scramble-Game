package com.example.helloworldfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;
//import java.lang.classfile.Label;
import java.util.Objects;

//import java.awt.Color;
//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.bold;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Scene scene = null;
        String letters = "ABCDEFGH";
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HelloSceneBuilder.fxml"));
            scene = new Scene(fxmlLoader.load(), 800, 750);

        }
        catch (IOException | IllegalStateException e) {
            e.printStackTrace();
            printUserFriendlyErrorMessage(e);
        }


        scene.setFill(Color.BEIGE);
        stage.setTitle("Hello!");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("scramble-word.png")));
        stage.setScene(scene);
        stage.show();
    }
    private void printUserFriendlyErrorMessage(Exception e) {
        String message = "An error occurred while loading the game interface.";
        if (e instanceof IOException) {
            message += " The FXML file might be missing or corrupt.";
        } else if (e instanceof IllegalStateException) {
            message += " There might be errors in the FXML code.";
        }
        System.err.println(message);  // Print error message to console (or display a dialog box)
    }



    public static void main(String[] args) {
        launch();
    }
}