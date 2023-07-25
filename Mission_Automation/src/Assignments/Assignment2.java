package Assignments;
//write code to solve (((((10+2)+2)-2))*2)/2)

public class Assignment2 {
	
	public int sum(int a,int b) {
		int c=a+b;
		System.out.println("Sum result is "+c);
		return c;
	}
	public int sub(int a, int b) {
		int c = a-b;
		System.out.println("Subtraction result is "+c);
		return c;
		
	}
	public int multiply(int a, int b) {
		int c = a*b;
		System.out.println("result after multiplying "+c);
		return c;
	}
	public void divide(int a, int b) {
		int c = a/b;
		System.out.println("after dividing the final result is "+c);
		
	}
	public static void main(String[] args) {
		
		//Creation of object
		Assignment2 obj1 = new Assignment2();
		
		//Calling methods
		int sumresult=obj1.sum(10, 2);
		sumresult=obj1.sum(sumresult,2);
		int subresult=obj1.sub(sumresult, 2);
		int mulresult=obj1.multiply(subresult, 2);
		obj1.divide(mulresult, 2);
		
	}

}
