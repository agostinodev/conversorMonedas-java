package conversor.servicio;

import com.google.gson.Gson;
import conversor.modelo.Conversion;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {

    public Conversion conversion ( String monedaBase, String monedaDestino){

        String apiKey = System.getenv("API_KEY");

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+monedaBase+"/"+monedaDestino);

        HttpClient client = HttpClient.newHttpClient();

        try{

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = client.send( request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Conversion.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Ocurrio el siguiente error: "+e.getMessage());
        }


    }




}
