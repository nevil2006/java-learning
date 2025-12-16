package com.training.day3;

public class MathOps {
	//static method
	static void add(int a,int b) {
		System.out.println("sum="+(a+b));
	}

    // Non-static method
    void multiply(int a, int b) {
        System.out.println("Product = " + (a * b));
    }

	public static void main(String[] args) {
		//calling static method
		MathOps.add(10,20);
		
        // Calling non-static method → object
        MathOps obj = new MathOps();
        obj.multiply(5, 6);

	}

}
