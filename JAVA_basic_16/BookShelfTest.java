package JAVA_basic_16;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();

        bookQueue.enQueue("harry poter 1");
        bookQueue.enQueue("harry poter 2");
        bookQueue.enQueue("harry poter 3");
        bookQueue.enQueue("harry poter 4");
        bookQueue.enQueue("harry poter 5");
        bookQueue.enQueue("harry poter 6");
        bookQueue.enQueue("harry poter 7");

        System.out.println(bookQueue.getSize());
        
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());

        System.out.println(bookQueue.getSize());
    }
}
