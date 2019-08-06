class test
{
	test()
	{
	System.out.print("constructor");
	}
	void display()
	{
	System.out.print("hello");
	}
	void print()
	{
	System.out.print("hi");
	}
}
class testpro
{
public static void main(String[] args)
{
test ob = new test();
ob.print();
test ob1 = new test();
ob.display();
}
}