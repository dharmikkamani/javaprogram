//Write a Program To print Electricity Bill
 import java.util.*;
 
 interface Data
 {
	 public void Customerdata();
 }
 
 class Bill implements Data
 {	 
	Scanner sc = new Scanner(System.in);
	
	public void Customerdata()
	{
		String Customerid;
		String name;
		
		System.out.println("Enter Customer Id :");
		Customerid = sc.nextLine();
		
		System.out.println("Enter Customer Name :");  
		name = sc.nextLine();
		
		System.out.println("Customer Id : " + Customerid +"\n"+"Customer Name : " + name);
	}
	
	void billamount()
	{
		
		
		
		int pu,cu,ra;
					
		System.out.println("Enter Current Unit");
		cu = sc.nextInt();
		System.out.println("Enter Past Unit");
		pu = sc.nextInt();
		
		System.out.println("Customer Have Past Reamining Amount");
		System.out.println("Enter 1 for Reamin Amount \n Enter 0 For Not Remain Amount");
		ra = sc.nextInt();
	
				
		int totalunit  = cu - pu;
		int totalbill = 0;
				
		if(totalunit > 0)
		{
				
				if(ra == 1)
				{
					// Here 3 is Late Fee for Not PAy At a Time
					ra = ra * 3;
					totalbill = totalunit * 5 * ra;
					System.out.println("Your Bill Amount With Remaining is : " + totalbill);
				}
				else
				{
					totalbill = totalunit * 5;
					System.out.println();
					System.out.println("Your Bill Amount is : " + totalbill + "\u20B9");
				}
		}
		else
		{
			System.out.println("Unit Must Be Greater than Zero..!!");
		}
		
	}
	
	
	public static void main(String args[])
	{
		Bill b1 = new Bill();
		b1.Customerdata();
		b1.billamount();
	}
		
 }
 
