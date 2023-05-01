import java.util.Scanner;
public class Medium9 {
	public static void main(String[] args) {
    	float w=0,y=0,z=0;
    	float i=0,j=0;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter -1 to exit...");
    	while(w!=(-1))
    	{
    		System.out.println("Enter the number-");
    	    w=sc.nextInt();
    	    if(w>0)
    	    {
    	    	i=i+1;
    	    	y=y+w;
    	    }
    	    else
    	    {
    	    	j=j+1;
    	    	z=z+w;
    	    }
    	}
    	System.out.println("The average of negative numbers is-"+(z/j));
    	System.out.println("The average of positive numbers is-"+(y/i));



	}}