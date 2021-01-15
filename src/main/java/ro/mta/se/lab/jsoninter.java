package ro.mta.se.lab;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class jsoninter {
    String js;
    double temperatura;
    double temperatura_simtita;
    double temperatura_min;
    double temperatura_max;

    String rainfallMain;
    public void getjson( String oras) throws IOException {
        infovreme vreme= new infovreme();
        js=vreme.vreme(oras);
       //System.out.println(js);
    }
    public String parse()
    {

        JSONObject jsonObject = new JSONObject(js);
        //temperatura=jsonObject.getJSONObject("main").getString("temp");
        double temperature=jsonObject.getJSONObject("main").getDouble("temp");

        temperatura_simtita=jsonObject.getJSONObject("main").getDouble("feels_like");
        temperatura_min=jsonObject.getJSONObject("main").getDouble("temp_min");
        temperatura_max=jsonObject.getJSONObject("main").getDouble("temp_max");
        //rainfallMain = jsonObject.getJSONArray("weather").getJSONObject(0).getString("main");


        System.out.println(temperature);
        System.out.println(temperatura_max);
        System.out.println(temperatura_min);
        System.out.println(temperatura_simtita);
        return "ana";
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getTemperatura_simtita() {
        return temperatura_simtita;
    }

    public double getTemperatura_min() {
        return temperatura_min;
    }

    public double getTemperatura_max() {
        return temperatura_max;
    }
}
