class arrayAdd{
	public static void main(String args[])
	{
	int [] a = new int [5];
	int [] b = new int [5];
	int [] c = new int [5];
	/*a[0] = 2;
	a[1] = 3;
	a[2] = 1;
	a[3] = 5;
	a[4] = 6;
	b[0] = 1;
	b[1] = 0;
	b[2] = 2;
	b[3] = 6;
	b[4] = 1;
	for(int i=0; i<5; i++){
		               c[i] = a[i] + b[i];
		               System.out.println(c[i]);*/
    System.out.print("elements of first array is  ");
    for(int i =0;i<5;i++){
    	                  a[i] = i+1;
    	                  System.out.print(a[i]+"a ");

                         }	
    System.out.println();
    System.out.print("elements of second array is  "); 
    for (int i =0;i<5;i++) {int x =2;
    	                   b[i] = x+i;
    	                   System.out.print(b[i]+"a ");
                           }   
    System.out.println();
    System.out.print("Sum of two array is  ");
    for (int i =0;i<5;i++) {
    	                   c[i] = a[i] + b[i];
    	                   System.out.print(c[i]+" a");
    	                   } 
	}
	
	}
