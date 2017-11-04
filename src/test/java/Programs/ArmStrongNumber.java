package Programs;

import java.util.Scanner;

public class ArmStrongNumber {
public static void main(String[] args) {
	System.out.println("Enter a number");
	
	String sf = new Scanner(System.in).nextLine();
	int out = Integer.parseInt(sf);
	int res = 0,temp,a;
	temp = out;
	while(out>0)
	{
		a = out%10;
		out = out/10;
		res = res + (a*a*a);
	}
	if(res==temp)
	{
	System.out.println("Armstrong number");
	}
	else
	{
		System.out.println("Nota armstrong");
	}
}

}
