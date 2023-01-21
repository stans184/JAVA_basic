package JAVA_basic_12;

public class CarTest {
    public static void main(String[] args) {
        Car Tesla = new AICar();
        Car BMW = new ManualCar();

        Tesla.run();
        System.out.println();
        BMW.run();

    }
}
