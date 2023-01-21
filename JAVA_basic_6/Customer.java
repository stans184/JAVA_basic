package JAVA_basic_6;

public class Customer {
    // 중요한 정보는 외부에서 건들 수 없도록 private
    // 근데 private 로 하면 하위 class 에서 접근이 안됨
    // 그래서 protected 를 사용함으로서, 하위 class 에서까지는 접근할 수 있도록
    // package default 변수는 외부 package 에서 접근을 못함, 일종의 hiding
    // if else if 조건을 걸어서 실행해야 하는 경우가 많으면, 상속을 고려해본다
    
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;                 // package default, 외부 package에서 접속 못함
    double bonusRatio;

    public Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;

    }

    public void setCustomerID(int ID){
        this.customerID = ID;
    }

    public int getCustomerID(){
        return customerID;
    }

    public void setCustomerName(String name){
        this.customerName = name;
    }

    public String getCustomerName(){
        return customerName;
    }

    public int calcPrice(int price){
        bonusPoint += price*bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade + " 이며, bonus point는 "+ bonusPoint;
    }


}