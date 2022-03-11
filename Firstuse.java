import Airth.First;
import java.util.Scanner;

class Get
{
	public static int n1,n2,n3,ans,nos,ope;
}

class Firstuse extends Get
{
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[])
	{
		System.out.println("How Many Numbers Do you Want to Operate...?");
		nos = sc.nextInt();
		
		First a1 = new First();
	
		
		if(nos == 2)
		{
			System.out.println("Enter First Number");
			n1 = sc.nextInt();
			System.out.println("Enter Second Number");
			n2 = sc.nextInt();
		}
		else
		{
			System.out.println("Enter First Number");
			n1 = sc.nextInt();
			System.out.println("Enter Second Number");
			n2 = sc.nextInt();
			System.out.println("Enter Third Number");
			n3 = sc.nextInt();	
		}
		
		System.out.println("What Do YOu Want To do.. \n 1 for Addtion \n 2 for Substraction \n 3 For Multiplication \n 4 For Division");
		ope = sc.nextInt();
		
		if(ope == 1)
		{
			switch(nos)
			{
				case 2:
					a1.add(n1,n2);
					break;
				
				case 3:
					a1.add(n1,n2,n3);
					break;		
			}
		}
		else if(ope == 2)
		{
			switch(nos)
			{
				case 2:
					a1.sub(n1,n2);
					break;
				
				case 3:
					a1.sub(n1,n2,n3);
					break;
			}
		}
		else if(ope == 3)
		{
			switch(nos)
			{
				case 2:
					a1.multi(n1,n2);
					break;
				
				case 3:
					a1.multi(n1,n2,n3);
					break;
			}
		}
		else 
		{
			switch(nos)
			{
				case 2:
					a1.divi(n1,n2);
					break;
				
				case 3:
					System.out.println("There is Only Two Numbers Divide");
				
			}
		}
	}
}
