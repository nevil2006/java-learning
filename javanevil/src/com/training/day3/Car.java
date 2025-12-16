package com.training.day3;

public class Car {
	String brand;
    int price;
	public static void main(String[] args) {
		Car s1= new Car();
		s1.brand="audi";
		s1.price=200000;
		
		Car s2= new Car();
		s2.brand="BMW";
		s2.price=10000;
		
		
		System.out.println("brand :"+ s1.brand);
		System.out.println("price:"+s1.price);
		
		System.out.println("brand :"+ s2.brand);
		System.out.println("price:"+s2.price);

	}

}
