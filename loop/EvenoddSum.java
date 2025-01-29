import java.util.Scanner;

class EvenoddSum{

	static void Evenoddnum(int size){
		int sumE=0;
		int sumO=0;
		System.out.println("Even number is");

		for(int i=1;i<=size;i++)
		{
			
			
			if(i%2==0)
			{
				
				System.out.println(i);
				sumE+=i;
			}
		}
		String op=String.format("sum of even number is: %d",sumE);
		System.out.println(op);

		System.out.println("Odd number is");

		for(int i=1;i<=size;i++)
		{	

			if(i%2==1)

			{
				
				System.out.println(i);
				sumO+=i;

			}
		} 
		String op1=String.format("sum of odd number is: %d",sumO);
		System.out.println(op1);   
			  

		}
		
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int size;

		System.out.println("Enter n number");
		size=sc.nextInt();
		Evenoddnum(size);
	}
}