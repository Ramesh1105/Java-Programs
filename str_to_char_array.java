import java.util.Scanner;
class strtochara{
	public static void main(String[] args)
	{
		int n,i;
		System.out.print("enter a string:");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		//String st[] = str.split(" "); spilits stringinto words by space...
		char ch[] = str.toCharArray();
		n = ch.length;
		System.out.println("string len is:"+n);
		for (i=0;i<n;i++)
		{
			char c=str.charAt(i);
			System.out.println(c);
		}	
	}
}