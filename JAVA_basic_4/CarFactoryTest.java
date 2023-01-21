package JAVA_basic_4;

public class CarFactoryTest {
    public static void main(String[] args){

        // 하나밖에 없는 공장을 singleton pattern을 통해 만들고
        CarFactory factory = CarFactory.getInstance();

        // singleton 으로 생성된 객체에서 Car 객체를 다시 생성하고
        Car mySonata = factory.createCar();
        Car yourSantafe = factory.createCar();

        System.out.println(mySonata.getCarNum()); // 10001 
        System.out.println(yourSantafe.getCarNum()); // 10001
    }
}
