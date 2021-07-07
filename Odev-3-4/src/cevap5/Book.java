package cevap5;

public class Book {
	private String bookName;
	private String authorName;
	private int pageNumber;

	public Book(String bookName, String authorName, int pageNumber) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.pageNumber = pageNumber;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public void printBook() {
		System.out.println("Kitap Bilgileri: " + getBookName() + " " + getAuthorName() + " " + getPageNumber());
	}
}
