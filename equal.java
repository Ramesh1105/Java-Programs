import java.util.Scanner;
class equal
{
	public static void main(String[] args)
	{
		int n,n1,i,c=0;
		System.out.print("enter a string:");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.print("enter another string:");
		String str1 = input.nextLine();
		char ch[] = str.toCharArray();
		char ch1[] = str1.toCharArray();
		n = ch.length;
		n1 = ch1.length;
		if(n!=n1)
		{
			System.out.print("Strings are not equal");
		}
		else
		{
			for(i=0;i<n;i++)
			{
				if(ch[i]!=ch1[i])
				{
					System.out.print("strings are not equal");
					break;
				}
				else
				{
				c++;
				}
			}
			if (c==n)
			{
				System.out.print("Strings are equal");
			}
		}
	}
}