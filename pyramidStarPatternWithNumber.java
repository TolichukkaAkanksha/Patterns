import java.util.Scanner;
public class Main
{
      public static void main(String[] args) {
      System.out.print("Enter the number of rows you want to print: "); 
      Scanner obj=new Scanner(System.in);
      System.out.println("input your number");
      int num=obj.nextInt();
     
   for(int i=1;i<=num;i++)
   {
       for(int j=(num-i);j>=0;j--)
       {
           System.out.print(" ");
       }
       for(int k=1;k<=i;k++)
       {
           System.out.print(k+" ");
       }
       System.out.println();
   }
       
	}
}
