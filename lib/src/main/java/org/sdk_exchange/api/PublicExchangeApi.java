package org.sdk_exchange.api;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;

import org.checkerframework.checker.units.qual.C;
import org.sdk_exchange.model.CurrenciesList;
import  org.sdk_exchange.model.Query;

public class PublicExchangeApi {
    private final String API_URL;
    private String apikey;
    private HttpClient client;
    private ObjectMapper mapper;

    public List<CurrenciesList> listCountries() throws IOException, InterruptedException{
        URI uri = URI.create("https://api.apilayer.com/currency_data/list" + this.apikey);
        HttpRequest request = generateRequest(uri);
        HttpResponse<String> response = getResponse(request);
        List<CurrenciesList>  countries = mapper.readValue(response.body(), new TypeReference<List<CurrenciesList>>(){});
        return countries;

    }  

    private  HttpRequest generateRequest(URI uri)
    return HttpRequest.newBuilder()
        .GET()
        .uri(uri)
        .header("apikey", API_URL)
        .build();

      
    private HttpResponse<String> getResponse(HttpRequest request) throws IOException, InterruptedException{
        return client.send(request, HttpResponse.BodyHandlers.ofString())
    }
}