class cmd1
{
public static void main(String args[])
{
	int n=args.length;
	System.out.println("length of array is: "+n);
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);
	int sum=a+b+c;
	System.out.println("sum "+sum);
}
}