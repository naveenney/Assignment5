package demo;

public class SpiralMatrix {
  	  public static void spiralMatrix(int[][] arr){

		    int rows = arr.length;
		    int col = arr[0].length;
		 
		  int top=0,bottom =rows - 1,left = 0,right=col-1;
		  
		  int dir=1;
		 
		  while (top <= bottom && left <= right){

		    if (dir==1) {    
		      for (int i = left; i <= right;++i) {
		        System.out.print(arr[top][i]+" ");
		      }
		      ++top;
		      dir=2;
		    } 
		    else if (dir==2) { 
		      for (int i=top;i<= bottom;++i) {
		          System.out.print(arr[i][right]+" ");
		      }
		    
		      --right;
		      dir=3;
		    } 
		    else if(dir==3) {    
		      for (int i=right;i>=left;--i) {
		          System.out.print(arr[bottom][i]+" ");
		      }
		   
		      --bottom;
		      dir = 4;
		    } 
		    else if (dir==4) {     
		      for (int i=bottom;i>=top;--i) {
		          System.out.print(arr[i][left]+" ");
		      }
	
		      ++left;
		      dir=1;
		    }
		  }   
		}



}
