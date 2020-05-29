// program to calculate the maturity value of a bank deposit based on the option the user enters

import java.util.Scanner;

public class BankDeposit
{
    public static void main(String args[])
    {
        Scanner a= new Scanner(System.in);
        
        System.out.println("please enter your choice");
        System.out.println("enter 1 for term deposit");
        System.out.println("enter 2 for Reccuring deposit");
        int x=a.nextInt();
        
        switch(x)
        {
            case 1:
            System.out.println("enter principle");
            float p=a.nextFloat();
            System.out.println("enter rate of interest");
            float r= a.nextInt();
            System.out.println("enter the number of years");
            float n=a.nextFloat();
            double amount=p* Math.pow(((100+r)/100),n);
            System.out.println("The maturity value is "+ amount);
            break;
            
            case 2:
            System.out.println("enter the amount monthly installments");
            int m=a.nextInt();
            System.out.println("enter the rate of Interest");
            int R=a.nextInt();
            System.out.println("enter the time period in months");
            int N=a.nextInt();
            double AMOUNT=((m*N) + (m*N*(N+1)*R))/(2*100*12);
            System.out.println("the maturity value is " + AMOUNT);
            break;
            
            default:
            System.out.println("Error");
        }
    }
}