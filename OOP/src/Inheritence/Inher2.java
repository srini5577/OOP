package Inheritence;

public class Inher2 extends Inher1 {
	
	// this Child class for Inher1 class.To make relation between Inher1 and Inher2 We have to use "Extends" keyword
	//When methods in Parent and child class with same  method name is called method overriding 
	
	public void car1() {
		// this method name is also there in Inher1 class
		System.out.println("child class method1 METHOD OVERRIDING");
	}
	public void Bcar2() {
		System.out.println("child class method1");
	}
	public void Bcar3() {
		System.out.println("child class method1");
	}public void Bcar4() {
		System.out.println("child class method1");
	}
}
