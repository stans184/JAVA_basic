public class MyLinkedList {
    
    private MyListNode head;                        // linkedlist 맨 앞의 element
    int count;                                      // 2가지 방법으로 linkedlist 를 만듬, head에 element를 채우는 방법, head가 가리키는 첫번째부터 채우는 방법

    public MyLinkedList(){
        head = null;
        count = 0;
    }

    public MyListNode addElement(String data){
        // head 부터 첫번째 element 를 채우는 방법
        MyListNode newNode;

        if (head==null) {
            // head 가 비어있으면 node를 생성하고, head에 넣어버림
            newNode = new MyListNode(data);
            head = newNode;
        }else{
            // 맨 뒤에다가 node를 추가하는 방법
            newNode = new MyListNode(data);
            // head 부터 맨 뒤까지 돈다?
            // head 부터 시작해서
            MyListNode temp = head;
            // temp node 의 다음이 null 일때까지 쭉 훑다가
            while (temp.next != null) {
                temp = temp.next;
            }
            // 맨 뒤에다가 새로운 node 를 추가
            temp.next = newNode;
        }
        // 새로운 node 가 들어갔으니까 count 추가
        count += 1;
        
        return newNode;
    }

    public MyListNode insertElement(int position, String data){
        // 중간에 들어가는 경우는, 앞의 노드부터 찾아야 함
        // 맨 앞의 노드와 직전 node 설정
        MyListNode tempNode = head;
        MyListNode preNode = null;
        // 새로운 listNode 설정
        MyListNode newNode = new MyListNode(data);

        // 현재 node의 길이를 벗어나면 안됨
        if (position < 0 || position > count) {
            return null;
        }
        // 맨 앞으로 넣는경우는, head 가 되어야 함
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        }else{  // 맨 앞에 넣는게 아니면, head 부터 직전 node 까지 쭉 훑으면서 preNode 를 찾아야 함
            for (int i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            // 새로운 node 가 들어가면, 원래 preNode 가 가리키던 next를 가져오고
            newNode.next = preNode.next;
            // preNode의 next 가 newNode 가 된다
            preNode.next = newNode;
        }

        count += 1;
        
        return newNode;
    }

    public MyListNode removeElement(int position){
        MyListNode tempNode = head;         // 임의의 node 를 만들고, head 로 선언
        MyListNode preNode = null;          // 삭제할 node의 이전 node를 잡고, null 로 초기화

        if (position >= count) {
            System.out.println("Position Error, Now List amount is " + count);
            return null;
        }
        // head node를 제거하는 경우
        if (position == 0) {
            head = tempNode.next;
        }else{ // 임의의 node를 제거하는 경우, 앞에서부터 훑어어야함
            for (int i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            // 결국 tempNode 를 지우게 되면 preNode가 가리키는 것이 tempNode의 이후 node 가 된다
            preNode.next = tempNode.next;
        }
        
        count -= 1;
        return tempNode;
    }

    public String getElement(int position){
        // 임의의 node 생성
        MyListNode tempNode = head;
        // 범위를 벗어나면 error
        if (position >= count) {
            System.out.println("Search position ERROR, Now list amount is " + count);
            return new String("ERROR");
        }
        // position 0 이면 head 값 반환
        if (position == 0)  return head.getData();
        // position 0 아니고 범위에 있으면 그 전까지 tempNode를 쭉 훑다가 해당 node에 가서
        for (int i = 0; i < position; i++) {
            tempNode = tempNode.next;
        }
        // getdata 로 현재 값 반환
        return tempNode.getData();
    }
    // 임의의 position 의 node를 얻기 위해서는
    public MyListNode getNode(int position){

        MyListNode tempNode = head;

        if (position >= count) {
            System.out.println("Search position ERROR, Now list amount is " + count);
            return null;
        }

        if (position == 0) return head;
        // 앞에서부터 쭉 훑으면서 nextNode 탐색, 완료되면 tempNode 반환
        for (int i = 0; i < position; i++) {
            tempNode = tempNode.next;
        }

        return tempNode;
    }

    public void removeAll(){
        head = null;
        count = 0;
    }

    public int getSize(){
        return count;
    }

    public void printAll(){
        if (count == 0) {
            System.out.println("No Element");
            return;
        }

        MyListNode tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.getData());
            tempNode = tempNode.next;
            if (tempNode != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public boolean isEmpty(){
        if (head == null) return true;
        else return false;
    }
        
}
