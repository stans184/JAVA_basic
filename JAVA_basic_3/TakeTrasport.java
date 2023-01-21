package JAVA_basic_3;

public class TakeTrasport {
    // 여러 객체를 사용하는 방법
    public static void main(String[] args){
        Student studentJ = new Student("James", 4000);
        Student studentT = new Student("Tom", 10000);

        Bus bus64 = new Bus(64);
        Bus bus101 = new Bus(101);

        Subway greenline = new Subway(2);
        Subway redline = new Subway(7);

        studentJ.takeBus(bus64);
        studentJ.takeSubway(redline);
        studentJ.showInfo();

        studentT.takeBus(bus101);
        studentT.takeBus(bus64);
        studentT.takeSubway(greenline);
        studentT.showInfo();

        bus64.showBusInfo();
        bus101.showBusInfo();
        greenline.subwayShowInfo();

        Person person1 = new Person("Edward", 20000);

        Taxi taxiGood = new Taxi("잘나간다");

        person1.takeTaxi(taxiGood);
        
        person1.showPersonInfo();

        taxiGood.showTaxiInfo();
    }
}