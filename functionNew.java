import java.util.Scanner;
public class functionNew{
	public static void sparta(int x, int y)
	{
		int c = x+y;
	System.out.println(c);
	}
	public static void main(String args[])
	{
	 Scanner sc = new Scanner (System.in);
	 System.out.println("enter two values");
	 int x = sc.nextInt();
	 int y = sc.nextInt();
     sparta(x,y);
	}
}