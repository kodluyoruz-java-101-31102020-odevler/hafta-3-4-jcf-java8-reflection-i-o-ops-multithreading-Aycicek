package cevap5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Book book1 =  new Book("Küçük Prens", "Antoine de Saint-Exupéry", 96);
		Book book2 =  new Book("Simyacı", "Paulo Coelho", 184);
		Book book3 =  new Book("Uçurtma Avcısı", "Khaled Hosseini", 52);
		Book book4 =  new Book("Böğürtlen Kışı", "Sarah Jio", 360);
		Book book5 =  new Book("Suç ve Ceza ", "Fyodor Dostoyevski", 75);
		Book book6 =  new Book("Milena’ya Mektuplar", "Franz Kafka", 395);
		Book book7 =  new Book("Şeker Portakalı", "José Mauro De Vasconcelos", 95);
		Book book8 =  new Book("Kürk Mantolu Madonna", "Sabahattin Ali", 160);
		Book book9 =  new Book("Sol Ayağım", "Christy Brown", 189);
		Book book10 =  new Book("Tutunamayanlar", "Oğuz Atay", 671);
				
	    ArrayList<Book> book = new ArrayList<Book>();
		book.add(book1);
		book.add(book2);
		book.add(book3);
		book.add(book4);
		book.add(book5);
		book.add(book6);
		book.add(book7);
		book.add(book8);
		book.add(book9);
		book.add(book10);
		
		
		Map<String, String> map1 = book
									.stream()
									.collect
									(Collectors.toMap(Book::getAuthorName, Book::getBookName));
						
		map1.entrySet().forEach(System.out::println);
		System.out.println();
		
		System.out.println("Sayfa sayısı 100'den fazla olan kitaplar");
 
		List<Book> map2 = book
	    .stream()
	    .filter(s -> s.getPageNumber()>100)
	    .collect
		(Collectors.toList());
	    
		for (Book b : map2) {
			System.out.println(b.getBookName() + " - " + b.getPageNumber());
		}
	}
}
