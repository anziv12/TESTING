package Scanner;
import java.util.Scanner;
public class ValueOfNo {
	

  public static void main(String[]args)
	{
		int base,power;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the base" );
		base=sc.nextInt();
		System.out.print("Enter the exponent");
		power=sc.nextInt();
		 
		int result =1;
		for(int i=0;i<power;i++)
		{
			result =result*base;
		}
		System.out.println(base+"to the power"+power+"is:"+result);
		}
}

		
		
		
		
		
	

		
		
		
			
		
		
		
		
		
		
	

	
	
	
	
	
	


