package ro.mta.se.lab.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import ro.mta.se.lab.config;

import ro.mta.se.lab.jsoninter;


import java.io.*;

import java.nio.file.Path;

/**
 * Clasa implementata are rolul de a atribui cod si a interactiona cu elementele
 * din interfata grafica
 *
 * @author Bogdan Vlaicu
 */
public class vremecontrol {

    /**
     * Aici avem declaratii membrii clasei, 2 Choice Box-uri, unul pt tara iar unul
     * pentru oras, si 4 Label-uri pentru temperatura actuala, minima, maxima si
     * pentru temperatura simtita de corpul uman
     */
    FileWriter history;
    String value;

    @FXML
    private ChoiceBox choice_tara;
    @FXML
    private ChoiceBox choice_oras;
    @FXML
    private Label temp;
    @FXML
    private Label temp_min;
    @FXML
    private Label temp_max;
    @FXML
    private Label temp_simt;

    /**
     * Aici avem constructorul clasei, cand este construita aceasta deschide si fisierul
     * in care o sa salvam datele
     * @throws IOException
     */
    public vremecontrol() throws IOException {

        history = new FileWriter("./src/main/resources/history.txt");
    }

    /**
     * Functia in care o sa facem apelul la server si o sa apelam alte functii din alte clse
     * @throws IOException
     */
    @FXML
    public void showButtonClicked() throws IOException {

        String value = (String) choice_oras.getValue();
        //System.out.println(value);
        jsoninter js= new jsoninter();
        js.getjson(value);
        js.parse();
        temp.setText(String.valueOf(js.getTemperatura()));
        temp_min.setText(String.valueOf(js.getTemperatura_min()));
        temp_max.setText(String.valueOf(js.getTemperatura_max()));
        temp_simt.setText(String.valueOf(js.getTemperatura_simtita()));
        String output=value+" avem valorile: "+ temp.getText()+ " "+temp_simt.getText();
        history.write(output);
        System.out.println(output);

    }

    /**
     * Functia test_tara creaza un obiect de tipul configurare, apeleaza fuctia info_orase
     * a obiectului conf prin care este generata lista de tari, iar apoi este atribuita
     * membrului choice_tara
     * @throws FileNotFoundException
     */
    @FXML
    public void test_tara() throws FileNotFoundException {
        config conf =new config();
        conf.info_orase();
        choice_tara.setItems(conf.getListatari());
    }

    /**
     * Functia test_oras asemenea functiei de mai sus creaza un obiect de tipul config
     * apel la functia info_orase si atribuie membrului choice_oras o lista de orase in
     * functie de valoarea setata in obiectul choice_tara
     * @throws FileNotFoundException
     */
    @FXML
    public void test_oras() throws FileNotFoundException {
        config conf2 =new config();
        conf2.info_orase();
        value = (String) choice_tara.getValue();
       // System.out.println(value);
        choice_oras.setItems(conf2.getListaorase(value));

    }






}
