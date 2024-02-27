package bai71;

public class Customer {
	private String name;
	private boolean member ;
	private String memberType;
	
	public Customer(String name, boolean member, String memberType) {
		super();
		this.name = name;
		this.member = member;
		this.memberType = memberType;
	}
	public Customer(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMember() {
		return member;
	}
	public void setMember(boolean member) {
		this.member = member;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
	}
	
	
	
}
