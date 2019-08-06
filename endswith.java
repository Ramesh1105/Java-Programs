import java.util.Scanner;
class endswith{
	public static void main(String[] args)
	{
		System.out.print("enter a string:");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.print("enter the char or string you want to check:");
		String str2 = input.nextLine();
		System.out.print(str.endsWith(str2));
		// produce only true or false and case sensitive...
	}
}