public class Pattern2
{
    public static void main(String args[])
    {
    int k = 5;
    for(int i=5;i>=0;i--)
    {
      k=5;
      for(int j=i;j>=0;j--)
      {
       System.out.print(k+" ");
       k--;
      }
       System.out.println();
    }
  }
}