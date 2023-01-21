package JAVA_basic;

// class 는 특별한 경우가 아니면 파일 단위로 작성한다, 즉 우리가 작성하고 객체로 불러오고 싶으면 다른 java 파일을 만드는 것
class Calculator{
    int result = 0;

    int add(int num){
        result += num;
        return result;
    }

    int sub(int num){
        result -= num;
        return result;
    }
}

class Animal{
    String name;

    // void > return 값 없음
    public void setName(String name){
        this.name = name;
    }
}

public class test03 {
    int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        // System.out.println(Calculator.add(3)); // static 키워드를 지우면 이게 동작이 안됨, 이유는?
        // System.out.println(Calculator.add(4));

        // // 위의 class를 객체화 시켜서 여러대의 계산기를 생성한다 & static 키워드를 지워야 하는 이유?
        // // static 으로 사용하니까, result 값이 그대로 유지되면서 값이 더해짐
        // Calculator cal1 = new Calculator();
        // Calculator cal2 = new Calculator();

        // System.out.println(cal1.add(3));
        // System.out.println(cal1.add(5));

        // System.out.println(cal2.add(5));
        // System.out.println(cal1.add(10));

        // animal class 의 객체, instance 인 cat 생성
        Animal cat = new Animal();
        cat.setName("bobby");

        System.out.println(cat.name);

        Animal dog = new Animal();
        System.out.println(dog.name); // 객체 변수는 instance 사이에서 공유되지 않는다

        // java 에서는 class 를 떠나서 함수(method)가 존재할 수 없음
        // 자기 자신을 복제해서 instance 를 만들 수 있음
        test03 sample = new test03();

        System.out.println(sample.sum(4, 5));
    }
}
