import java.util.Scanner;
class replace{
	public static void main(String[] args)
	{
		System.out.print("enter a string:");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.print("enter the string u want to replace:");
		String str2 = input.nextLine();
		System.out.print("enter the new string to replace:");
		String str3 = input.nextLine();
		str = str.replace(str2,str3);
		System.out.print(str);
	}
}