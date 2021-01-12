package ro.mta.se.lab.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Orase {
    StringProperty nume;
    StringProperty tara;

    StringProperty id;
    StringProperty lat;
    StringProperty lon;

    public Orase(String nume, String tara, String id, String lat, String lon){
        this.nume= new SimpleStringProperty(nume);
        this.tara=new SimpleStringProperty(tara);
        this.id=new SimpleStringProperty(id);
        this.lat=new SimpleStringProperty(lat);
        this.lon=new SimpleStringProperty(lon);
    }

    public String getNume() {
        return nume.get();
    }

    public StringProperty numeProperty() {
        return nume;
    }

    public String getTara() {
        return tara.get();
    }

    public StringProperty taraProperty() {
        return tara;
    }

    public String getId() {
        return id.get();
    }

    public StringProperty idProperty() {
        return id;
    }

    public String getLat() {
        return lat.get();
    }

    public StringProperty latProperty() {
        return lat;
    }

    public String getLon() {
        return lon.get();
    }

    public StringProperty lonProperty() {
        return lon;
    }
}
