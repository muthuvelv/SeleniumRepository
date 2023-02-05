package week1.day2;

public class Fibbinocci {
	
	public static void main(String[] args) {
		
		int a,b,c,sum;
		
		a=0;
		c=1;
		sum=0;
		System.out.println(a);
		System.out.println(c);
		for (b=1;b<=11;b++)
		{
			
			sum=a+c;
			System.out.println(sum);
			a=c;
			c=sum;
			
			
			
		}
		
		
		
		
		
	}

}
