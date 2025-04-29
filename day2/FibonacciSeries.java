package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num1=0,num2=1,n=8;
		
		for (int i = 1; i<=n ; ++i) {
			
			System.out.println(num1);
			
			int febnum= num1+num2;
			num1=num2;
			num2=febnum;
		
		}

	}

}
