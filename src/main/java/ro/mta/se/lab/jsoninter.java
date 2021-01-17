package ro.mta.se.lab;

import org.json.JSONObject;

import java.io.IOException;

/**
 * Clasa jsoninter se ocupa de parsarea json-ului primit ca parametru si de crearea unor functii prin care
 * sunt extrase datele din acesta
 *
 * @author Bogdan Vlaicu
 */
public class jsoninter {

    /**
     * Aici sunt declarati membrii clasei, js- este de tipul string si contine json-ul primit ca parametru
     * ceilalti membrii reprezinta datele extrase din acest json
     */
    String js;
    double temperatura;
    double temperatura_simtita;
    double temperatura_min;
    double temperatura_max;

    /**
     * Functia salveaza in membrul js json-ul returnat de functia obiectului vreme
     *
     * @param oras primeste numele unui oras
     * @throws IOException
     */
    public void getjson( String oras) throws IOException {
        infovreme vreme= new infovreme();
        js=vreme.vreme(oras);
       //System.out.println(js);
    }

    /**
     * Functia creaza un obiect json din stringul salvat in js si salveaza in ceilalti membrii informatile estrase din
     * obiectul json.
     */
    public void parse()
    {

        JSONObject jsonObject = new JSONObject(js);
        //temperatura=jsonObject.getJSONObject("main").getString("temp");
        double temperature=jsonObject.getJSONObject("main").getDouble("temp");

        temperatura_simtita=jsonObject.getJSONObject("main").getDouble("feels_like");
        temperatura_min=jsonObject.getJSONObject("main").getDouble("temp_min");
        temperatura_max=jsonObject.getJSONObject("main").getDouble("temp_max");
        //rainfallMain = jsonObject.getJSONArray("weather").getJSONObject(0).getString("main");

        temperatura=temperature;
        System.out.println(temperature);
        System.out.println(temperatura_max);
        System.out.println(temperatura_min);
        System.out.println(temperatura_simtita);
    }

    /**
     * Getter pentru temperatura
      * @return temperatura actuala
     */
    public double getTemperatura() {
        return (temperatura);
    }

    /**
     * Getter pentru temperatura simtita
     * @return temperatura simtita
     */
    public double getTemperatura_simtita() {
        return temperatura_simtita;
    }

    /**
     * Getter pentru temperatura minima
     * @return temperatura minima
     */
    public double getTemperatura_min() {
        return temperatura_min;
    }

    /**
     * Getter pentru temperatura maxima
     * @return temperatura maxima
     */
    public double getTemperatura_max() {
        return temperatura_max;
    }
}
