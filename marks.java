import java.util.Scanner;
public class marks {
	public static void main(String[] args) {
    	int w,x,y,z;
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter the marks in python-");
    	w=sc.nextInt();

    	System.out.println("Enter the marks in c programming-");
    	x=sc.nextInt();
    	
    	System.out.println("Enter the marks in Mathematics-");
    	y=sc.nextInt();

    	System.out.println("Enter the marks in Physics-");
    	z=sc.nextInt();
    	
    	float a=w+x+y+z;
    	System.out.println("Total="+a);
    	float b=a/4;
    	System.out.println("Aggregate="+b);
    	
    	if(b>=75)
    	{
    		System.out.println("DISTINCTION");
    	}
    	else if(b>=60 && b<75)
    	{
    		System.out.println("FIRST DIVISION");
    	}
    	else if(b>=50 && b<60)
    	{
    		System.out.println("SECOND DIVISION");
    	}
    	else if(b>=40 && b<50)
    	{
    		System.out.println("THIRD DIVISION");
    	}
    	else
    	{
    		System.out.println("FAIL");	
    	}


	}}