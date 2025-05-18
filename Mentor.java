package oop;

public class Mentor extends Person {
	int yearOfExperience;
	
	
	//constructor
	Mentor() {
		super();
		this.yearOfExperience = 0;
	}
	
	Mentor(String name, int year) {
		super(name);
		this.yearOfExperience = year;		
	}
	
	@Override
	public void showProfile()
	{
		super.showProfile();
		System.out.printf("Mentor working experience (in years): %d\n", this.yearOfExperience);
	}
}
