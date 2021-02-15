/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author admin
 */
public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    Stock(String newsymbol, String newname, double newpreviousClosingPrice, double newcurrentPrice){
        symbol = newsymbol;
        name = newname;
        previousClosingPrice = newpreviousClosingPrice;
        currentPrice = newcurrentPrice;
    }
    double getChangePercent(){
        return ((currentPrice - previousClosingPrice)/previousClosingPrice)*100;
    }
}
