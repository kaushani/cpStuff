package com.cg.Thread;
class Hi
{
	public void show() 
	{
		for(int i=1;i<=5;i++)
			System.out.println("Hi");
		try
		{
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			
		}
	}
}
class Hello
{
	public void show()
	{
		for(int i=1;i<=5;i++)
			System.out.println("Hello");
	}
}
public class ThreadDemo 
{
	public static void main(String[] args)
	{
	Hi obj1=new Hi();
	obj1.show();
	Hello obj2=new Hello();
	obj2.show();

	}
}
