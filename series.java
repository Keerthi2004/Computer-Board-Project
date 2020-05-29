/*9.	Write a program to calculate and print the sum of each of the following series:
  (a)	Sum = 2-4+6-8+10……-20
  (b)	Sum = x/2 + x/5 + x/8 + x/11 + …..+ x/20   (x to be input by user) */
import java.util.Scanner;
public class series
{
    public static void main(String args[])
    {
         Scanner a= new Scanner(System.in);
         
         int sum=2-4+6-8+10-12+14_16+18-20;
         System.out.println("The answer for series one is"+sum);
         
         System.out.println("Enter the value of 'x' for the second series");
         int x=a.nextInt();
         int sum2=x/2+x/5+x/8+x/11+x/14+x/17+x/20;
         System.out.println("The answer for series2 is"+sum2);
        }
    }