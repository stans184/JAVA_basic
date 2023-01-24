package ch10;

public class MemberArrayListTest {
	public static void main(String[] args) {
		
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "LeeSunSin");
		Member memberKim = new Member(1002, "KimYouShin");
		Member memberKang = new Member(1003, "KangKamChan");
		Member memberHong = new Member(1004, "HongGilDong");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberHong);
		memberArrayList.addMember(memberKang);
		memberArrayList.addMember(memberKim);
		// 들어간 순서대로 나옴 
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(1004);
		// 중간에 빠져도 순서가 그대로 유지됨 
		memberArrayList.showAllMember();
		
	}
}
