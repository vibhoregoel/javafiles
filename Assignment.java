import java.util.Scanner;
class Assignment{
    public void pallindromeCheck(){
           Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to find pallindrome or not");
	int n = sc.nextInt();
	int rem, sums, org;
	org = n;
	sums = 0;
	while(n>0){
	           rem = n%10;
	           sums = (sums*10)+rem;
	           n = n/10;
              }
        
    if(sums == org)
    System.out.println(org+" is pallindrome number");
    else
    System.out.println(org+" is not a pallindrome number");  
    }

    public void patternPrint(){
           Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number from which decreasing pattern to be print");
       int n = sc.nextInt();
       for(int i=1; i<=n; i++){
          for(int j=n; j>=i; j--){
             System.out.print("*");
          }
         System.out.println(); 
       }
    }

    public void checkPrime(){
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



    public void fibonaciSeries(){
    	int a, b, c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of terms upto which you want to print series excluding first two terms");
	int n = sc.nextInt();
	a=0;
	b=1;
	System.out.print(a+", "+b+", ");
	for(int i=2; i<=n; i++){
	            c = a+b;
	            a = b;
	            b = c;
	            System.out.print(c+", ");
              }
         System.out.println();     

    }


	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	Assignment obj = new Assignment();
	int option;
	do{
	   System.out.println("Press 1 to check for palindrome number");
	   System.out.println("Press 2 to prints the pattern of stars in decreasing order based on the input");
	   System.out.println("Press 3 to check whether the input number is a prime number");
	   System.out.println("Press 4 print Fibonacci series of size n with first two numbers as 0, 1");
       
       option = sc.nextInt();
       switch(option) {
       	               case 0: option = 0;
                      break;
                      case 1: {obj.pallindromeCheck();}
                      break;
                      case 2: {obj.patternPrint();}
                      break;
                      case 3: {obj.checkPrime();}
                      break;
                      case 4: {obj.fibonaciSeries();}
                      break;
                      default: System.out.println("enter valid number");
                      }

       } while(option!=0);
    System.out.println("Exit from program successfully");
	}
}