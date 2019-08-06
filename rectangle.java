class rectangle1
{
	int l,b;
	public void area()
	{
	System.out.println("Area is "+l*b);
	}
	public void perimeter()
	{
	System.out.println("perimeter is "+2*(l+b));
	}
}
public class rectangle
{
	public static void main(String[] args)
	{
	rectangle1 obj=new rectangle1();
	obj.l=4;
	obj.b=5;
	obj.area();
	obj.perimeter();
	}
}
	