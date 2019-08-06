import java.util.Scanner;
class equalcaseigno{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter a string");
		String str = input.nextLine();
		System.out.print("enter another string:");
		String str1 = input.nextLine();
		System.out.print(str.equalsIgnoreCase(str1));//it's generate boolean values
	}
}