package JAVA_basic_4;

public class Car {
    private static int serialNum = 10000;

    private int carNum;
    
    // car instance가 생성될때마다 serialNum 에서 하나씩 더해가면서 carNum을 부여
    public Car(){
        serialNum++;
        carNum = serialNum;
    }

    public int getCarNum(){
        return carNum;
    }
}
