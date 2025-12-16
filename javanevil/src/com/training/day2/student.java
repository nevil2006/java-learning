package com.training.day2;

public class student {
	int rollno;
	String name;
	int mark1;
	int mark2;
	int total=mark1-mark2;
	
	int year = 2027;
	student(){
		rollno=0;
		name="no name";
		mark1=0;
		mark2=0;
		total=0;
		System.out.println("hi");
		
	}
	student(int rollno,String name,int mark1,int mark2){
		this.rollno= rollno;
		this.name=name;
		this.mark1=mark1;
		this.mark2=mark2;
		this.total=mark1+mark2;
		
		System.out.println("hai bro");
		
	}


	void print() 
	
	{
		System.out.println(rollno + "-" + name + " " + mark1+" "+mark2+" "+total);
	}

	public static void main(String[] args) {
		
		student s1= new student(01,"abinav",29,30);
//		s1.rollno=2;
//		s1.name="abinav";
//		s1.mark1=12;
//		s1.mark2=13;
//		s1.total=s1.mark1+s1.mark2;	
		s1.print();
		
		
		student s2= new student(62,"nevil",29,30);
		
		s2.print();
		student s3=new student();
		s3.print();
	}

}