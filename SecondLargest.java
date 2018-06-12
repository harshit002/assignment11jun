package assignment23;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String args[])
	{
		int array[]=new int[5],t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<5;i++)
		array[i]=sc.nextInt();
		
		for(int j=0;j<5;j++)
		{
			for(int k=j+1;k<5;k++)
			{
				if(array[j]<array[k])
				{
					t=array[j];
					array[j]=array[k];
					array[k]=t;
				}
			}
		}
         System.out.println("Second Largest Element= "+ array[1]);		
		
	}

}
