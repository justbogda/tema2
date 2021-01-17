package ro.mta.se.lab;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.FileNotFoundException;
import java.io.ObjectInputFilter;
import java.util.Scanner;

import java.io.File;
import java.io.IOException;
import java.net.URL;
public class Main extends Application {


    public static void main(String[] args)
    {
        launch(args);
    }
    public void start(Stage primaryStage) throws IOException {
        config conf;
        conf = new config();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/view/seelvareemeteo.fxml"));
        primaryStage.setScene(new Scene(loader.load()));
        primaryStage.show();

    }
}