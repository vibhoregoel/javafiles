import java.util.Scanner;
public class PrimeNum
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number upto which you have to find prime numbers");
	int n = sc.nextInt();
	System.out.println("Total prime numbers between 1 and "+n+" are");
	for(int i =n; i>1; i--)
	{
	for(int j =2; j<n; j++)
	{
	if(i%j==0 && i!=j)
	break;
	else if(i%j!=0)
	continue;
	else
	System.out.print(i+" ");
	}
	}
	}
}


/*
class school{
	public static void main(String args[]){
		school std = new school();
		System.out.print(std);
	}
}*/