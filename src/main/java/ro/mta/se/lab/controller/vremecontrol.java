package ro.mta.se.lab.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import ro.mta.se.lab.config;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class vremecontrol {

    @FXML
    private ChoiceBox choice_tara;



    public void showButtonClicked(){
        System.out.println("Arata vremea!");
    }
    @FXML
    public void test_tara() throws FileNotFoundException {
        config conf =new config();
        conf.info_orase();
        choice_tara.setItems(conf.getListatari());

    }

    public void test_oras(){
        System.out.println("Arata orasul!");
    }





}
