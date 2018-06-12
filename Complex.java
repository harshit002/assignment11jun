package assignment23;

import java.util.Scanner;

public class Complex {
	int Real;
	int Imaginary;
	
	public void Display(int Real,int Imaginary)
	
	{
		System.out.println("The Complex Number= "+(Real+"+"+(Imaginary+"i")));
	}

	public static void main(String[] args) {
		int Real,Imaginary;
		Scanner sc=new Scanner(System.in);
		Real=sc.nextInt();
		Imaginary =sc.nextInt();
		
		Complex obj=new Complex();
		obj.Display(Real, Imaginary);
		
		
		

	}

}
