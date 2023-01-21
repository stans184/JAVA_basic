package JAVA_basic;
// animal 은 부모 class
class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}
// dog는 animal class의 특징을 이어받은 자식 class
// 자식 class에 특색있는 method를 추가할 수 있음
class Dog extends Animal {
    void sleep(){
        System.out.println(this.name+" zzz");
    }
}

class houseDog extends Dog{
    houseDog(String name){ // 생성자, 이걸 하지 않으면 housedog이 생성되지 않음 / class와 method가 동일 / return 없음
        this.setName(name);
    }
    void sleep(){
        System.out.println(this.name+" zzz in house"); // method overriding, 동일한 method지만, 다르게 기능
    }
    void sleep(int hour){
        System.out.println(this.name+" zzz in house at "+hour); // method overloading
    }
}

class Cat extends Animal {
    void sleep(){
        System.out.println(this.name+" zzz");
    }
}

public class test05 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("boby");
        System.out.println(dog.name);
        dog.sleep();

        Animal cat = new Cat(); // 부모 class의 선언, 자식 class의 생성, 반대는 불가
        cat.setName("nabi");
        System.out.println(cat.name);

        houseDog housedog = new houseDog("happy");
        System.out.println(housedog.name);

        Dog testDog = new houseDog("judy");
        System.out.println(testDog.name);
    }
}
