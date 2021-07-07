package cevap2;



public class Book implements Comparable<Book>{

	private String bookName;
	private String authorName;
	private int numberOfPage;
	private int releaseDate;

	
	
	public Book() {
		super();
	}

	public Book(String bookName, String authorName, int numberOfPage, int releaseDate) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.numberOfPage = numberOfPage;
		this.releaseDate = releaseDate;
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

	public int getNumberOfPage() {
		return numberOfPage;
	}

	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + ", numberOfPage=" + numberOfPage
				+ ", releaseDate=" + releaseDate + "]";
	}

	@Override
	public int compareTo(Book o) {
		
		return this.bookName.compareTo(o.bookName);
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + numberOfPage;
		result = prime * result + releaseDate;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (numberOfPage != other.numberOfPage)
			return false;
		if (releaseDate != other.releaseDate)
			return false;
		return true;
	}
}
