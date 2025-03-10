package testCoding;
/*Given a number n, create a matrix (2D array) of size n x n, and fill the matrix with sequential values from 1 to n*n, 
 * starting from the top-left corner and moving in a clockwise direction, spiralling inwards.

eg, given n = 3, the matrix should look like this:

1 2 3
8 9 4
7 6 5

*/

public class RingCentral
{
	public static void main(String args[])
	{
		generateSquare(4);
	}

	public static int[][] generateSquare(int n) 
	{
		int count=1;
		int[][] output = new int[n][n]; //2*2 =4

		int up=0; 
		int down=n-1;
		int left=0;
		int right = n-1;
		 while(count<=n*n) // 0-4
		 {
			 for(int i=left;i<=right;i++) //0->1
			 {
				 output[up][i]=count++; 
			 }
			 up++;
			 for(int i=up;i<=down;i++)
			 {
				 output[i][right]=count++;
			 }
			 right--;
			 if(up<=down) //1<=
			 {
				 for(int i=right;i>=left;i--)
				 {
					 output[down][i]=count++;//2,1 ->

				 }
				 down--;
			 }
			 if(left<=right) //
			 {
				 for(int i=down;i>=up;i--)
				 {
					 output[i][left]=count++;

				 }
				 left++;
			 }
			 
		 }
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 System.out.print(output[i][j]+",");
			 }
			 System.out.println("\n");
		 }
		 

		
		return output;
	}

}
