import java.util.Scanner;
class swap{
	       public static void main(String[] args)
	       {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("first number is");
	        int a = sc.nextInt();
	        System.out.println("second number is");
	        int b = sc.nextInt();
	        a = a-b;
	        b = b+a;
	        a = b-a;


	        System.out.println("first number is"+a);
	        System.out.println("second number is"+b);


	       }
}