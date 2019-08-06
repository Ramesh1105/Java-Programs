class test{
	int a,b;
	test()
	{
		System.out.println("no parameters:");	//constructor
		a=10;
		b=20;
		System.out.println(a+" "+b);
	}
	test(int x)
	{
		System.out.println("one parameters:");
		a=x;
		b=x;
		System.out.println(a+" "+b);
	}
	test(int x, int y)
	{
		System.out.println("two  parameters:");
		a=x;
		b=y;
		System.out.println(a+" "+b);
	}
}
class testpro{
		public static void main(String[] args)
		{
			test ob1=new test();	
			test ob2=new test(44);
			test ob3=new test(9,4);
		}
}