public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList testList = new MyLinkedList();

        testList.addElement("A");
        testList.addElement("B");
        testList.addElement("C");
        System.out.println(testList.getSize());
        testList.printAll();
        System.out.println();

        testList.addElement("E");
        testList.insertElement(3, "D");
        System.out.println(testList.getSize());
        testList.printAll();
        System.out.println();
        
        testList.removeElement(2);
        System.out.println(testList.getSize());
        testList.printAll();
        System.out.println();
        
        testList.insertElement(0, "A-1");
        System.out.println(testList.getSize());
        testList.printAll();
        System.out.println();
        
    }
}
