import java.util.*;
class bonus
{
public static void main(String args[])
{
int sal;
char grade;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the grade of the employee: ");
grade= sc.next().charAt(0);
System.out.println("Enter the salary of the employee: ");
sal=sc.nextInt();
double b;
if(grade=='A')
{
b=(sal/100)*5;
if(sal<10000)
{
b=(sal/100)*7;
}
System.out.println("Bonus= "+b);
sal+=b;
System.out.println("Salary= "+sal);
}
else if(grade=='B')
{
b=(sal/100)*10;
if(sal<10000)
{
b=(sal/100)*12;
}
System.out.println("Bonus= "+b);
sal+=b;
System.out.println("Salary= "+sal);
}
}
}
