import java.util.Scanner;
class Pattern{
   public static void main(String args[]){
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
	
}