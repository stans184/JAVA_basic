package JAVA_basic_17;

public class AdvancedLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("RUNNING");
    }

    @Override
    public void jump() {
        System.out.println("JUMPING!");
    }

    @Override
    public void turn() {
        System.out.println("You cannot TURN");
    }

    @Override
    public void showLevelMessage() {
        System.out.println(" ****** Advanced Level ****** ");
    }
    
}
