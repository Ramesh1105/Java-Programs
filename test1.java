class example
{
	int a;
	void display()
	{
		a=10;
		System.out.println(a);
	}
}

class test1
{
	public static void main(String[] args)
	{
		example ob=new example();
		ob.a=30;
		System.out.println(ob.a);
		example ob2=new example();
		ob2.display();


	}
}