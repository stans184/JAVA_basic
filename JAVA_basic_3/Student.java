package JAVA_basic_3;

public class Student {
    String studentName;
    int money;

    public Student(String name, int money){
        this.studentName = name;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway){
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo(){
        System.out.println(studentName + "님의 남은 잔액은 "+money+"입니다.");
    }
}
