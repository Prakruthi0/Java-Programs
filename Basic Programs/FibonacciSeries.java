package programs;
import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int N=sc.nextInt();
		int num1=0;
		int num2=1;
		int num3;
		for(int i=0;i<N;i++)
		{
			num3=num1+num2;
			System.out.print(num1+" ");
			num1=num2;
			num2=num3;
			
		}
		sc.close();
	}

}
