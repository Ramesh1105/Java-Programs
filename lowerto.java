import java.util.Scanner;
class lowerto{
	public static void main(String[] args)
	{
		System.out.print("enter a string:");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		str = str.toLowerCase();
		System.out.print(str);
	}
}