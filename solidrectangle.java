
public class Main
{
	public static void main(String[] args) {
                System.out.print("Enter the number of rows you want to print: ");
		int row=4;
		int col=5;
		for(int i=1;i<=row;i++)
		{
		    for(int j=0;j<=col;j++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
