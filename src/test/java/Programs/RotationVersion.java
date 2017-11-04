package Programs;

public class RotationVersion {

	public static void main(String[] args) {
		
		String s1 = "Sravaniis";
		String s2 = "issravaNi";
		String s3 = s1+s1;
		 int i =s1.length();
		 int j = s2.length();
		
		if(s1.toUpperCase().length()!=s2.toUpperCase().length())
		{
			System.out.printf("%s is not rotation version of %s \n", s1,s2);
		}
	
		if(s3.toUpperCase().contains(s2.toUpperCase()))
		{
			System.out.printf("%s is rotation of %s", s1,s2);
		}
		
		else
		{
			System.out.println("not a rotation");
			
		}


	}

}
