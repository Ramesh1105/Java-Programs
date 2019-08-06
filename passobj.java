 
class Objpass 
{ 
	int a, b; 

	Objpass(int i, int j) 
	{ 
		a = i; 
		b = j; 
	} 
	boolean equalTo(Objpass o) 
	{ 
		return (o.a == a && o.b == b); 
	} 
} 
class test 
{ 
	public static void main(String args[]) 
	{ 
		Objpass ob1 = new Objpass(100, 22); 
		Objpass ob2 = new Objpass(100, 22); 
		Objpass ob3 = new Objpass(-1, -1); 

		System.out.println("ob1 == ob2: " + ob1.equalTo(ob2)); 
		System.out.println("ob1 == ob3: " + ob1.equalTo(ob3)); 
	} 
} 
