package com.training.day1;

public class LAB2 {
	int rollno;
	String name;
	int year;
	
	void print() {
		System.out.println(rollno + "-" + name + " " + year + " ");

	}

	public static void main(String[] args) {
		 LAB2 s1 = new LAB2();
		 s1.rollno = 101;
		 s1.name = "ASK";
		 s1.year= 2006;
		 LAB2 s2  = new LAB2();
		 s2.rollno = 102;
		 s2.name  = "NEJ";
		 s2.year = 2005;
		 s1.print();
		 s2.print();

	}

}
