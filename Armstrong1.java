// Program to find numer is Armstrong or not:
import java.util.Scanner;
class Armstrong1{
	public static void main(String...args)
	{
		int a,i,r,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an number");
		a=sc.nextInt();
		r=a;
		while(a>0)
		{
			i=a%10;
			sum=sum+(i*i*i);
			a=a/10;
		}
		if(r==sum){
			System.out.println("Armstrong");
			}
		else{
			System.out.println("Not an armstrong");
		
			}
		
	}
}