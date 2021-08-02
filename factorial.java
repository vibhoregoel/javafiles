import java.util.Scanner;
class factorial{
	            public static void main(String[] args)
	            {
	              Scanner sc = new Scanner (System.in);
	              System.out.println("enter the num to find factorial");
	              int x = sc.nextInt();
	              int i, factorial = 1;
	              for(i=1;i<=x;i++){
	                                 factorial = factorial*i;
                                    }
                   System.out.println("Factorial of a number is ="+factorial);                 
	            }
}