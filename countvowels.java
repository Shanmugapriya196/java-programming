import java.io.*;
import java.util.*;
class countvowels
{
public static void main(String arg[])
{
String str="Saveetha school of engineering";
str=str.toLowerCase();
int i,v=0;
for(i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{
v++;
}
}
System.out.print(v);
}}