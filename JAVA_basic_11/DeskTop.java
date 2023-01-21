package JAVA_basic_11;

public class DeskTop extends Computer{
    // 상위 class 에서 abstarct 로 선언된 method, 하위 class 에서 정의하고 사용
    @Override
    public void display() {
        System.out.println("DeskTop Display On");
    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing");
    }
    
}
