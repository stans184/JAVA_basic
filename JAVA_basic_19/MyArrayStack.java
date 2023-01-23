public class MyArrayStack {
    // 전역 변수, member 변수인 경우 이렇게만 써놔도 initial 이 됨
    MyArray arrayStack;
    int top;

    public MyArrayStack(){
        top = 0;
        arrayStack = new MyArray();
    }
    
    public MyArrayStack(int size){
        top = 0;
        arrayStack = new MyArray(size);
    }

    // 뒤에서부터 밀어넣기
    public void push(int data){
        // stack 의 경우 size 를 정해놓고 선언했으니, 모두 차있는지 확인 필요
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        // 꽉 차있지 않다면, add 를 통해 맨 뒤로 투입하고 top 증가시킴
        arrayStack.addElement(data);
        top += 1;
    }
    
    // 뒤에서부터 끄내기
    public int pop(){

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return arrayStack.ERROR_NUM;
        }
        // 변수 앞에 연산자가 붙으면, (--, ++) 연산 후에 나머지 진행
        return arrayStack.removeElement(--top);
    }
    
    // 뒤에있는 요소 읽기
    public int peek(){
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return arrayStack.ERROR_NUM;
        }
        // 변수 앞에 연산자가 붙으면, (--, ++) 연산 후에 나머지 진행
        return arrayStack.getElement(--top);

    }

    public boolean isFull(){
        if (top == arrayStack.ARRAY_SIZE) return true;
        else return false;
    }

    public boolean isEmpty(){
        if (top == 0) return true;
        else return false;
    }

    public void printAll(){
        arrayStack.printAll();
    }
}