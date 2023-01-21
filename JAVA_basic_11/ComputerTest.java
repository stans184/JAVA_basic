package JAVA_basic_11;

public class ComputerTest {
    public static void main(String[] args) {
        // abstract class 는 내부의 abstract method 가 있기 때문에, new 로 instance 화 될 수 없다
        // 내부에 모든 method 가 정상이어도, abstract class 가 되어버리면, instance 될 수 없음
        // abstract class 는 상속을 위해 생긴 class & 상속을 하지만, instance 로 불러내지는 않는
        // 하위 class 에서 공통으로 쓸 method 만 선언

        Computer myDeskTop = new DeskTop();
        Computer myNoteBook = new MyNoteBook();

        myDeskTop.display();
        myNoteBook.typing();

    }
}
