class multiArray{
	public static void main(String args[])
	{
	int x = 1;
	int [][] a = new int [3][4];
	for (int i =0; i<3; i++)
	                        {
                             for(int j = 0; j<4; j++)
                             { 
                              a[i][j] = x;
                              x++;
                              System.out.print(a[i][j]+"  ");
                             }
                             System.out.println();
	                        }


	}
}