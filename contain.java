import java.util.Scanner;
class contain{
	public static void main(String[] args)
	{
		System.out.print("enter a sentence buddy:");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.print("now enter wt do u want to check in:");
		boolean str2 = input.nextLine();
		System.out.print(str.contains(str2));//"If it is there true otherwise false u can see:"
	}
	
	// for case sensitive..
}
		/*public class ContainsExample2 {  
    public static void main(String[] args) {  
        String str = "Hello Javatpoint readers";  
        boolean isContains = str.contains("Javatpoint");  
        System.out.println(isContains);  
        // Case Sensitive  
        System.out.println(str.contains("javatpoint")); // false  
    }  
}  */