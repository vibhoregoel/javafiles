import java.util.Scanner;
class primeComposite{
	                 public static void main(String[] args)
	                 {
	                  Scanner sc = new Scanner(System.in);
	                  System.out.println("Enter any num to find prime or composite");
	                  int x = sc.nextInt();
	                  if(x==0){System.out.println("neither prime nor composite number");}
	                  else if(x==1){System.out.println("neither prime nor composite number");}
	                  else if(x%1==0 && x%x==0 && x%*!==0){System.out.println("is prime number");}
	                  else{System.out.println("its composite number");}

	                 }
}