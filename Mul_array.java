import java.util.Scanner;
class Mul_array
{
	public static void main(String args[])
	{
        int a[][] = {{2,3,4},{4,6,3},{3,2,2}};
        int b[][] = {{3,4,2},{5,2,3},{6,8,1}};
        int c[][] = new int[3][3]; 
        // creating another matrix to store mul of two matrix of 3 row ,3 col

 		//Scanner a =
 		for (int i=0;i<3;i++){
 			for (int j=0;j<3;j++){
 				c[i][j]=0;
 				for(int k=0;k<3;k++){
 					c[i][j] = a[i][k] * b[k][j];

 				}
 				System.out.print(c[i][j]+" ");//printing matrix elements
 			}
 			System.out.println();//new line
 		} 

	}
}