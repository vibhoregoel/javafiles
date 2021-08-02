import java.util.Scanner;
class opn{
	public static void main(String args[])
	       {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("enter two numbers");
	       int x = sc.nextInt();
	       int y = sc.nextInt();
	       int result;
	       System.out.println("press 1 for addtion");
	       System.out.println("press 2 for subtraction");
	       System.out.println("press 3 for multiplication");
	       System.out.println("press 4 for division");
	       int z = sc.nextInt();
	       switch(z){
	                 case 1: result = x+y; 
	                         System.out.println("Addtion of two numbers is"+result);
                             break;
                         case 2: result = x-y; 
	                         System.out.println("subtraction of two numbers is"+result);
                             break;
                         case 3: result = x*y; 
	                         System.out.println("multiplication of two numbers is"+result);
                             break;
                         case 4: result = x/y; 
                             if(y!=0)
	                         {System.out.println("Division of two numbers is"+result);}
	                         else{System.out.println("cannot divide");}
                             break;                        

	                }

	       }
}