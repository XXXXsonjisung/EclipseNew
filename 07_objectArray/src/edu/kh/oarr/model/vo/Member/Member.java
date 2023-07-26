package edu.kh.oarr.model.vo.Member;

public class Member {
	
	//필드 ( == 맴버 변수)
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region; // 지역 (서울, 경기, 충북 .. )
	
	//생성자
	//기본생성자,매개변수생성자
	//생성자만드는 규칙
	//1. 생성자 이름은 클래스명과 같다
	//2. 반환형이 없다.
	// 기본생성자는 컴파일러가 자동으로 생성해주는데,
	// 생성자가 하나라도 있으면, 자동 생성 안해줌
	// -> 기본생성자 직접 작성 해야한다!**
	
	public Member() {} // 기본 생성자
	
	//오버로딩
	//매개변수의 타입, 순서, 갯수가 달라야한다!!!
	public Member(String memberId, String memberPw,
									String memberName, int memberAge,
									String region ) { //매개변수 생성자
		
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
		//모든 메서드는 종료 시 호출한 곳으로 돌아가는 
		// return 구문이 작성되어야 하지만 
		//단, void일 경우 생략 가능
		// ->생략시 컴파일러가 자동 추가해준다.
	}
	
	
	//메서드
	
	public String getMemberId( ) {
		return memberId;
	}
	public String getMemberId(String memberId) {
		return this.memberId = memberId;	
	
}
	public String getMemberPw( ) {
		return memberPw;
	}
	public String getMemberPw(String memberPw ) {
		return this.memberPw = memberPw;
	}
	public String getMemberName( ) {
		return memberName;
}
}

