import java.util.Scanner;
class strongnum
{
	public static void main(String args[])
{
	int nn,rem=1,sum=0,i=1;
	System.out.println("enter a value");
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	nn=n;
	while(n>0)
	{
		n=n%10;
		System.out.println("the n value is:"+n);
		while(i<=n)
		{
			rem=n*rem;
			i++;
		}
		sum=sum+rem;
		System.out.println("the sum is:"+sum);
		n=n/10;
	}
	
	if(sum==nn)
	{
	System.out.println("the given number is strong");
	}
	else
	{
	System.out.println("the given numer is not strong");
	}
}
}
		