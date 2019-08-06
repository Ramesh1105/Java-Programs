import java.util.Scanner;
class upperto{
	public static void main(String[] args)
	{
		System.out.print("enter a string:");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		str = str.toUpperCase();
		System.out.print(str);
	}
}