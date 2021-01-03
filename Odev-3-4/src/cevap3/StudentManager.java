package cevap3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentManager {

	public Student student;
	public static Scanner scan = new Scanner(System.in);

	public void studentPrint(Student s) {

		System.out.println("Adınızı giriniz;");
		s.setStudentName(scan.next());
		System.out.println("Soyadınızı giriniz;");
		s.setStudentLastName(scan.next());
		System.out.println("Yaşınızı Giriniz;");
		s.setStudentAge(scan.nextInt());
		System.out.println("Bölümünüzü Giriniz;");
		s.setStudentEpisode(scan.next());

		System.out.println("name : " + s.getStudentName());
		System.out.println("lastname : " + s.getStudentLastName());
		System.out.println("Age : " + s.getStudentAge());
		System.out.println("Episode : " + s.getStudentEpisode());
		map(s);
	}

	public void map(Student s) {
		Map<String, Student> studentLessonMap = new HashMap<String, Student>();
		studentLessonMap.put(s.getStudentNo(),
				new Student(s.getStudentName(), s.getStudentLastName(), s.getStudentAge(), s.getStudentEpisode()));

		for (Map.Entry<String, Student> entry : studentLessonMap.entrySet()) {
			String key = entry.getKey();
			Student value = entry.getValue();
			System.out.println(key + " : " + value.getStudentName() + " " + value.getStudentLastName() + " "
					+ value.getStudentAge() + " " + value.getStudentEpisode());
		}
	}

	public void studentNo(Student s) {
		System.out.println("Öğrenci Numaranızı Giriniz;");
		s.setStudentNo(scan.next());
	}
}
