package JAVA_basic_12;

public abstract class Car {
    // final / 변수 - 상수 / method - 재정의 불가 / class - 상속 불가
    // 변수에 final 선언이 되어있으면, 해당 class 를 instance 화 하지 않고도 변수를 불러올 수 있음

    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("The Car started");
    }

    public void turnOff(){
        System.out.println("Car Power Off");
    }
    // method 는 정의되었지만, 구현되지 않은 상태
    // 하위 method 에서 재정의가 필요
    public void washCar(){}

    // 하위 class 에서 재정의되면 안됨
    // 차의 동작은 변하면 안되기 때문
    // 따라서 final method 처리
    // 아래와 같이 정의된 method 를 바탕으로 코드의 흐름을 정의하는 것을 -> 템플릿 method
    // 프레임워크에서 많이 사용되는 설계 패턴
    public final void run(){
        startCar();
        drive();
        stop();
        turnOff();
    }

}
