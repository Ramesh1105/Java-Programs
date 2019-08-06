import java.util.Scanner;
public class switc
{
	public static void main(String[] args)
	{
		System.out.println("enter the values of a,b and c");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		char t,f;
		if (t = true)
		{
			t = 1;
		}
		else:
		{
			f = 0;
		}
		switch((a>b) && (a>c))
		{
			case t:
				System.out.println("a is the greatest number.");
				break;
			case f:
				switch(b>c)
				{
					case t:
						System.out.println("b is the greatest number.");
					case f:
						System.out.println("c is the greatest number.");
				}
		}
	}
}