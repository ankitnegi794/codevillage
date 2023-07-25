package Assignments;
//(((((10/2)-2)+2)-2)*2)
public class Assignment3 {
	public int sum(int a,int b) {
		int c = a+b;
		return c;
	}
	
	public int sub(int a,int b) {
		int c = a-b;
		return c;
	}
	
	public int div(int a,int b) {
		int c =a/b;
		return c;
	}
	
	public void mult(int a,int b) {
		int c = a/b;
		System.out.println("The final result is "+c);
		
	}

	public static void main(String[] args) {
		Assignment3 obj = new Assignment3();
		int divresult=obj.div(10, 2);
		int subresult=obj.sub(divresult, 2);
		int sumresult=obj.sum(subresult, 2);
		subresult=obj.sub(sumresult, 2);
		obj.mult(subresult, 2);
		

	}

}
