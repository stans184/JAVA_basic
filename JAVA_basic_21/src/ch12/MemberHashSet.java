package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	
	private HashSet<Member> hashSet;
	
	public MemberHashSet(int size) {
		hashSet = new HashSet<>(size);
	}
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
//		// 선언된 arrayList 를 처음부터 쭉 훑으면서 Id 로 검색해서 삭제 
//		for (int i = 0; i < hashSet.size() ; i++) {
//			Member member = hashSet.get(i);
//			
//			int tempId = member.getMemberId();
//			if (tempId == memberId) {
//				hashSet.remove(i);
//				return true;
//			}
//			
//			
//		}
		
		Iterator<Member> ir = hashSet.iterator();
		
		while (ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = memberId;
			if (tempId == member.getMemberId()) {
				// iterator 를 이용해서 member를 계속 돌리니까, remove 함수의 input이 다름 
				hashSet.remove(member);
				return true;
			}
			
		}
		
		System.out.println(memberId + " 가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for (Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
