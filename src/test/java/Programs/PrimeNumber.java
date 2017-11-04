package Programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sf = new Scanner(System.in);
		int input = sf.nextInt();
	int i,m=0,flag=0;
	m=input/2;
		for(i=2;i<=m;i++)
		{
			if(input%i==0)
			{
				System.out.println("number is not prime");
				flag =1;
				break;
				
			}
			
		
		}
		

	
if(flag==0)

	System.out.println("Is prime");
}
}
