//Write a Java program to find HCF (GCD),LCM of two numbers.

import java.util.Scanner;
class HcfLcmnum{
 public static void main(String[] args) {
 	Scanner sc=new Scanner(System.in);
		int num;int num1;
		System.out.println("Enter the Number 1");
		num=sc.nextInt();
		System.out.println("Enter the Number 2");
		num1=sc.nextInt();
int j=0;
        for(int i=1;i<num+num1;i++)
        {
        	
        	if(num%i==0 && num1%i==0)
        	{
        	 j=i;
        	}
        
        }

        String res=String.format("HCF is %d",j);

            System.out.println(res);

            
            int max;

            if(num>num1)
            {
            	max=num;
            }

            else
            	max=num1;

            int lcm=max;

            while(lcm%num!=0 || lcm%num1!=0)
            {
            	lcm=lcm+max;
            }
            String res1=String.format("LCM is %d",lcm);
            System.out.println(res1);


 }


	
}

