package Basics;
import java.util.Scanner;
public class Array {
 public static void main(String arug[]) {
	Scanner scan = new Scanner(System.in);
	int[] a=new int[5];	
	
	System.out.println("enter the number :");
	
   for(int i=0;i<=a.length;i++) {
	   a[i]=scan.nextInt();
	   System.out.println(a[i]);
	 }
   //System.out.println(a);
   
//   System.out.println(" //the array elements is :");
//  for(int num : a) {
//	  System.out.println(" the array elements is "+num);
//  }
}
}
    