package ro.mta.se.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class infovreme {

    private static HttpURLConnection connection;
    String result;
    public String vreme(String oras) throws IOException {
        //String URL_complet= "http://api.openweathermap.org/data/2.5/weather?q=" + oras + "&units=metric&appid=ba253fc6353d2351ea05b7541d47052d" ;
        BufferedReader reader;
        String line;
        StringBuffer responseContent= new StringBuffer();
        URL url =new URL("http://api.openweathermap.org/data/2.5/weather?q="+oras.toLowerCase()+"&units=metric&appid=ba253fc6353d2351ea05b7541d47052d&lang=ro" );
        //System.out.println(url);
        connection=(HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
        int status=connection.getResponseCode();
        System.out.println(status);

        if(status >299)
        {
            reader= new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            while ((line= reader.readLine())!=null)
            {
                responseContent.append(line);
            }
            reader.close();
        }
        else
        {
            reader =new BufferedReader( new InputStreamReader(connection.getInputStream()));
            while ((line= reader.readLine())!=null)
            {
                responseContent.append(line);
            }
            reader.close();
        }
       // System.out.println(responseContent.toString());
        return responseContent.toString();

    }


}
