package oop;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class consoleApp {
	static Scanner scanner = new Scanner(System.in);
	static List<Mentor> mentors = new ArrayList<>();
	static List<Student> students = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option=0;
		
		do {
			showMenu();
			if(scanner.hasNextInt())
			{
				option = scanner.nextInt();
				scanner.nextLine();
				
				switch(option)
				{
				case 1:
					registerNewStudent();
					break;
				case 2:
					registerNewMentor();
					break;
				case 3:
					viewList();
					break;
				case 4:
					System.out.println("Exiting application. Goodbye!");
					break;
				default:
					System.out.println("Please enter a number from 1 to 3");
					break;
				}
			}
			else
			{
				System.out.println("\nPlease enter a number from 1 to 3");
				
			}
		}while(option!=4);
	}
	
	public static void registerNewStudent() {
		System.out.println("Adding a new student");
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		System.out.print("Enter gmail: ");
		String gmail = scanner.nextLine();
		System.out.print("Enter phone: ");
		String phone = scanner.nextLine();
		
		Student newStudent = new Student(name,gmail,phone);
		students.add(newStudent);
		System.out.println("Successfully adding a new student!");
	}
	
	public static void registerNewMentor() {
		System.out.println("Adding a new mentor");
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		System.out.print("Enter year of experience: ");
		if(scanner.hasNextInt()) {
			int year = scanner.nextInt();
			
			Mentor newMentor = new Mentor(name,year);
			mentors.add(newMentor);
			System.out.println("Successfully adding a new mentor!");
		}
		else
		{
			System.out.println("\nInvalid year of experience\n");
		}
	}
	
	public static void viewList()
	{
		System.out.println("\n All students are registered");
		if(students.isEmpty())
		{
			System.out.println("\n No student addded");			
		}
		else
		{
			for(Student student: students)
			{
				student.showProfile();
				
			}
		}
		
		
		System.out.println("\n All mentors are registered");
		if(mentors.isEmpty())
		{
			System.out.println("\n No mentor addded");			
		}
		else
		{
			for(Mentor mentor: mentors)
			{
				mentor.showProfile();
				
			}
		}
	}
	
	
	public static void showMenu()
	{
		System.out.println("\nPlease choosing the required task");
		System.out.println("1. Register a new student");
		System.out.println("2. Register a new mentor");
		System.out.println("3. View all students and mentors");
		System.out.println("4. Exit");
	}

}
