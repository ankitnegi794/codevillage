package Assignments;
////Create a class named student put two variables age and roll number, Create Two method
//display1=Automation is easy, display2=Welcome to all of you
//call both methods and call both values, Assign some value and print both values 
public class Student {
	
	public void display1() {
		System.out.println("Automation is easy");
	}
	public void display2() {
		System.out.println("Welcome to all of you");
	}
	int age;
	int rollNumber;
	
	public static void main(String[] args) {
		Student obj1 = new Student();
		
		obj1.age=28;
		obj1.rollNumber=1;
		
		obj1.display1();
		obj1.display2();
		System.out.println(obj1.age);
		System.out.println(obj1.rollNumber);
	}

}
