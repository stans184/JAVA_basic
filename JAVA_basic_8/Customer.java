package JAVA_basic_8;

public class Customer {
    protected int customerID;        // 중요한 정보는 외부에서 건들 수 없도록 private
    protected String customerName;   // 근데 private 로 하면 하위 class 에서 접근이 안됨
    protected String customerGrade;  // 그래서 protected 를 사용함으로서, 하위 class 에서까지는 접근할 수 있도록
    int bonusPoint;             // package default 변수는 외부 package 에서 접근을 못함, 일종의 hiding
    double bonusRate;

    public Customer(){
        bonusRate = 0.01;
        customerGrade = "Bronze";
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRate;
        return price;
    }

    public String showCustomerInfo(){
        return customerName+"님의 등급은 "+customerGrade+" 이고 보너스 포인트는 "+bonusPoint;
    }

    public void setCustomerName(String name){
        this.customerName = name;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerGrade(String grade){
        this.customerGrade = grade;
    }

    public String getCustomerGrade(){
        return customerGrade;
    }

    public void setCustomerID(int ID){
        this.customerID = ID;
    }

    public int getCustomerID(){
        return customerID;
    }
}