package JAVA_basic_17;

public class BeginnerLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("RUNNING slowly");
    }

    @Override
    public void jump() {
        System.out.println("You cannot JUMP");
    }

    @Override
    public void turn() {
        System.out.println("You cannot TURN");
    }

    @Override
    public void showLevelMessage() {
        System.out.println(" ****** Beginner Level ****** ");
    }
    
}
