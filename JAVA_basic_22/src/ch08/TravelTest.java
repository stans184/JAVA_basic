package ch08;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		
		TravelCustomer customerLee = new TravelCustomer("lee", 40, 100);
		TravelCustomer customerPark = new TravelCustomer("chan", 50, 100);
		TravelCustomer customerHong = new TravelCustomer("hong", 13, 50);
		
		List<TravelCustomer> csList = new ArrayList<>();
		csList.add(customerHong);
		csList.add(customerPark);
		csList.add(customerLee);
		
		// stream 을 활용하면, for 문 등을 이용해서 정렬하고, 출력해야 하는 상황에서
		// 한문장으로 정리가 가능하므로 조금더 간단해진다
		System.out.println("Print Customer List");
		// foreach 출력문에서 바로 name 을 get 할 수도 있고 
		csList.stream().forEach(s -> System.out.println(s.getCustomerName()));
		System.out.println();
		// map 중간연산자에서 한번 거르고 원하는 값을 출력 할 수도 있다
		csList.stream().map(s -> s.getCustomerAge()).forEach(n -> System.out.println(n));
		
		System.out.println("total travel price");
		int totalCost = csList.stream().mapToInt(s -> s.getCustomerCost()).sum();
		System.out.println(totalCost);
		
		// stream 을 이용해서 한방에 실행한 기능
		// 각 항목에서 변수명은 반복되어도 상관 없음
		// 1) 20살 이상인 사람 
		// 2) 그들의 이름을 가져오고
		// 3) 정렬해서 출력
		System.out.println("Person whoes age is over 20");
		csList.stream().filter(c -> c.getCustomerAge() >= 20).map(c -> c.getCustomerName()).sorted().forEach(s -> System.out.println(s));
	}

}
