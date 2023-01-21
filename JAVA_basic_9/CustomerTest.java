package JAVA_basic_9;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args){
        Customer customerJohn = new Customer();
        customerJohn.setCustomerName("john");
        customerJohn.setCustomerID(10010);
        customerJohn.bonusPoint = 1000;
        // System.out.println(customerJohn.calcPrice(1000));
        // System.out.println(customerJohn.showCustomerInfo());

        VIPCustomer customerRay = new VIPCustomer();
        customerRay.setCustomerName("Ray");
        customerRay.setCustomerID(10020);
        customerRay.bonusPoint = 10000;
        // System.out.println(customerRay.calcPrice(1000));
        // System.out.println(customerRay.showCustomerInfo());

        // 이렇게 upcasting을 하게 되면, 하위 class의 변수나 method로 접근할 수 없다
        // 즉, 생성은 다 되나 상위 class로 선언되면, 상위 class의 변수나 method 로만 접근 가능, 하위로 불가
        // Customer customerCherry = new VIPCustomer();
        // customerCherry.setCustomerName("cherry");
        // customerCherry.setCustomerID(10030);
        // customerCherry.bonusPoint = 20000;
        // System.out.println(customerCherry.showCustomerInfo());
        // System.out.println(customerCherry.calcPrice(1000));

        Customer customerGAGA = new GoldCustomer();
        customerGAGA.setCustomerName("GAGA");
        customerGAGA.setCustomerID(10030);
        customerGAGA.bonusPoint = 4000;
        // System.out.println(customerGAGA.calcPrice(1000));
        // System.out.println(customerGAGA.showCustomerInfo());
    
        ArrayList<Customer> customerList = new ArrayList<>();

        customerList.add(customerJohn);
        customerList.add(customerRay);
        customerList.add(customerGAGA);

        int pants_price = 49000;

        // for (Customer customer : customerList){
        //     System.out.println(customer.calcPrice(pants_price));
        //     System.out.println(customer.showCustomerInfo());
        // }

        if (customerGAGA instanceof VIPCustomer) {
            System.out.println("true");
        }else{
            System.out.println("False");
        }
    }
}
