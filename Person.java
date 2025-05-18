package oop;

public class Person {
	String name;
	
	public Person() {
		this.name = "default";
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void showProfile()
	{
		System.out.printf("Student name: %s\n",this.name);
	}
}
