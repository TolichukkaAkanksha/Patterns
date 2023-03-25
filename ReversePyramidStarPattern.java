import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	System.out.println("Reverse Pyramid Star Pattern");
    System.out.print("Enter the number of rows you want to print: ");  
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    for(int i=num;i>=0;i--)
    {
        for(int j=(num-i);j>=0;j--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    
       
	}
}
