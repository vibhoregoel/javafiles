class leapyear{
	           public static void main(String[] args)
	           {
	           	int a = 2024;
	           	if(a%400==0 && a%4==0 && a%100!=0)
	           	{
	           		System.out.println("leapyear");
	           	}
	           	else{
	           		System.out.println("not a leapyear");
	           	}
	           }
}