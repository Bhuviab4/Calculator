package com.jsp.project;

class Cal{
	
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition of two numbers: "+sum);
	}
	public void sub(int a,int b)
	{
		int sum=a-b;
		System.out.println("Substraction of two numbers : "+sum);
	}
	public void mul(int a,int b)
	{
		int sum=a*b;
		System.out.println("multiplication of two numbers : "+sum);
	}
	public  void div(int a,int b)
	{
		int sum=a/b;
		System.out.println("Division of two numbers : "+sum);
	}
}
public class Calculator 
{
	public static void main(String[] args) {
		Cal cal=new Cal();
		cal.add(10,20);
		cal.sub(20, 10);
		cal.mul(3, 4);
		cal.div(10, 5);
	}
}
