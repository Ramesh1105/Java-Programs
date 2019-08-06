import java.util.Scanner;
class concate
{
	public static void main(String[] args)
	{
		System.out.print("enter your string buddy:");
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		System.out.print("enter another string to concate buddy:");
		String str2 = input.nextLine();
		str1 = str1.concat(str2);
		System.out.print("Successfully concated:"+str1);
	}
}