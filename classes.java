class classes2
{
	int a,b,c;
	public void fun()
	{
		c=a+b;
	}
}
public class classes
{
	public static void main(String[] args)
	{
	classes2 obj=new classes2();
	obj.a=4;
	obj.b=5;
	obj.fun();
	System.out.println("a value is "+obj.a);
	System.out.println("b value is "+obj.b);
	System.out.println("c value is "+obj.c);
	}
}
	
	