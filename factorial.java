/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PSPK
 */
public class factorial 
{
 public static void main(String[] args)
 {
     int a=10,fac=1,i;
     if(a==0)
     {
         System.out.println("Factorial of given number is:"+1);
     }
     else
     {
      for(i=1;i<=a;i++)
      {
          fac=fac*i;
      }
     }
     System.out.println("Factorial of given number is:"+fac);
     
 }
}
