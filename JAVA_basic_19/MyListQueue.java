interface Queue{
    public void enQueue(String data);
    public String deQueue();
    public void printQueue();
}

public class MyListQueue extends MyLinkedList implements Queue{

    MyListNode front;
    MyListNode rear;

    // interface 에 있는 거 override

    @Override
    public void enQueue(String data){
        
        MyListNode newNode;
        // Q 가 비어있다면, front 가 newNode 가 되어야 함
        if (isEmpty()) {
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        }else{  // 비어있지 않다면, rear 가 newNode 가 되면 됨
            newNode = addElement(data);
            rear = newNode;
        }

        System.out.println(newNode.getData() + " added");
    }

    @Override
    public String deQueue(){
        if (isEmpty()) {
            // 비어있으면, 아무것도 할 수 없음
            return null;
        }
        // 안 비어있으면, front 값 반환
        String data = front.getData();
        front = front.next;
        // front 를 빼고 난 뒤가 null 이면, rear 도 null 로 바꿔줘야 함
        if (front == null) {
            rear = null;
        }
        return data;
    }

    @Override
    public void printQueue(){
        printAll();
    }
}
