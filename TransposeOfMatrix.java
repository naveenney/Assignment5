package assignment5;
import java.util.Scanner;
public class TransposeOfMatrix {
     public static void main(String[] args)
     {
     Scanner scan=new Scanner(System.in);
     
     System.out.print("enter the row size:");
     int r1=scan.nextInt();
     
     System.out.print("enter the column size:");
     int c1=scan.nextInt();
     
     int[][] nums=new int[r1][c1];
     System.out.print("enter the number:");
     for(int i=0;i<r1;i++)
     {
    	 for(int j=0;j<c1;j++)
    	 {
    		 nums[i][j]=scan.nextInt();
    	 }
     }
     
	 int a=nums.length;
	  int b=nums[0].length;
	  int arr[][]=new int[b][a];
	  
	  for(int i=0;i<b;i++)
	  {
		  for(int j=0;j<a;j++)
		  {
			  arr[i][j]=nums[j][i];
		  }
		  
	  }
	  
	  for(int[] i:arr)
	  {
		  for(int j:i)
			  System.out.print(j+" ");
		  
		  System.out.println("");
	  }
 }  
 
}

