class student1
{
	
	long phonenum;
	int rollnum;
	public void sphonenum()
	{
	System.out.println("Phone num "+phonenum);
	}
	public void srollnum()
	{
	System.out.println("roll nunmber: "+rollnum);
	}
}
public class student
{
	public static void main(String[] args)
	{
	student1 obj=new student1();
	obj.phonenum=493316280;
	obj.rollnum=58;
	obj.sphonenum();
	obj.srollnum();
	}
}
	