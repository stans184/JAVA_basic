package JAVA_basic_17;

public class Player {

    public PlayerLevel level;

    public Player(){
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel(){
        return level;
    }

    public void upgradeLevel(PlayerLevel level){
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int num){
        level.go(num);
    }
}
