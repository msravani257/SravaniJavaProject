package Programs;

public class PrintPiramid {

	public static void main(String[] args) {
	
		
		int n = 7;
		for(int j = 0;j<=n-1;j++)
		{
			for(int i=0;i<=2*(n)-1;i++)
			{
			if(i>=n-j-1 && i<=n-1+j)
			{
				
				System.out.print("* ");
				
				
			}
			else
			{
				System.out.print("  ");
			}
			}
			
			System.out.println("\n");
		}
		

	}

}
