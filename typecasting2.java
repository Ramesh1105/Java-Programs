import java.util.Scanner;
class typecasting1
{
	public static void main(String[] args)
	{
		double marks = 44.4;
		int intmarks = (int)marks;
		System.out.println("converting from double to int:"+intmarks);
		int detol = "99.99";
		double ddetol = (double)detol;
		System.out.println("converting from int to double:"+ddetol);
	}
}