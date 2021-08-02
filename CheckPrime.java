import java.util.Scanner;
class CheckPrime{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number to check if it is prime num or not");
	int n = sc.nextInt();
	int x = 0;
	for(int i=2; i<n; i++){
	    if(n%i==0){
	    	x = 1;
	    	break;
	    }
	   }
	if(n ==1)
	   System.out.println(n+"nither prime nor composite");
	else{
		if(x == 1)
			System.out.println(n+" Is not a prime number");
		else
			System.out.println(n+" Is a prime number");
       }
	}
}