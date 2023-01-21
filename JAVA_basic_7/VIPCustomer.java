package JAVA_basic_7;

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
        System.out.println("VIPCustomer() call");

    }

    public int getAgentID(){
        return agentID;
    }

    public void setAgentID(int ID){
        this.agentID = ID;
    }
}
