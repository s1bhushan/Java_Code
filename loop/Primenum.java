import java.util.Scanner;

class Primenum{

	static void Primedefine(int num)
      {
           if(num<=1)
		{
			System.out.println("Its a prime num");
		}
		int count=0;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0){
			count++;			 
			}	
      }
      if(count>1)
      {
      	System.out.println("not prime num");

      }
      if(count<1)
      {

          System.out.println(" prime num");
      }
      
                  

      }  


static void printprime(int num1)
{
	int j=0;
	 for(j=1;j<=num1;j++)
	 {
	 
		int count=0;
		for(int i=2;i<=j/2;i++)
		{
			if(j%i==0){
			count++;
			break;			 
			}	
      }
      
      if(count==0 && j!=1)
      {
          System.out.println(j);
      }
   }
  }
                  



	public static void main(String[] args) {




		Scanner sc=new Scanner(System.in);

		int num;
		System.out.println("Enter the Number");
		num=sc.nextInt();
		
		Primedefine(num);

		int num1;
		System.out.println("Enter the Number");
		num1=sc.nextInt();
		
		printprime(num1);
        
		

		}
		

	}
