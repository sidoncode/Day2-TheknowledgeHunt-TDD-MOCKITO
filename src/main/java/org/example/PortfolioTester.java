package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;
public class PortfolioTester {
    Portfolio portfolio;
    StockService stockService;

    public static void main(String[] args) {
        PortfolioTester tester = new PortfolioTester();
        tester.setUp();
        System.out.println(tester.testMarketValue()? "Pass" : "Fail");
    }

    public void setUp(){
        portfolio = new Portfolio();
        stockService = mock(StockService.class);
        portfolio.setStockService(stockService);
    }

    public boolean testMarketValue(){
        // creating list with random // test variables //
        // then mock the testCases with the help of -> Mockito.

        List<Stock> stocks = new ArrayList<Stock>();
        Stock googleStock = new Stock("1","GOOGLE",10);
        Stock MicrosoftStock = new Stock("2","Microsoft",12);
        Stock AppleStock = new Stock("3","Apple",34);

        // stock we are adding to the list not to the Portfolio //
        stocks.add(googleStock);
        stocks.add(MicrosoftStock);
        stocks.add(AppleStock);

        // below is how we are going to add stock to the portfolio //

        portfolio.setStocks(stocks);
        when(stockService.getPrice(googleStock)).thenReturn(50.00);

        when(stockService.getPrice(MicrosoftStock)).thenReturn(10.00);

        when(stockService.getPrice(AppleStock)).thenReturn(30.00);

        double marketValue = portfolio.getMarketValue();
        return marketValue == 1640.00;
    }

}
