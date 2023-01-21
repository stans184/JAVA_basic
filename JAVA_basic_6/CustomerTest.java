package JAVA_basic_6;

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
    }
}
