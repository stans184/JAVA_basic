package ch10;

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
	
	@Override
	public String toString() {
		return memberName + " 회원님의 ID는 " + memberId + " 입니다.";
	}
}

