package JAVA_basic;
// call by value

class Updator{
    // counter class를 객체로 전달받도록
    void update(Counter counter){
        counter.count++;
    }
}

class Counter{
    int count=0;
}

public class test04 {
    public static void main(String[] args){
        Counter myCounter = new Counter();
        System.out.println("before update : %d"+myCounter.count);
        Updator myUpdator = new Updator();
        myUpdator.update(myCounter); // updator의 변수는 counter class
        System.out.println("after update : "+myCounter.count);


    }
}
