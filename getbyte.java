import java.util.Scanner;
class getbyte{
	public static void main(String[] args)
	{
		System.out.print("enter a string:");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		byte b[] = str.getBytes();
		for(int i=0;i<b.length;i++)   //it's printing ascii values
		{
			System.out.println(b[i]);
		}
	}
}