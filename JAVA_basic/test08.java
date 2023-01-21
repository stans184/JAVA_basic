package JAVA_basic;

// 공유의 목적으로 static 을 사용하는 것, Counter class 의 count 변수를 여러 instance 에서 공유?
class Counter{
    static int count = 0;
    Counter(){
        count++;            // 객체 변수가 아니므로 this 를 지워도 된다? 이해해야함
        System.out.println(count);
    }
    // static method 는 객체변수 접근이 불가능, static int count라서 가능
    // 유틸리시성 method를 작성할 때? 오늘의 날씨 구하기, 숫자에 콤마 추가하기
    public static int getCount(){
        return count;
    }
}
// singgleton 단 하나의 객체만을 생성하도록 강제하는 것
class singleTon{
    private static singleTon one;
    private singleTon() {
    }

    public static singleTon getIntstance(){
        if (one==null){
            one = new singleTon();    // 같은 class 이므로 생성자 호출이 가능하다???
        }
        return one;
    }
}
// static 과 singleton 의 차이점과 활용 방안에 대해서 생각해보기 ?!?!?!?!?!?!?!

public class test08 {
    public static void main(String[] args){
        // Counter c1 = new Counter();
        // Counter c2 = new Counter();

        // System.out.println(c1.getCount());

        singleTon SingleTon1 = singleTon.getIntstance();
        singleTon SingleTon2 = singleTon.getIntstance();

        // 두개의 singleton 이 완전히 같은 것
        // 단 하나의 singleton 만 생성됐다
        if (SingleTon1 == SingleTon2){
            System.out.println("True");
        }
    }
}
