public class MyListNode {

    private String data;                // 자료
    public MyListNode next;             // 다음 node 를 가리키는 link

    public MyListNode(){
        data = null;
        next = null;
    }
    // node 를 추가할 때, data만 받게 되면 다음을 가리키는 것은 설정되지 않음
    public MyListNode(String data){
        this.data = data;
        this.next = null;
    }
    // node 를 받을 때, data 와 다음 link 도 한번에 받는 방법
    public MyListNode(String data, MyListNode link){
        this.data = data;
        this.next = null;
    }

    public String getData(){
        return data;
    }
}
