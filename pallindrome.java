//Check if given number is pallindrome


import java.util.Scanner;
class pallindrome{
	public static void main(String args[]){
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
     //System.out.println(sums);         
    if(sums == org)
    System.out.println(org+" is pallindrome number");
    else
    System.out.println(org+" is not a pallindrome number");  

	}
}

