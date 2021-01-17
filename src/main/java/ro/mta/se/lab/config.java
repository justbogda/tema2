package ro.mta.se.lab;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import ro.mta.se.lab.model.Orase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Clasa de configure se ocupa deschiderea fisierului de configurare
 * initializarea membrilor cu datele din acesta si returnarea datelor
 * oricarei clase are nevoie de acestea
 */
public class config {
    /**
     * Membrii clasei sunt reprezentari de 3 liste 2 de tipul string si una de tipul
     * Orase
     */
    public ObservableList<String> listaorase = FXCollections.observableArrayList();
    public ObservableList<String> listatari = FXCollections.observableArrayList();
    public ObservableList<Orase> listacity = FXCollections.observableArrayList();

    /**
     * Functia primeste datele unui oras si le pune intr-un obiect de tipul Orase
     * dar si creaza lista de tari unice.
     * @param datax
     */
    public void add_orase(String datax) {
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
        listacity.add(city);
        //System.out.println(city.getNume());
        int a=0;


            for (int i=0; i<listatari.size();i++) {

                   if(listatari.get(i).equals(tara))
                       a++;

            }


        //System.out.println(a);
        if(a==0)
        listatari.add(tara);
        cuvant2.close();
    }

    /**
     * functia deschide fisierul de configurare si trimite datele unui oras catre functia add_orase
     * @throws FileNotFoundException
     */
    public void info_orase() throws FileNotFoundException {


        File input =new File("./src/main/resources/in.txt");
        Scanner cuvant = new Scanner(input);
        while (cuvant.hasNextLine()) {
            String data = cuvant.nextLine();
            //System.out.println(data);
            add_orase(data);
        }
        cuvant.close();
    }

    /**
     * Functia returneaza lista de tari unice
     * @return
     */
    public ObservableList<String> getListatari() {

        return listatari;
    }

    /**
     * Functia primeste tara_x ce reprezinta numele unei tari si returneaza toate orasele din acea tara
     * @param tara_x
     * @return
     */
    public ObservableList<String> getListaorase(String tara_x){

        for (int i=0; i<listacity.size();i++) {
            if(listacity.get(i).getTara().equals(tara_x)) {
                listaorase.add(listacity.get(i).getNume());
                //System.out.print(listacity.get(i).getNume() +i +listacity.size());
            }

        }

        return listaorase;
    }
}
