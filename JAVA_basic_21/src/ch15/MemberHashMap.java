package ch15;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int targetId) {
		
		if (hashMap.containsKey(targetId)) {
			hashMap.remove(targetId);
			return true;
		}else {
			System.out.println("No Element");
			return false;
		}
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while (ir.hasNext()) {
			int key = ir.next();
			
			Member member = hashMap.get(key);
			
			System.out.println(member);
		}
	}
}
