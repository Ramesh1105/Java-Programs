import java.util.Random;
class random{
	public static void main(String args[])
	{
		Random input = new Random();
		int n = input.nextInt(50);
		n=n+1;
		System.out.println(n);
	}
}
		