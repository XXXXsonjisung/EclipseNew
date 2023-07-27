package com.hw1.model.vo.Employee;

public class Employee {
	// 사원 정보를 저장할 멤버 변수들
	private int empNo; // 사번
	private String empName; // 사원명
	private String dept; //소석부서
	private String job; //직급
	private int age; // 나이 
	private char gender; //성별
	private int salary; //급여
	private double bonusPoint; //보너스포인트
	private String phone; //전화번호
	private String address; //주소
	
	
	//기본생성자
	public Employee() {
		//멤버 변수들을 기본값으로 초기화
		empNo = 0;
		empName = null;
		dept = null;
		job = null;
		age = 0;
		gender = '\0';
		salary = 0;
		bonusPoint = 0.0;
		phone = null;
		address = null;
		
	}
	// 매개변수가 있는 생성자 1
	public Employee (int empNo, String empName, int age,
		char gender, String phone, String address) {
	// 매개변수로 받은 값을 멤버 변수들에 대입
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}
	
	// 매개변수가 있는 생성자 2
	public Employee(int empNo, String empName, String dept, 
			int age, char gender, int salary, double bonusPoint,
			String phone, String address) {
		// 매개변수로 받은 값을 멤버 변수들에 대입
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
		
	}
	
	// 사원 정보 출력 메서드
	public String information() {
		// 멤버 변수들의 값을 문자열로 변환하여 하나의 문자열로 합치기
		String result = "사번 : " + empNo + "\n";
		result += "사원명 : " + empName + "\n";
		result += "소속부서 : " + dept + "\n";
		result += "직급 : " + job + "\n";
		result += "나이 : " + age + "\n";
		result += "성별 : " + gender + "\n";
		result += "급여 : " + salary + "\n";
		result += "보너스포인트 : " + bonusPoint + "\n";
		result += "전화번호 : " + phone + "\n";
		result += "주소 : " + address + "\n";
		
		return result;
	}
	

}

