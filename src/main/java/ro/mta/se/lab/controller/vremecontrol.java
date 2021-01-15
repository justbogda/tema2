package ro.mta.se.lab.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import ro.mta.se.lab.config;

import ro.mta.se.lab.jsoninter;


import java.io.FileNotFoundException;
import java.io.IOException;

public class vremecontrol {

    String value;
    @FXML
    private ChoiceBox choice_tara;
    @FXML
    private ChoiceBox choice_oras;

    @FXML
    public void showButtonClicked() throws IOException {

        String value = (String) choice_oras.getValue();
        System.out.println(value);
        jsoninter js= new jsoninter();
        js.getjson(value);
        js.parse();
    }
    @FXML
    public void test_tara() throws FileNotFoundException {
        config conf =new config();
        conf.info_orase();
        choice_tara.setItems(conf.getListatari());

    }
    @FXML
    public void test_oras() throws FileNotFoundException {
        config conf2 =new config();
        conf2.info_orase();
        value = (String) choice_tara.getValue();
       // System.out.println(value);
        choice_oras.setItems(conf2.getListaorase(value));

    }






}
