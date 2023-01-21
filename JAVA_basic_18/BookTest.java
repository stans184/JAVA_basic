package JAVA_basic_18;

class Book{
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    // Object class 에 포함되어 있음
    // 모든 class 는 Object class 를 상속받음
    // class 를 재정의하고 사용
    public String toString(){
        return title + ", " + author;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Demian", "Hesse");
        System.out.println(book);
    }
}
