package ro.mta.se.lab;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class infovremeTest {
    @Test
    public void testinfo() throws IOException {
        infovreme vreme = new infovreme();
        String result="{\"coord\":{\"lon\":27.6,\"lat\":47.1667},\"weather\":[" +
                "{\"id\":801,\"main\":\"Clouds\",\"description\":\"câțiva nori\",\"icon\":\"02d\"}]" +
                ",\"base\":\"stations\",\"main\":{\"temp\":-9.85,\"feels_like\":-14.17,\"temp_min\":-10," +
                "\"temp_max\":-9.44,\"pressure\":1016,\"humidity\":79},\"visibility\":10000,\"wind\":" +
                "{\"speed\":1.54,\"deg\":130},\"clouds\":{\"all\":20},\"dt\":1610873236,\"sys\":" +
                "{\"type\":1,\"id\":6916,\"country\":\"RO\",\"sunrise\":1610862606,\"sunset\":1610894933}," +
                "\"timezone\":7200,\"id\":675810,\"name\":\"Iași\",\"cod\":200}";
        assertEquals(vreme.vreme("Iasi").charAt(7), result.charAt(7));
    }

}