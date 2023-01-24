package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);
	}
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
//		// 선언된 arrayList 를 처음부터 쭉 훑으면서 Id 로 검색해서 삭제 
//		for (int i = 0; i < arrayList.size() ; i++) {
//			Member member = arrayList.get(i);
//			
//			int tempId = member.getMemberId();
//			if (tempId == memberId) {
//				arrayList.remove(i);
//				return true;
//			}
//			
//			
//		}
		
		Iterator<Member> ir = arrayList.iterator();
		
		while (ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = memberId;
			if (tempId == member.getMemberId()) {
				// iterator 를 이용해서 member를 계속 돌리니까, remove 함수의 input이 다름 
				arrayList.remove(member);
				return true;
			}
			
		}
		
		System.out.println(memberId + " 가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
