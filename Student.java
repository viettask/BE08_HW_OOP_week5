package oop;

class Student extends Person{
	String gmail;
	String phone; 
	
	//constructor
	public Student() {
		super();
		this.gmail = "default";
		this.phone = "default";
	}
	
	//constructor
	public Student(String name, String gmail, String phone)
	{
		super(name);
		this.gmail = gmail;
		this.phone = phone;
	}
	
	@Override
	public void showProfile()
	{
		super.showProfile();
		System.out.printf("Student Email: %s\n", this.gmail);
		System.out.printf("Student Phone: %s\n", this.phone);		
	}
}
