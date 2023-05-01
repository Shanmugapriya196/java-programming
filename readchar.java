import java.util.Scanner;
public class readchar{
	public static void main(String[] args) {
    	char c='@';
    	
    	int i=0,j=0,k=0;
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter * to exit...");
    	
    	while(c!='*')
    	{
    		System.out.println("Enter any character-");
    		c=sc.next().charAt(0);
        
    		if(c >= 'a' && c <= 'z')
    	    {
    	    	i=i+1;
    	    }
    		else if(c >= 'A' && c <= 'Z')
    		{
    			k=k+1;
    		}
    	    else if(c>=0 && c<=9)
    	    {
    	    	j=j+1;
    	    }
    	}
    	System.out.println("Total count of lower case-"+i);
    	System.out.println("Total count of upper case-"+k);
    	System.out.println("Total count of numbers-"+j);



	}}