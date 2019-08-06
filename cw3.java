/*class test{
	int a ;
	void display()
	{
		System.out.println(a);
	}
}
class testpro{
	public static void main(String args[])
	{
		test ob1 = new test();
		ob1.a=10;
		test ob2 = new test();
		ob1.display();
		ob2.display(); //without mentioning the value of ob.2. gives the valueof "0".
		ob2.a=20;
		ob1.display();
		ob2.display();
	}
}
class test{
	int a ;
	void display()
	{
		System.out.println(a);
	}
}
class testpro{
	public static void main(String args[])
	{
		test ob1 = new test();
		ob1.a=10;
		test ob2 = ob1;
		ob1.display();
		ob2.display(); //without mentioning the value of ob.2. gives the valueof "0".
		ob2.a=20;
		ob1.display();
		ob2.display();
	}
}*/
class test{
	int a ;
	void display()
	{
		System.out.println(a);
	}
}
class testpro{
	public static void main(String args[])
	{
		test ob1 = new test();
		ob1.a=10;
		test ob2 = ob1;
		ob1.display();
		ob2.display(); //without mentioning the value of ob.2. gives the valueof "0".
		ob2.a=20;
		ob1=null;
		ob1.display();
		ob2.display();
	}
}