package JAVA_basic_7;

public class CustomerTest {
    public static void main(String[] args){
        Customer customerJohn = new Customer();
        customerJohn.setCustomerName("john");
        customerJohn.setCustomerID(10010);
        customerJohn.bonusPoint = 1000;
        System.out.println(customerJohn.showCustomerInfo());

        VIPCustomer customerRay = new VIPCustomer();
        customerRay.setCustomerName("Ray");
        customerRay.setCustomerID(10020);
        customerRay.bonusPoint = 10000;
        System.out.println(customerRay.showCustomerInfo());

        // 이렇게 upcasting을 하게 되면, 하위 class의 변수나 method로 접근할 수 없다
        // 즉, 생성은 다 되나 상위 class로 선언되면, 상위 class의 변수나 method 로만 접근 가능, 하위로 불가
        Customer customerCherry = new VIPCustomer();
        customerCherry.setCustomerName("cherry");
        customerCherry.setCustomerID(10030);
        customerCherry.bonusPoint = 20000;
        System.out.println(customerCherry.showCustomerInfo());
    }
}
