import java.io.*;
class add
{
public static void main(String args[])throws IOException

{
int a,b,sum;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the first number");
a=Integer.parseInt(br.readLine());
System.out.println("enter the second number");
b=Integer.parseInt(br.readLine());
sum=a+b;
System.out.println("addition is ="+sum);

}
}