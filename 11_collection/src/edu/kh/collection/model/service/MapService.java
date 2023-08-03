package edu.kh.collection.model.service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import edu.kh.collection.model.vo.Member;

public class MapService {

	// Map : Key와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체
	
	// - Key를 모아두면 Set의 특징 (중복 x)
	// - Value를 모아두면 List의 특징 (중복 o)
	
	public void ex1() {
		
		// HashMap<K, V> : Map의 자식 클래스 중 가장 대표되는 Map
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Map.put(Integer Key, String Value) I : 추가 
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "박길동");
		map.put(5, "이길동");
		map.put(6, "최길동");
		
		// Key 중복
		map.put(1, "홍홍홍");  // 중복 허용 x, 대신 value 덮어쓰기
		
		// value 중복
		map.put(7,"최길동");  // 
		
		System.out.println( map ); // map.toString() 오버라이딩 되어있음.
	}
	
	public void ex2() {
		
		// Map 사용 예제
		
		// Vo(값 저장용 객체)_는 특정 데이터 묶음의 재사용이 많은 경우 주로 사용
		// -> 재사용이 적은 Vo는 오히려 코드 낭비
		// -> Map을 이용해서 Vo와 비슷한 코드를 작성할 수 있다.
		
		// 1) Vo 버전
		Member mem = new Member();
		
		// 값세팅
		mem.setId("user01");
		mem.setPw("pass01");
		mem.setAge(30);
		
		// 값 출력
		System.out.println( mem.getId() );
		System.out.println( mem.getPw() );
		System.out.println( mem.getAge() );
		
		System.out.println("----------------------------------------------");
		
		// 2) Map 버전
		
		Map<String, Object> map = new HashMap<String, Object>();
		// value가 Object 타입 = 어떤 객체든 Value에 들어올 수 있다.
		
	    // 값 세팅
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 25);
		
		// 갑 출력
		System.out.println( map.get("id") );
		System.out.println( map.get("pw") );
		System.out.println( map.get("age") );
		
		System.out.println("----------------------------------------------");
		
		// ******Map에 저장된 데이터 순차적으로 접근하기 ********
		
		// Map 에서 Key만 모아두면 Set의 특징을 가진다.
		// -> 이를 활용 할 수 있도록 Map에서
		// KeySet() 메서드 제공
		// -> Key만 모아서 Set으로 반환 
		
		Set<String> set = map.keySet(); // id, pw, age 가 저장된 Set반환 
		
		System.out.println( "keySet() : " + set);
		
		// 향상된 for문
		for ( String key : set) {
			System.out.println( map.get(key) );	
		}
		
		// map에 저장된 데이터가 많거나
		// 어떤 key가 있는지 불분명 할때
		// 또는 map 에 저장된 모든 데이터에 접근해야할 때
		// keySet() + 항상된 for문 코드 사용
		

	}
	
	public void ex3() {
		
		List< Map<String,Object> > list = new ArrayList<  Map<String,Object> >();
		
		for (int i = 0; i < 10; i++) {
			
			// Map 생성
			Map<String,Object> map = new HashMap<String, Object>();
		
			
			// Map에 데이터 추가
			map.put("id","user0" + i);
			
			// Map을 List 추가
			list.add(map);
		}
		
		// for문 종료 시 list에 10개의 Map 객체가 추가되어있다.
		
		for( Map<String,Object> temp : list) {
			System.out.println(temp.get("id") );
			
		}
		
	}
}
	
	

