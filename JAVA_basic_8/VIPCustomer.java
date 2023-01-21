package JAVA_basic_8;

public class VIPCustomer extends Customer{
    
    private int agentID;
    double salesRatio;

    public VIPCustomer(){
        customerGrade = "VIP";
        bonusRate = 0.05;
        salesRatio = 0.1;
        // 자녀 class가 call 되면 우선 부모 class 부터 call
        // super();
        // 하위 class 가 상위 class 의 참조값을 가지고 있다
        // 생성자도 호출
        // 안써됨, 컴파일러가 해줌
        // 상위 class 가 인풋을 받는 class 일 경우 default 상태에서는 오류가 발생함
        // 근데 꼭 형식을 맞추지 않아도
        // super(int, string); 과 같이 인풋을 맞춰줘야 함

    }

    @Override           // 부모 class에서 정의된 method를 자녀 class 의 특징에 맞춰서 다시 정의하는 것
    // 변수는 부모, instance 는 자녀로 선언되었을 때, 자녀의 함수를 가상함수로 불러옴
    // 함수는 instance 마다 기능이 다르지 않다
    // 부모와 기능이 달라서 자녀의 class 에서 재정의한 method의 경우, 가상 method를 통해 들어간다
    public int calcPrice(int price){
        bonusPoint += price * bonusRate;
        price -= (int) price*salesRatio;
        return price;
    }

    public int getAgentID(){
        return agentID;
    }

    public void setAgentID(int ID){
        this.agentID = ID;
    }
}
