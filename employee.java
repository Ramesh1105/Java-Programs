import java.util.Scanner;
class employeed{
		String name;
		double saary;
		String department;
		String id;
		void output()
		{
			System.out.print(name);
		}
		void input()
		{
			Scanner input = new Scanner(System.in);
			String name = input.nextLine();
		}	
}
class employee{
	public static void main()
	{
		employeed e1 = new employeed();
		e1.input();
		e1.output();
	}
}
		