package JAVA_basic;

interface Predator{
    String getFood();

    default void printFood(){
        System.out.printf("my food is %s\n", getFood());
    }
}
// predator, barkable 과 같은 interface가 계속 생기는 이유는, 다른 class 에서 그 특성을 가져온 class 를 활용하려 할 때,
// class 의 종류가 추가 될 때마다 다른 class 의 수정이 필요한, 일종의 종속적인 관계가 되기 때문
// interface 의 활용을 통해서 다른 class와의 독립적인 관계를 유지시킬 수 있다
interface Barkable{
    void bark();
}

class Animal{
    String name;

    void setName(String name){
        this.name = name;
    }
}

class tiger extends Animal implements Predator, Barkable{
    // interface 의 method는 항상 public으로 구성해야 한다
    // interface 에 있는 method는 항상 그 객체에도 생성되어야 한다
    // heritage 와 interface 의 가장 큰 차이는 부모 class에 있는 method 를 강제로 실행해야 하느냐
    public String getFood(){
        return "apple";
    }

    public void bark(){
        System.out.println("krrr");
    }
}
// 여러 interface 의 특징을 받는 것을 다형성 polymorphism 
class lion extends Animal implements Predator, Barkable{
    public String getFood(){
        return "banana";
    }

    public void bark(){
        System.out.println("grrr");
    }
}

class keeper{
    // interface 를 사용하지 않으면 동물의 종류가 추가 될 때마다 이런 method를 추가해줘야 함
    void feed(Predator predator){
        System.out.println("feed "+predator.getFood());
    }
}

class bouncer {
    // void barkAnimal(Animal animal){
        // instanceof ? 조건문, 뒤에 나오는 class로 만들어진 조건문이냐?
        // if (animal instanceof tiger){
        //     System.out.println("kkkkkrrrrr");
        // }else if (animal instanceof lion){
        //     System.out.println("brrrr");
        // }
    // }

    void BarkAnimal(Barkable animal){
        animal.bark();
    }
}

public class test06 {
    public static void main(String[] args){
        keeper sumi = new keeper();
        tiger tiger = new tiger();
        lion lion = new lion();
        sumi.feed(lion);
        sumi.feed(tiger);
        lion.printFood();

        bouncer gaurd = new bouncer();
        gaurd.BarkAnimal(lion);
        gaurd.BarkAnimal(tiger);
    }
}
