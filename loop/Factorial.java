import java.util.Scanner;
class Factorial{


static long Factnum(int num)
{
	long res=1;
	for(int i=0;i<num;i++){
			res=res*(num-i);
	}
	return res;

}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the Number");
		num=sc.nextInt();

		long op=Factnum(num);
		String res=String.format("The Factorial of %d is : %l",num,op);
		System.out.println(res);

	}
}