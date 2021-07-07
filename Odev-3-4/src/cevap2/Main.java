package cevap2;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Book> name=new TreeSet<Book>();
		name.add(new Book("Kürk Mantolu Madonna", "Sabahattin Ali", 300 ,2019));
		name.add(new Book("Dokuzuncu Hariciye Koğuşu", "Peyami Safa", 200, 2000));
		name.add(new Book("Yaban", "Yakup Kadri Karaosmanoğlu", 354, 2018));
		name.add(new Book("Kiralık Konak", "Yakup Kadri Karaosmanoğlu", 287, 2000));
		name.add(new Book("Vatan Yahut Silistre", "Namık Kemal", 210, 2000));
		name.add(new Book("Küçük Ağa", "Tarık Buğra", 470, 2000));
		
		printAllName(name);
		
		
		
		Set<Book> page=new TreeSet<Book>(new ComparatorClass());
		page.add(new Book("Kürk Mantolu Madonna", "Sabahattin Ali", 300 ,2019));
		page.add(new Book("Dokuzuncu Hariciye Koğuşu", "Peyami Safa", 200, 2000));
		page.add(new Book("Yaban", "Yakup Kadri Karaosmanoğlu", 354, 2018));
		page.add(new Book("Kiralık Konak", "Yakup Kadri Karaosmanoğlu", 287, 2000));
		page.add(new Book("Vatan Yahut Silistre", "Namık Kemal", 210, 2000));
		page.add(new Book("Küçük Ağa", "Tarık Buğra", 470, 2000));
		
		printAllPage(page);
	}
	
	
	public static void printAllName(Set<Book> books) {

		for (Object item : books) {

			System.out.print(item + "\n");
		}
		System.out.println();
	}
	
	public static void printAllPage(Set<Book> books) {

		for (Book item : books) {

			System.out.print(item + "\n");
		}
		System.out.println();
	}

}
