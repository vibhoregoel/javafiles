import java.util.Scanner;
class operation{
	            public static void main(String[] args)
	            {
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter two numbers");
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            int sum = a+b;
	            int sub = a-b;
	            int pro = a*b;
	            float div = a/b;
	            /*int pro = a*b;
	            if(sum>pro)  {
	                         System.out.println("more than");
	                         }
	            else if(sum==pro){
	                             System.out.println("equal to");
	                            }  
	            else{
	            System.out.println("less than");
	            } */
                 System.out.println("Sum of 2 numbers ="+sum);
                 System.out.println("Difference of 2 numbers ="+sub);
                 System.out.println("Product of 2 numbers ="+pro);
                 System.out.println("Division of 2 numbers ="+div);
	            }                        
              }