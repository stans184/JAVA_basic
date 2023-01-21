package JAVA_basic_11;

public abstract class NoteBook extends Computer {
    // abstract method 를 모두 정의하지 않으면, 해당 class 도 abstract 되어야 한다
    @Override
    public void display() {
        System.out.println("NoteBook Display On");
    }
    
}
