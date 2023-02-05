package week1.day2;

public class IsPrime {
	
	public static void main(String[] args) {
		
		int a=97;
		
		for (int i=2;i<a;i++)
		{
			if (a%i ==0)
			{
				System.out.println("It is Not a Primenumber");
				break;
			}
			
			else
			{
				System.out.println("It is a Prime number");
				break;
			}
				
			
		}
		
		
		
		
		
	}

}
