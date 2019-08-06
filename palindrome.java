/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc_dec;

/**
 *
 * @author PSPK
 */
public class palindrome 
{
    public static void main(String[] args)
{
    int a=1001,b,sum=0,rev=0;
    rev=a;
    while(a!=0)
    {
    b=a%10;
    sum=sum*10+b;
    a=a/10;
    
    }
    if(sum==rev)
    {
        System.out.println("Given number is palindrome");
        
    }
    else
    {
        System.out.println("Given numbber is not palindrome");
    }

   System.out.println("reverse num is:"+sum);
}
}

   
