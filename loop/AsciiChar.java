import java.util.Scanner;

class AsciiChar{


	static void charvalue(){
		char j='A';

		for(int i='A';i<='z';i++)
		{
			
			String res=String.format("%d : %c",i,j);
			System.out.println(res);
			j++;
		}
	}
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in);
        charvalue();
		}
	}
