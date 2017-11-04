package Programs;

public class PrintDiamond {

	public static void main(String[] args) {
int n = 4;

		
		for(int j=0;j<=n;j++)
		{
			for(int i =0;i<=2*n-1;i++)
			{
				if(i>=n-j+1&&i<=n+j-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}							
			}		
			
			
			
			System.out.println("\n");
		}

	}

}
