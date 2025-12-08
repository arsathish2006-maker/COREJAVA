package Basics;
import java.util.Scanner;
public class Sathees {
	int b=10;
	static int c=30;
  public static void main(String args[]) {
	
	  System.out .println("hello world");
       int a=10;
       System.out.println("local variable:"+a);//local variable
       Sathees obj=new Sathees();
       System.out.println("instance variable:"+obj.b);//instance variable
       System.out .println("static variable"+c);//Static variable 
       Scanner scan = new Scanner(System.in);
       
       System.out.println("enter the name :");
       String name = scan.nextLine();
      System.out.println("the name is :"+name );
      
       System.out.println("enter the name :");
       char letter=scan.next().charAt(3);
       System.out.println("the  starting letter is "+letter);
       
      System.out.println("enter the age ");
       int age = scan.nextInt();
       System.out.println("the age is "+age);
       
       
      
      System.out.println("enter the double number ");
      double v = Double.parseDouble(scan.nextLine());
      System.out.println("the double number is "+v);
      
      System.out.println("enter the float number ");
      float x= Float.parseFloat(scan.nextLine());
      System.out.println("the float number is "+x);
       
  }
  }


