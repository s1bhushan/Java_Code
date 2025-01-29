import java.util.Scanner;

class SumProdifnum{


   static int SumProd(int num)
   {
   	int sum=0;
   	while(num>9)
   	{
   	int res=num%10;
   	
   	sum=sum+res;
   	num=num/10;
    }
     sum=sum+num;
     return sum;
   }

   static int Prodnum(int num)
   {
   	int pro=1;
   	while(num>9)
   	{
   	int res=num%10;
   	
   	pro=pro*res;
   	num=num/10;
    }
     pro=pro*num;
     return pro;
   }
 
   static int Revnum(int num)
   {
   	int rev=0;
   	while(num>9)
   	{
   	int res=num%10;
   	
   	rev=rev*10+res;
   	num=num/10;
    }
     rev=rev*10+num;
     return rev;
   }


   static void Palindrom(int num,int res2)
   {

   	if(num==res2)
   	{
   		System.out.println("Number is Palindrom");
   	}
   	else
   	System.out.println("Number is Not Palindrom");


   }



	public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
    int num;

	System.out.println("Enter Number");
	num=sc.nextInt();

	int res=SumProd(num);
	System.out.println("Sum of num is");
	System.out.println(res);

	int res1=Prodnum(num);
	System.out.println("product of num is");
	System.out.println(res1);

    int res2=Revnum(num);
	System.out.println("reverse of num is");
	System.out.println(res2);

    Palindrom(num,res2);

  }
}