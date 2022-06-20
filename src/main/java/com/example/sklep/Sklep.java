package com.example.sklep;

import Reczy.Przedmiot;
import Reczy.Telewizor;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.Group;

import java.io.IOException;
import java.util.ArrayList;

public class Sklep extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Sklep.class.getResource("Otwarcie.fxml"));
        stage.setTitle("Sklep z telewizorami");
        Scene scene = new Scene(fxmlLoader.load(),  800, 500);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {

        launch();

    }
}