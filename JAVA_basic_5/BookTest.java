package JAVA_basic_5;

public class BookTest {
    public static void main(String[] args){
        // instance 배열을 생성한다고 해서 instance 가 5개 만들어지는 것이 아님
        // 5개의 instance가 생성될 수 있는 공간을 만드는 것 null 값으로
        Book[] library = new Book[5];

        // for(int i=0;i<library.length;i++){
        //     System.out.println(library[i]);
        // }
        
        library[0] = new Book("HarryPoter 1", "Joan");
        library[1] = new Book("HarryPoter 2", "Joan");
        library[2] = new Book("HarryPoter 3", "Joan");
        library[3] = new Book("HarryPoter 4", "Joan");
        library[4] = new Book("HarryPoter 5", "Joan");
        // System.out.println("Library");
        // for(Book book:library){
        //     System.out.println(book);
        //     book.showInfo();
        // }

        System.out.println();

        Book[] copyLibrary = new Book[5];
        
        // copyarray 의 경우 얕은 복사?
        // 하나만 수정해도 2 배열 모두 영향을 미치게 됨
        // 깊은 복사를 하고 싶으면, copyLibrary[] = new Book() 을 통해 instance 를 미리 생성해주고
        // 생성된 instance 에다가 하나씩 복사해줘야 함
        // 같은 instance를 가르킬 필요가 있을 때
        System.arraycopy(library, 0, copyLibrary, 0, library.length);
        
        // System.out.println("copyLibrary");
        // for(Book book:copyLibrary){
        //     System.out.println(book);
        //     book.showInfo();
        // }

        Book[] newLibrary = new Book[5];

        for(int i = 0;i<newLibrary.length;i++){
            newLibrary[i] = new Book();
        }
        // 깊은 복사, 직접 객체에다가 값을 넣어주는 것
        for(int i= 0;i<newLibrary.length;i++){
            newLibrary[i].setTitle(library[i].getTitle());
            newLibrary[i].setAuthor(library[i].getAuthor());
        }

        System.out.println();

        library[0].setTitle("God Father");
        library[0].setAuthor("jackman");

        System.out.println("Library");
        for(Book book:library){
            System.out.println(book);
            book.showInfo();
        }
        System.out.println();

        System.out.println("copyLibrary");
        for(Book book:copyLibrary){
            System.out.println(book);
            book.showInfo();
        }

        System.out.println();
        System.out.println("newLibrary");
        for(Book book:newLibrary){
            System.out.println(book);
            book.showInfo();
        }


    }
}
