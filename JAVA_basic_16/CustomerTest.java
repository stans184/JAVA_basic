package JAVA_basic_16;

public class CustomerTest {
    public static void main(String[] args) {
        
        // 임의의 class 가 여러 interface 를 구현했다고 해도, 해당 class 의 instance 에서는 최종적으로 정의된 method, variable 등만 사용 가능
        // 밑의 method 중 order 를 보면 알 수 있음
        Customer cs = new Customer();
        cs.buy();
        cs.sell();
        cs.order();
        cs.hello();

    }
}
