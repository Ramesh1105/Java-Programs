import java.util.Scanner;
class array1
{
	public static void main(String args[])
	{
		System.out.println("enter the size of array");
		Scanner ob=new Scanner(System.in);
		int n = ob.nextInt();
		int a[]= new int[n];
		int i;
		System.out.println("enter the array elements:");
		Scanner input = new Scanner(System.in);
		for(i=0;i<n;i++)
		{
			 a[i] = input.nextInt();
		}
		System.out.println("entered array elements:");
		for(i=0;i<n;i++)
		{
			System.out.println("a["+i+"]"+"="+a[i]);
		}
	}
}