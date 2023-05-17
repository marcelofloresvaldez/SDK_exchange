package org.sdk_exchange.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CurrenciesList {
    private String name;
    private String codeAlpha1;
    @JsonProperty("isSupported")
    private Boolean success;
    private List<string> countries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCodeAlpha1() {
        return codeAlpha1;
    }

    public void setCodeAlpha1(String codeAlpha1) {
        this.codeAlpha1 = codeAlpha1;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success= success;
    }
    public List<String> getCountries() {
            return countries;
    }   
    public void setCountries(List<String> countries) {
            this.countries = countries;
    }
        @Override
    public String toString() {
        return "success: " + success + ", currencies : {" + codeAlpha1 + " name" + name+ "}";

    }
        
     

}
