import java.util.Scanner;
class table
{
public static void main(String args[])
{
	int i;
	Scanner input = new Scanner(System.in);
	System.out.println("enter a value buddy:");
	int a = input.nextInt();
	for (i=1;i<=10;i++)
	{
		System.out.println(a+" X "+ i + " = " + a*i);	
	}
}
}