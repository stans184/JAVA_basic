package JAVA_basic_5;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("HarryPotor1", "rolling"));
        library.add(new Book("HarryPotor2", "rolling"));
        library.add(new Book("HarryPotor3", "rolling"));
        library.add(new Book("HarryPotor4", "rolling"));
        library.add(new Book("HarryPotor5", "rolling"));

        for(int i=0;i<library.size();i++){
            library.get(i).showInfo();
        }

    }

    
}
