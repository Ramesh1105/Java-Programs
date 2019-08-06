class geometric{
	int l,b;
	float r;
	double h;
	void area(float x)
	{
		r=x;
		System.out.println("area of circle is:"+Math.PI*r*r);
	}
	void area(int x, int y)
	{
		l=x;
		b=y;
		System.out.println("area of rectangle is:"+l*b);
	}
	void area(int x,int y,int z)
	{
		l=x;
		b=y;
		h=z;
		System.out.println("area of triangle is:"+l*b*h);
	
	}
}
class geometricpro{
		public static void main(String[] args)
		{
			geometric ob = new geometric();
			ob.area(4.4f);
			ob.area(9,4);
			ob.area(9,4,7);
		}
}