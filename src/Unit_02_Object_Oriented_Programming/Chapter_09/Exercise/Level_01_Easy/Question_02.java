package Unit_02_Object_Oriented_Programming.Chapter_09.Exercise.Level_01_Easy;

public class Question_02 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.println("Price change percentage : " + stock.getChangePercent());
    }
}

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    public double getChangePercent(){
        return previousClosingPrice >= currentPrice ? - (previousClosingPrice - currentPrice) / previousClosingPrice * 100 : (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }
}
