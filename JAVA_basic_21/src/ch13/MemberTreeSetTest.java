package ch13;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		
//		TreeSet<String> set = new TreeSet<>();
		
//		set.add("hong");
//		set.add("kim");
//		set.add("lee");
//		
//		변수로 받은 String object 안에 이미 comparable 이 있기 때문에, tree 는 정렬되어 출력 
//		System.out.println(set);
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		// 그냥 넣으면 comparable 이 구현되어 있지 않아서 에러 발생 
		// member 변수에다가 comparable을 구현해줘야 
		Member memberKim = new Member(1002, "kim");
		Member memberLim = new Member(1004, "Lim");
		Member memberHong = new Member(1001, "hong");
		Member memberPark = new Member(1003, "park");
		
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberLim);
		memberTreeSet.addMember(memberPark);
		
		memberTreeSet.showAllMember();
		
	}
}
