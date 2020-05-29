//program to print floyd's right angled triangle using natural numbers
//int n represent the number of rows entered by the user
import java.util.Scanner;
public class FloyidsTriangle 
{
   public static void main(String args[])
   {
      int n,i,j,k = 1;
      System.out.println("Enter the number of lines you need in the FloyidsTriangle");
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();

      for(i = 1; i <= n; i++) 
      {
         for(j=1;j <= i; j++)
         {
            System.out.print(" "+k++);
         }
         System.out.println();
      }
   }
}