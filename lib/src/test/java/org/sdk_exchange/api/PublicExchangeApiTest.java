package org.sdk_exchange.api;

import java.io.IOException;
import java.util.List;

import org.sdk_exchange.model.CurrenciesList;
//import org.sdk_exchange.model.Query;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PublicExchangeApiTest {

    @Test
     void createApiObjet(){
        var apikey = System.getenv("API_KEY");

        var api = new PublicExchangeApi(apikey);
        Assertions.assertNotNull(api);
     }
    @Test 
    void listCountries() throws IOException, InterruptedException{
        var apikey = System.getenv("01aNqsBBdzN3L0DVIimOnTHh1A3MH55R");
        var api = new PublicExchangeApi();

        List<CurrenciesList> currencies = api.listCountries();

        System.out.println(countries);
        Assertions.assertFalse(countries.isEmpty());
    }
}
