package ch12;

public class MemberHashSetTest {
	public static void main(String[] args) {
		
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "LeeSunSin");
		Member memberKim = new Member(1002, "KimYouShin");
		Member memberKang = new Member(1003, "KangKamChan");
		Member memberHong = new Member(1004, "HongGilDong");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberKang);
		memberHashSet.addMember(memberKang);
		memberHashSet.addMember(memberKim);
		// hashSet -> 중복된 input 이 있어도 하나만 출력됨 
		memberHashSet.showAllMember();
		
		Member memberYou = new Member(1003, "YouGwanSun");
		
		memberHashSet.addMember(memberYou);
		// 유관순과 강감찬은 id 가 똑같지만 현재 상태에서는 입력됨, 중복으로 걸러지지 않음
		// Member 측에서 동일한 변수에 대한 정의를 하지 않았기 때문 
		// hashSet 의 객체인 Member 에다가 hashCode, isEqual 을 정의해주면
		// 동일한 id 를 가지고 있는 객체는 들어가지 않음 
		memberHashSet.removeMember(1004);
		// 중간에 빠져도 순서가 그대로 유지됨 
		memberHashSet.showAllMember();
		
	}
}
