public class MyArrayStackTest {
    
    public static void main(String[] args) {
        
        MyArrayStack testStack = new MyArrayStack(3);

        testStack.push(10);
        testStack.push(20);
        testStack.push(30);
        testStack.push(40);

        testStack.printAll();

        System.out.println(testStack.pop());
        System.out.println(testStack.pop());
        System.out.println(testStack.peek());
    }
}
