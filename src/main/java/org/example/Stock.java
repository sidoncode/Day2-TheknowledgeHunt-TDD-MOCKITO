package org.example;

public class Stock {
    private String stockid;
    private String name;
    private int Quantity;

    public Stock(String stockid, String name, int quantity) {
        this.stockid = stockid;
        this.name = name;
        Quantity = quantity;
    }

    public String getStockid() {
        return stockid;
    }

    public void setStockid(String stockid) {
        this.stockid = stockid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }


}
