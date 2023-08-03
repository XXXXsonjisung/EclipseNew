package edu.kh.collection.model.vo;

public class Book {
	private String name;
	private String writer;
	private int price;
	private String publisher;
	private int bookNum;
	
	public Book() {}

	public Book(String name, String writer, int price, String publisher, int bookNum) {
		super();
		this.name = name;
		this.writer = writer;
		this.price = price;
		this.publisher = publisher;
		this.bookNum = bookNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	
	@Override
	public String toString() {
		return bookNum + "번 도서 : [도서제목 : " + name + " / 도서저다 : "  + writer + " / 도서가격 : " + price + "원 / 출판사 : " +publisher + "]"; 
	}

}
