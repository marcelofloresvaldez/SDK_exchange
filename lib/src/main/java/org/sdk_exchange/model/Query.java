package org.sdk_exchange.model;



public class Query {
    private String coinOf;
    private String coinTo;
    private String value;


    public String getCoinOf() {
        return coinOf;
        
    }
    public void setCoinOf(String coinOf) {
        this.coinOf = coinOf;
    }
    public String getCoinTo() {
        return coinTo;
        
    }
    public void setCoinTo(String coinTo) {
        this.coinTo = coinTo;
    }

    public String  getValue() {
        return value;

        
    }
    public void setValue(String value) {
        this.value = value;
        
    }
    @Override
    public String toString() {
        return "Query{" + "coinOf="+ coinOf + '/' +
        ", coinTo='" + coinTo + '/' +
        "; value= " + value + '/' +
        '}';
    

        
    }
}

