import java.util.Scanner;
class charat{
	public static void main(String[] args)
	{
		System.out.println("enter your string buddy:");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.print("enter the index you want to check:");
		int n = input.nextInt();
		char ch = str.charAt(n);
		System.out.println(ch);
	}
}