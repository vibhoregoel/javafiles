import java.util.Scanner;
class Fibonnici{
	public void fibonniciSeries(){
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
    	}
   public static void main(String args[]){
        Fibonnici obj = new Fibonnici();
        obj.fibonniciSeries();
   } 	

}