package Programs;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] input = {3, 60, 35, 2, 45, 320, 5 };
		bubbleSort(input);
		System.out.println("Sorted array");
		for(int i =0;i<input.length;i++)
		{
			System.out.print(input[i] +" " );
		}
		
		

	}
	
	public static void bubbleSort(int[] input)
	{
	
		int n =input.length;
		int i,j, temp=0;
		for( i =0;i<n;i++)
		{
			for(j = 1;j<n;j++)
			{
				if(input[j-1]>input[j])
				{
					temp =input[j-1];
					input[j-1] = input[j];
					input[j] = temp;
				}
			}

			
		}
	}

}
