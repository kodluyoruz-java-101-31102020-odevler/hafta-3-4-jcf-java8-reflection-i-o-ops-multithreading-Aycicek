package cevap7;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 10000; i++) {
			list.add(i);
		}

		ArrayList<Integer> list_1 = new ArrayList<Integer>();
		for (int i = 1; i <= 2500; i++) {
			list_1.add(i);
		}

		ArrayList<Integer> list_2 = new ArrayList<Integer>();
		for (int i = 2501; i <= 5000; i++) {
			list_2.add(i);
		}

		ArrayList<Integer> list_3 = new ArrayList<Integer>();
		for (int i = 5001; i <= 7500; i++) {
			list_3.add(i);
		}

		ArrayList<Integer> list_4 = new ArrayList<Integer>();
		for (int i = 7501; i <= 10000; i++) {
			list_4.add(i);
		}

		try {
			MyThread myThread_0 = new MyThread();
			myThread_0.listFill(list_1);
			myThread_0.start();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			MyThread myThread_1 = new MyThread();
			myThread_1.listFill(list_2);
			myThread_1.start();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			MyThread myThread_2 = new MyThread();
			myThread_2.listFill(list_3);
			myThread_2.start();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			MyThread myThread_3 = new MyThread();
			myThread_3.listFill(list_4);
			myThread_3.start();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
