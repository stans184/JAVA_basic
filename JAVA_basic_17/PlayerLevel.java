package JAVA_basic_17;

public abstract class PlayerLevel {
        
    public abstract void run();

    public abstract void jump();

    public abstract void turn();

    public abstract void showLevelMessage();

    // template method, 모든 method 를 쭉 실행시킴
    final void go(int num){
        run();
        for (int i = 0 ; i<num ; i++) {
            jump();
        }
        turn();
    }
}
