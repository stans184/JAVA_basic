package JAVA_basic_9;

import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("Animal is moving");
    }
}

class Human extends Animal{
    public void move(){
        System.out.println("Human is moving");
    }

    public void read(){
        System.out.println("Human reads books");
    }
}

class Tiger extends Animal{
    public void move(){
        System.out.println("Tiger moves with his 4 legs");
    }

    public void hunting(){
        System.out.println("Tigher hunt");
    }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("Eagle flies away");
    }

    public void flying(){
        System.out.println("Eagle extends his wings");
    }
}

public class AnimalTest {
    public static void main(String[] args){
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();
    
        AnimalTest test = new AnimalTest();
        test.moveAnimal(eAnimal);       // 하위 class 로 선언된 instance를 animal 을 받는 method에 넣으면
        test.moveAnimal(hAnimal);       // 자동으로 상위 class로 형변환이 된다
        test.moveAnimal(tAnimal);       // animal 하나만 맏는 method 인데, 모든 형태의 instance를 실행 가능하다
                                        // 다형성
                                        // 상속을 하게 되면, 하위 class 를 모두 상위 class 타입으로 핸들링 할 수 있음

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(eAnimal);        // ArrayList 에서도 동일한 작업을 수행할 수 있음
        animalList.add(hAnimal);
        animalList.add(tAnimal);

        for (Animal animal : animalList){
            animal.move();
        }
                                        // 여러 case 를 추가해야 한다거나
                                        // if else 구문이 많이 들어가는 경우
                                        // 다형성으로 진행하는 것을 고려해볼 필요가 있다
                                        // 강력한 확장성!
                                        // 새로운 변수가 계속 추가되거나, method가 계속 변할 때
    }

    public void moveAnimal(Animal animal){
        animal.move();
    }
}

