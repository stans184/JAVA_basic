package ch15;

public class Member {

	private int memberId;
	private String memberName;
	
	public Member(int Id, String name) {
		this.memberId = Id;
		this.memberName = name;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int id) {
		this.memberId = id;
	}
	
	public void setMemberName(String name) {
		this.memberName = name;
	}
	
	// hashSet 을 쓰고싶으면 구현해줘야 함 
	// 들어오는 변수가 동일한 놈인지 구분하는 것 
	@Override
	public int hashCode() {
		// 같은 객체일때 동일한 hashCode 를 갖는게 맞음, memberId 
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		
		// 새로 들어온 object 가 member 의 instance 인지 검사하고, 
		if (obj instanceof Member) {
			// instance 가 맞다면 downcasting 
			Member member = (Member) obj;
			// 새로 들어온 멤버와 원래 있던 놈의 id 를 비교해서 맞으면 eqaul, true
			if (this.memberId == member.memberId) {
				return true;
			}else return false;
		}else return false;
		
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 ID는 " + memberId + " 입니다.";
	}
}

