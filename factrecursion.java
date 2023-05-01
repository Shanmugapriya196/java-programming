import java.util.Scanner;
public class Medium11 {

	static int fact(int num)
	{
		if (num==1)
		{
			return 1;
		}
		else
		{
			return(num*fact(num-1));
		}
	}

	public static void main(String[] args) {
    	int i,j;
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a number-");
    	i=sc.nextInt();
    	j=fact(i);
    	System.out.println("Factorial of "+i+" = "+j);
    	

    	
}}