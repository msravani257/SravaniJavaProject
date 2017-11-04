package Programs;

public class Fabno {

	public static void main(String[] args) {
	int a=0,b=1,c;
	int n = 5;
	
	
	for(int i=0;i<=n;i++)
	{
		c = a +b;
		a=b;
		b= c;
		
		System.out.print(c+ "\t");
	
		
	}
	
	

	}

}
