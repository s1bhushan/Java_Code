import java.util.Scanner;

class NumberofDigit
{
	static int numcount(int num)
	{
	int count=1;
    while(num>9)
    {
	num=num/10;
	count++;
    }
    return count;

	}
public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
    int num;

	System.out.println("Enter Number");
	num=sc.nextInt();
    
    int res=numcount(num);

    String op=String.format("The total number of digit is: %d",res);
    System.out.println(op);

    int num1=num/10;
    int res1=num-num1*10;
    String op1=String.format("The last number of digit is: %d",res1);
    System.out.println(op1);

    while(num>9)
    {
	num=num/10;
    }
    String op2=String.format("The first number of digit is: %d",num);
    System.out.println(op2);

    int sum=num+res1;
    String op3=String.format("The sum of first & last number of digit is: %d",sum);
    System.out.println(op3);


	}



	

  }
