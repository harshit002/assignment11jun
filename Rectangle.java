package assignment23;

import java.util.Scanner;

public class Rectangle {
	
	
	
	public  void Area(double length,double breadth)
	{
		System.out.println("Area of Rectangle= "+(l*b));
	}

	public static void main(String[] args) {
		double length;
		double breadth;
		Scanner sc=new Scanner(System.in);
		length=sc.nextDouble();
		breadth=sc.nextDouble();
		Rectangle obj=new Rectangle();
		obj.Area(length,breadth);
		
		

	}

}
