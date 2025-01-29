// Write a Java program to print all natural numbers from 1 to n. - using while loop

import java.util.Scanner;

class Naturalnum{


	static void Numform(int size){
		int i;int sum=0;
		for(i=1;i<=size;i++)
		{
			System.out.println(i);
			sum+=i;
		}
		String res=String.format("Sum of number: %d",sum);
		System.out.println(res);
		
     }

	static void NumformRev(int size)
	{
		int i;
		for(i=size;i>=1;i--)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);

		int size;

		System.out.println("Enter n number you want to print");
		size=sc.nextInt();
		Numform(size);
		System.out.println("---------------------------------------");
		NumformRev(size);

	}
}