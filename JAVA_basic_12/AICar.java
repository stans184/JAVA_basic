package JAVA_basic_12;

public class AICar extends Car{

    @Override
    public void drive() {
        System.out.println("Automatic Driving");
        System.out.println("The Car find its own way and runs");
    }
    
    @Override
    public void stop() {
        System.out.println("Automatic Driving");
        System.out.println("The Car stopped in front of obstacles");
    }

    @Override
    public void washCar(){
        System.out.println("Automatied Washing");
    }
    
}
