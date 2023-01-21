package JAVA_basic_11;

public abstract class Computer {
                                                // 상위 class 에서 method 를 미리 선언해놓음
                                                // 그런데 하위 class 마다 method 의 방법이 다를 경우,
                                                // abstract 선언을 통해 method 만 미리 잡아놓는 것
                                                // 이렇게 하위 class 를 생성하면, 거기서 한번 더 확인한다
                                                // abstract method 를 선언할건지, 너도 abstract 가 될건지
                                                // abstarct class 는 instance 로 사용할 수 없음, 정의되지 않은 method 가 있어서
                                                // 보통 기울어진 서체로 표기
    public abstract void display();
    public abstract void typing();

    public void turnOn(){
        System.out.println("POWER ON");
    }
    public void turnOff(){
        System.out.println("POWER OFF");
    }
}