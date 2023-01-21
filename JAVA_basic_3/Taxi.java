package JAVA_basic_3;

public class Taxi {
    String taxiName;
    int money = 0;

    public Taxi(String name){
        this.taxiName = name;
    }

    public void take(int money){
        this.money += money;
    }

    public void showTaxiInfo(){
        System.out.println(taxiName+"운수 의 수입은 "+money+"입니다.");
    }
}
