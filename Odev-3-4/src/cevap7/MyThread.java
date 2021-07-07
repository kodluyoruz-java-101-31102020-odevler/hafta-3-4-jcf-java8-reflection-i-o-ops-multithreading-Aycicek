package cevap7;

import java.util.ArrayList;

public class MyThread extends Thread {
	private ArrayList<Integer> list;
	private ArrayList<Integer> ciftList;
	private ArrayList<Integer> tekList;
	private String threadName;
	
	public void listFill(ArrayList<Integer> list) {
	
		this.list = list;
	}

	public void printList() {
		
		System.out.println("Tek Sayılar");
		System.out.println(tekList + "\n");
		System.out.println("Çift Sayılar");
		System.out.println(ciftList + "\n");
	}

	@Override
	public void run() {
		ciftList = new ArrayList<Integer>();
		tekList = new ArrayList<Integer>();
		threadName = Thread.currentThread().getName();
		

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				ciftList.add(list.get(i));
			} else {
				int a = list.get(i);
				tekList.add(a);
			}
		}
	
		System.out.println(threadName);
		printList();
		
		
	}
}
