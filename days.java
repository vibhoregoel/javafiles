import java.util.Scanner;
class days{
	       public static void main(String args[])
	       {
	       	Scanner sc = new Scanner (System.in);
	       	System.out.println("enter value betweenone to seven");
	       	int x = sc.nextInt();
	       /*	if(x==1){System.out.println("Monday");}
	       	else if(x==2){System.out.println("Tuesday");}
	       	else if(x==3){System.out.println("Wednesday");}
	       	else if(x==4){System.out.println("Thrusday");}
	       	else if(x==5){System.out.println("Friday");}
	       	else if(x==6){System.out.println("Satuday");}
	       	else{System.out.println("Sunday");}*/
	       	switch(x){
	       		      case 1: System.out.println("monday");
	       		      break;
	       		      case 2: System.out.println("tuesday");
	       		      break;
	       		      case 3: System.out.println("wednesday");
	       		      break;
	       		      case 4: System.out.println("thrusday");
	       		      break;
	       		      case 5: System.out.println("friday");
	       		      break;
	       		      case 6: System.out.println("saturday");
	       		      break;
	       		      case 7: System.out.println("sunday");
	       	}
	       }
}