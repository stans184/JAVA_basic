package JAVA_basic_3;

public class Subway {
    int lineNumber;
    int passangerCount;
    int money;

    public Subway(int lineNumber){
        this.lineNumber = lineNumber;
    }

    public void take(int money){
        this.money += money;
        passangerCount++;
    }

    public void subwayShowInfo(){
        System.out.println(lineNumber+"번의 승객 수는 "+passangerCount+"명 이고, 수입은 "+money+"입니다.");
    }
}
