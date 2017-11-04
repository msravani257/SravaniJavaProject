package Programs;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sf = new Scanner(System.in);
		int n = sf.nextInt();
		
		int r,sum =0;
		for(int i=0;i<=n;i++)
		{
			r = n%10;
			sum = sum + r;
			n = n/10;
			
			System.out.println("The reverse of the number is"+ sum);
		}
		
		

	}

}
