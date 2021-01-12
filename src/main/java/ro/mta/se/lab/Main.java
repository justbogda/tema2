package ro.mta.se.lab;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ro.mta.se.lab.model.Orase;

import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.File;
import java.io.IOException;
import java.net.URL;
public class Main extends Application {
    public final ObservableList<Orase> listaorase = FXCollections.observableArrayList();

    public static void add_orase(String datax) {
        String id;
        String lat;
        String lon;
        String nume;
        String tara;
        Orase city;
        Scanner cuvant2 = new Scanner(datax);
        cuvant2.useDelimiter("\t");
        String data2 = cuvant2.next();
        id = (data2);
        data2 = cuvant2.next();
        nume = data2;
        data2 = cuvant2.next();
        lat = (data2);
        data2 = cuvant2.next();
        lon = (data2);
        data2 = cuvant2.next();
        tara = data2;
        //System.out.println(id + "\n" + nume + "\n" + lat + "\n" + lon + "\n" + tara + "\n");
        //listaorase.add(new Orase(nume, tara, id, lat, lon));
        city=new Orase(nume, tara, id, lat, lon);
        System.out.println(city.getNume());

        cuvant2.close();
    }
    public static void info_orase() throws FileNotFoundException {


        File input =new File("./src/main/resources/in.txt");
        Scanner cuvant = new Scanner(input);
        while (cuvant.hasNextLine()) {
            String data = cuvant.nextLine();
            //System.out.println(data);
            add_orase(data);
       }
        cuvant.close();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
    public void start(Stage primaryStage) throws IOException {
        info_orase();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/view/seelvareemeteo.fxml"));
        primaryStage.setScene(new Scene(loader.load()));
        primaryStage.show();

    }
}