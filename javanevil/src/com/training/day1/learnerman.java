package com.training.day1;

public class learnerman {
	int rollno;
	String name;
	static int year = 2027;
	static
	{
		System.out.println("Hello Students");
	}
	static void print() {
		System.out.println( " " + year);
	}

	public static void main(String[] args) {
		print();
//		Student s1 = new Student();
//		s1.rollno = 101;
//		s1.name = "ASK";
//		Student s2 = new Student();
//		s2.rollno = 102;
//		s2.name = "DSA";
//		s1.print();
//		s2.print();
	}

}