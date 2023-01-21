package JAVA_basic_9;

public class GoldCustomer extends Customer{
    double salesRatio;

    public GoldCustomer(){
        customerGrade = "GOLD";
        bonusRate = 0.02;
        salesRatio = 0.05;
    }

    @Override
    public int calcPrice(int price){
        bonusPoint += price*bonusRate;
        price -= (int) price*salesRatio;
        return price;
    }
}
