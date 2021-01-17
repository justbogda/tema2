package ro.mta.se.lab.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Clasa reprezinta modelul de date folosit in fisierul de configurare din care
 * sunt citite datele si salvate sub tipul de obiect Orase
 *
 * @author Bogdan Vlaicu
 */
public class Orase {

    /**
     * Aici sunt prezentati membrii clasei,
     * fiecare obiect de tipul Orase o sa aiba un string care reprezinta
     * numele, tara, id-ul orasului, latitudinea si longitudinea
     */
    StringProperty nume;
    StringProperty tara;
    StringProperty id;
    StringProperty lat;
    StringProperty lon;

    /**
     * constructorul care primeste parametrii de mai jos si ii salveaza in membrii acestei clase
     * @param nume
     * @param tara
     * @param id
     * @param lat
     * @param lon
     */
    public Orase(String nume, String tara, String id, String lat, String lon){
        this.nume= new SimpleStringProperty(nume);
        this.tara=new SimpleStringProperty(tara);
        this.id=new SimpleStringProperty(id);
        this.lat=new SimpleStringProperty(lat);
        this.lon=new SimpleStringProperty(lon);
    }

    /**
     * Getter pt numele orasului
     * @return
     */
    public String getNume() {
        return nume.get();
    }


    /**
     * Getter pt numele tarii
     * @return
     */
    public String getTara() {
        return tara.get();
    }


    /**
     * Getter pt Id-ul orasului
     * @return
     */
    public String getId() {
        return id.get();
    }

    /**
     * Getter pentru latitudinea la care se afla orasul
     * @return
     */
    public String getLat() {
        return lat.get();
    }

    /**
     * Getter pentru longitudinea la care se afla orasul
     * @return
     */
    public String getLon() {
        return lon.get();
    }

}
