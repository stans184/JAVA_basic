package ch15;

import java.util.HashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberkim = new Member(1001, "kim");
		Member memberHong = new Member(1002, "Hong");
		Member memberPark = new Member(1003, "Park");
		Member memberLim = new Member(1004, "Lim");
		
		memberHashMap.addMember(memberLim);
		memberHashMap.addMember(memberkim);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(memberHong.getMemberId(), memberHong.getMemberName());
		hashMap.put(memberkim.getMemberId(), memberkim.getMemberName());
		hashMap.put(memberLim.getMemberId(), memberLim.getMemberName());
		hashMap.put(memberPark.getMemberId(), memberPark.getMemberName());
		
		System.out.println(hashMap);
	}

}
