import java.util.Scanner;

class revandaddpal 
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = input.nextInt();
int rev = 0;
int temp = num;
while (true) 
{
while (temp != 0) 
{
int digit = temp % 10;
rev = rev * 10 + digit;
temp /= 10;
}

if (num == rev) 
{
System.out.println(num + " is already a palindrome.");
break;
}
int sum = num + rev;
System.out.println(num + " + " + rev + " = " + sum);
temp = sum;
num = sum;
rev = 0;
        
}
}
}