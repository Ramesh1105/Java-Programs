import java.util.Scanner;
class sreverse{
	public static void main(String[] args)
	{
		System.out.print("enter a strig:");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		char a[] = str.toCharArray();
		int i,n;
		n = a.length;
		for(i=n-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
	}
} 