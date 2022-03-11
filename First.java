package Airth;

class Fourth
{
	public void divi(int a, int b)
	{
		int ans = a/b;
		System.out.println("Division of 2 Numbers Is :" + ans);
	}
	
}
class Third extends Fourth
{
	public void multi(int a, int b)
	{
		int ans = a*b;
		System.out.println("Multiplication of 2 Numbers Is :" + ans);
	}
	
	public void multi(int a, int b, int c)
	{
		int ans = a*b*c;
		System.out.println("Multiplication Of 3 Numbers is :" + ans);
	}
}

class Second extends Third
{
	public void sub(int a, int b)
	{
		int ans = a-b;
		System.out.println("Substraction of 2 Numbers Is :" + ans);
	}
	
	public void sub(int a, int b, int c)
	{
		int ans = a-b-c;
		System.out.println("Substraction Of 3 Numbers is :" + ans);
	}
}

public class First extends Second
{
	public void add(int a, int b)
	{
		int ans = a+b;
		System.out.println("Answer of 2 Numbers Is :" + ans);
	}
	
	public void add(int a, int b, int c)
	{
		int ans = a+b+c;
		System.out.println("Addition Of 3 Numbers is :" + ans);
	}
}


