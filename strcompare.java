import java.util.Scanner;
class compareto{
	public static void main(String[] args)
	{
		System.out.print("enter your 1st string:");
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		System.out.print("enter your 2nd string:");
		String str2 = input.nextLine();
		System.out.println(str1.compareTo(str2));// it will return the difference b/w those char buddy
	}
}
		