package JAVA_basic_12;

public class ManualCar extends Car {

    @Override
    public void drive() {
        System.out.println("Manual Driving");
        System.out.println("Human control the Car and find ways to destination");
    }
    
    @Override
    public void stop() {
        System.out.println("Manual Driving");
        System.out.println("Human find obstacles and stop the car");
    }
    
}
