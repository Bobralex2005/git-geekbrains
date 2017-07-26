package ru.geekbrains.chat.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by HP on 21.07.2017.
 */
public class ClientMain extends Application{
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("client.fxml"));
        primaryStage.setTitle("JustAChat");
        primaryStage.setScene(new Scene(root,400, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
