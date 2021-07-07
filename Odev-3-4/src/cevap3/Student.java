package cevap3;

import java.util.Scanner;

public class Student {
	
	public String studentName;
	private String studentLastName;
	private int studentAge;
	private String studentEpisode;
	private String studentNo;
	
	
	
	public Student() {
		super();
	}

	public Student(String studentName, String studentLastName, int studentAge, String studentEpisode) {
		super();
		this.studentName = studentName;
		this.studentLastName = studentLastName;
		this.studentAge = studentAge;
		this.studentEpisode = studentEpisode;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentEpisode() {
		return studentEpisode;
	}
	public void setStudentEpisode(String studentEpisode) {
		this.studentEpisode = studentEpisode;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentAge;
		result = prime * result + ((studentEpisode == null) ? 0 : studentEpisode.hashCode());
		result = prime * result + ((studentLastName == null) ? 0 : studentLastName.hashCode());
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		result = prime * result + ((studentNo == null) ? 0 : studentNo.hashCode());
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
		Student other = (Student) obj;
		if (studentAge != other.studentAge)
			return false;
		if (studentEpisode == null) {
			if (other.studentEpisode != null)
				return false;
		} else if (!studentEpisode.equals(other.studentEpisode))
			return false;
		if (studentLastName == null) {
			if (other.studentLastName != null)
				return false;
		} else if (!studentLastName.equals(other.studentLastName))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		if (studentNo == null) {
			if (other.studentNo != null)
				return false;
		} else if (!studentNo.equals(other.studentNo))
			return false;
		return true;
	}
	

	@Override
	public String toString() {
	
		StringBuilder builder =  new StringBuilder();
		
		builder.append(this.getStudentName());
		builder.append("-");
		builder.append(this.getStudentLastName());
		builder.append(" ");
		builder.append(this.getStudentAge());
		builder.append(" ");
		builder.append(this.getStudentEpisode());
		builder.append(" ");
		builder.append(this.getStudentNo());
		
		return builder.toString();
	}
	
	

}
