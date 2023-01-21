package JAVA_basic_17;

public class SuperLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("RUNNING fast");
    }

    @Override
    public void jump() {
        System.out.println("JUMPING higher");
    }

    @Override
    public void turn() {
        System.out.println("TURNNING");
    }

    @Override
    public void showLevelMessage() {
        System.out.println(" ****** Super Level ****** ");
    }
    
}
