package JAVA_basic_2;

public class ThisPerson {
    String name;
    int age;

    public ThisPerson(){
        this("no name", 0);
    }
    // class 의 생성자에서 다른 생성자를 호출 할 때
    // this 앞에 다른 입력이 들어가면 안됨
    public ThisPerson(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showPerson(){
        System.out.println(name + ", "+ age);
    }
    // 자신의 주소 그 자체를 반환 ThisPerson@85ede7b
    public ThisPerson getPerson(){
        return this;
    }

    public static void main(String[] args){
        ThisPerson person = new ThisPerson();
        person.showPerson();
        System.out.println(person.getPerson());

        ThisPerson person2 = new ThisPerson("jane", 27);
        person2.showPerson();

        ThisPerson person3 = person.getPerson();
        System.out.println(person3.getPerson());
    }
}
