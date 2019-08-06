class student
{
	int rno;
	String s1;
	void read()
	{
		rno=58;
		s1="Super Star";
	}
	void display()
	{
		System.out.println("rno:"+rno+"name:"+s1);
	}
}
class text
{
	public static void main(String[] args)
	{
		
		student ob2=new student();
		ob2.rno=2;
		ob2.s1="Ramesh";
		ob2.display();
		student s1=new student();
		s1.read();
		s1.display();
		
	}
}
		