package Basics;

public class Operators {
    public static void main(String arug[]) {
    	int a=10,b=20;
    	System.out.println("Arithmetic operation"); 
    	System.out.println(a+b);
    	System.out.println(a-b);
    	System.out.println(a*b);
    	System.out.println(a/b);
    	System.out.println(a%b);
    	   
    	System.out.println("comparison operator");
    	System.out.println(a==b);
    	System.out.println(a!=b);
    	System.out.println(a>b);
    	System.out.println(a<b);
    	System.out.println(a>=b);
    	System.out.println(a<=b);
    	
    	 System.out.println("logical operators");
    	boolean c=true,d=false;
    	System.out.println("and operator    :"   +(c & d));
    	System.out.println("or operators   :"   +(c|d));
    	System.out.println("not operators  :"   + (!c));
  
    	System.out.println("bitwise operators");
    	System.out.println(a&b);
    	System.out.println(a/b);
    	System.out.println(a^b);
    	System.out.println(~a);
    	System.out.println(a<<2);
    	
    	System.out.println("assignment operators");
    	int f=10;
    	f+=5;
    	System.out.println("f+=5="+f);
    	f-=2;
    	System.out.println("f-=2="+f);
    	f*=4;
    	System.out.println("f*=4="+f);
    	f/=3;
    	System.out.println("f/=3="+f);
    	
    System.out.println("unary operators");

    int g=10,h=4;
    System.out.println("+a="+g);
    System.out.println("-b="+h);
    System.out.println("++a="+(++g));
    System.out.println("a++="+(g++));
    System.out.println("--b="+(--h));
    System.out.println("b--="+(h--));
   
    System.out.println("TERNART OPERATORS");
    String j=(a!=b)?"a is bigger than b":"b is bigger than a";
    System.out.println(j);
    		}
    
}
