import java.util.Scanner;
class  startswith{
	public static void main(String[] args)
	{
		System.out.print("enter a string:");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.print("enter the string or char u want to check:");
		String str1 = input.nextLine();
		boolean st;
		st = str.startsWith(str1);
		System.out.print(st);//it's print's boolean values...
	}
}
		