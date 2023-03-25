import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      System.out.println("input your number");
      int num=obj.nextInt();
      System.out.println("Downward triangle star pattern");
     for(int i=num;i>=0;i--)
     {
         for(int j=1;j<=i;j++)
         {
             System.out.print("* ");
         }
         System.out.println();
     }
       
	}
}
