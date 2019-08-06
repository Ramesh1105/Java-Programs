public class contin
{
	public static void main(String[] args)
	{
		int i=0;
		do
		{
			System.out.println(i);
			i++;
			if(i==5)
			{
			continue;
			}
		}while(i<10);
	}
}