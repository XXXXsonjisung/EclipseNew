package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.model.vo.Book;

public class BookService {
	
	private Scanner sc = new Scanner(System.in);
	
	private List<Book> library = new ArrayList<Book>();
	private List<Book> favList = new ArrayList<Book>();
	
	public  BookService() {
		
		
	}

	public void displayMenu() {
		
		try {
			
			int menuNum = 0;
			do {
				
				System.out.println("====도서 목록 프로그램====");
				System.out.println("1. 도서 등록");
				System.out.println("2. 도서 조회");
				System.out.println("3. 도서 수정");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 즐겨찾기 추가");
				System.out.println("6. 즐겨찾기 삭제");
				System.out.println("7. 즐겨찾기 조회");
				System.out.println("0. 프로그램 종료");
				
				System.out.print("메뉴를 입력하세요 : ");
				
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 1 : 
				case 2 : 
				case 3 : 
				case 4 : 
				case 5 : 
				case 6 : 
				case 7 : 
				case 0 : 
				default : 
				}
				
			} while(menuNum != 0);
			
		} catch(Exception e) {
		e.printStackTrace();
	}
}
	
	public String addBook() {
		
		System.out.println("=======도서등록=======");
		
		System.out.print("도서 번호 : ");
		int bookNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 제목 : ");
		String name = sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String writer = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.err.println("도서 출판사 : ");
		String publisher = sc.nextLine();
		
		Book newBook = new Book(bookNum, name, writer, price, publisher);
		
		library.add(newBook);
		
		return "등록완료";
				
	}
	
	public void bookList(List<Book>list) {
		
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다. 도서를 등록해주세요");
		} else {
			for(Book temp : list) {
				System.out.println(temp);
			}
		}
	}
	
	public String editBook() {
		bookList(library);
		
		int editMenu = 0;
		
		System.out.println("====도서 수정=====");
		
		System.out.println("수정할 도서 번호를 입력하세요 : ");
		int bookNum = sc.nextInt();
		
		boolean flag = true;
		
		for ( Book temp : library ) {
			
			if (temp.getBookNum() == bookNum ) {
				flag = false;
				
				System.out.println("1. 도서명");
				System.out.println("2. 도서 저자");
				System.out.println("3. 도서 가격");
				System.out.println("4. 도서 출판사");
				System.out.println("0. 수정 종료");
				System.out.print("어떤 정보를 수정하시겠습니까? ");
				
				editMenu = sc.nextInt();
				sc.nextLine();
				
				switch(editMenu) {
				case 1 : System.out.println("===도서명 수정===");
				System.out.println("수정할 도서명을 입력하세요 : ");
				String name = sc.nextLine();
				temp.setName(name);
				break;
				
				case 2 : System.out.println("====도서 저자 수정====");
				System.out.print("수정할 저자명을 입력하세요 : ");
				String writer = sc.nextLine();
				temp.setWriter(writer);
				
				case 3: System.out.println("=====도서 가격 수정====");
				System.out.println("수정할 가격을 입력하세요 : ");
				int price = sc.nextInt();
				temp.setPrice(price);
				editMenu=0;
				break;
				
				case 4: System.out.println("=====도서 출판사 수정 =====");
				System.out.print("수정할 출판사를 입력하세요 : ");
				String publisher = sc.nextLine();
				editMenu =0;
				break;
				
				case 0 : System.out.println("종료합니다."); break;
				
				default : System.out.println("잘못 입력하셨습니다."); break;
				}
			}
		}
		
		if(flag) {
			return "일치하는 도서번호가 없습니다.";
		}
		return "수정완료";
		
	}
	
	/**
	 *  도서 삭제용 메서드
	 */
	public String deleteBook() {
		
		System.out.println("=====도서 삭제======");
		
		bookList(library);
		
		System.out.println("삭제할 도서의 번호를 입력하세요 : ");
		int deleteNum = sc.nextInt();
		
		for(Book temp : library) {
			
			if(temp.getBookNum()==deleteNum) {
				int index = library.indexOf(temp);
				
				System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
				
				char answer = sc.next().toUpperCase().charAt(0);
				
				if(answer == 'Y') {
					library.remove(index);
					break;
				}else {
					return "삭제를 진행하지 않습니다";
				}
			}
		}
		
	}
	
	
}

