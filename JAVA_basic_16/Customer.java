package JAVA_basic_16;

public class Customer implements Buy, Sell {

    @Override
    public void sell() {
        System.out.println("customer sell");
    }
    
    @Override
    public void buy() {
        System.out.println("customer buy");
        
    }
    // 2개의 인터페이스를 구현하게 되어서, default method 가 중복, 직접 구현해주거나, 하나를 선택해주어야 함
    public void order(){
        System.out.println("customer order");
    }
    
    public void hello(){
        System.out.println("hello");
    }
}
