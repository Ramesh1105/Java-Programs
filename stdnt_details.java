/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PSPK
 */
public class stdnt_details 
{
    int rno;
    long phno;
    void display()
    {
        System.out.println("student phone number is:"+phno);
        System.out.println("student roll number is:"+rno);
        
    }
    
}
class kal
{
    public static void main(String[] args)
    {
        stdnt_details ob1=new stdnt_details();
        ob1.phno=701321792;
        ob1.rno=36;
        ob1.display();
    }
}
