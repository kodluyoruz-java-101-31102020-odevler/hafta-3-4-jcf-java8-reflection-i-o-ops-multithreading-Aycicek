package cevap6;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException; 
import java.net.URISyntaxException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws URISyntaxException, FileNotFoundException {
		Scanner scanner = new Scanner(System.in);

		System.out.print("No Giriniz : ");
		String no = scanner.nextLine();

		System.out.print("Adı Giriniz : ");
		String adi = scanner.nextLine();

		System.out.print("Soyadı Giriniz : ");
		String soyadi = scanner.nextLine();

		System.out.print("Bölüm Giriniz : ");
		String bolum = scanner.nextLine();

		System.out.print("Yaş Giriniz : ");
		int yas = Integer.parseInt(scanner.nextLine());
		scanner.close();

		Ogrenci o1 = new Ogrenci(no, adi, soyadi, bolum, yas);

		String path = "data.txt";
		String content = o1.no + "\n" + o1.adi + "\n" + o1.soyadi + "\n" + o1.bolum + "\n" + o1.yasi;
		FileOperations.write(FileOperations.getFile(path), content);
		File resourceFile = FileOperations.getFile(path);

		String newData = FileOperations.read(new FileInputStream(resourceFile));
		System.out.println("\n" + newData + "\n");

	}

}
