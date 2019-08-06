import java.util.Scanner;
public class coprime
{
	public static void main(String[] args)
	{
		System.out.println("enter the values of a and b");
		System input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		for (int i=1;i<=a;i++)
		{
			if ((a%i==0))
			{
				c=c+1;
			}
		}
		if (c>2)
		{
			System.out.println("the given numbers are not co-primes");
			
		}
		else
		{
			for(int j=0;j<=b;j++)
			{
				if((b%j==0))
				{
					d=d+1;
				}
			}
			if (d>2)
			{
				System.out.println("the given numbers are not co-primes");
			}
			else
			{
				if(b-a==1)
				{
					System.out.println("the given numbers are co-primes");
				}
			}
		}
	}
}
				