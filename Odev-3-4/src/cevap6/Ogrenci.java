package cevap6;

public class Ogrenci {
	public String no;
	public String adi;
	public String soyadi;
	public String bolum;
	public int yasi;

	public Ogrenci(String no, String adi, String soyadi, String bolum, int yasi) {
		this.no = no;
		this.adi = adi;
		this.soyadi = soyadi;
		this.bolum = bolum;
		this.yasi = yasi;
	}

	public void yazdirBilgi() {
		System.out.println("Öğrenci: " + "No: " + no + " Adı: " + adi + " Soyadı: " + soyadi + " Bölüm: " + bolum
				+ " Yaşı: " + yasi);
	}
}

