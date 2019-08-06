import java.util.Scanner;
class scanning
{
	public static void main(String args[])
	{
		int a;
		float b;
		double c;
		char d;
		System.out.println("enter the value of a :");
		Scanner ob = new Scanner(System.in);
		System.out.println("enter a integer:");
		a=ob.nextInt();
		System.out.println("enter a float:");
		b=ob.nextFloat();
		System.out.println("enter a double:");
		c=ob.nextDouble();
		System.out.println("enter a character or string:");
		d=ob.nextChar();
		System.out.println("integer a value is:"+a);
		System.out.println("float b value is:"+b);
		System.out.println("double d value is:"+c);
		System.out.println("your string is:"+d);
	}
}
		