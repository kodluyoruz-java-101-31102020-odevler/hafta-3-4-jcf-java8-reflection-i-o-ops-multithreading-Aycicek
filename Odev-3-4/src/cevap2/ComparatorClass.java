package cevap2;

import java.util.Comparator;

public class ComparatorClass implements Comparator<Book> {


	
	@Override
	public int compare(Book o1, Book o2) {
		if( o1.getNumberOfPage() > o2.getNumberOfPage()) {
			return 1;
		}
		else if(o1.getNumberOfPage()< o2.getNumberOfPage()) {
			return -1;
		}
		return 0;
		
	}

}
