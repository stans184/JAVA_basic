package ch08;

public class TravelCustomer {
	
	private String customerName;
	private int customerAge;
	private int customerCost;
	
	public TravelCustomer(String name, int Age, int cost) {
		this.customerName = name;
		this.customerAge = Age;
		this.customerCost = cost;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public int getCustomerCost() {
		return customerCost;
	}
	public void setCustomerCost(int customerCost) {
		this.customerCost = customerCost;
	}
	
	public void showCustomerInfo() {
		System.out.println(customerName + " 고객님의 나이는 " + customerAge + " 이므로 가격은 " + customerCost + " 입니");
	}
	
	public String toString() {
		return customerName + " 고객님의 나이는 " + customerAge + " 이므로 가격은 " + customerCost + " 입니다";
	}
}
