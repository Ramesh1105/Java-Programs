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
public class reverse
{
public static void main(String[] args)
{
    int a=523,b,sum=0;
    while(a!=0)
    {
    b=a%10;
    sum=sum*10+b;
    a=a/10;
    
    }
   System.out.println("reverse num is:"+sum);
}
}
