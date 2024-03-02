package demo;
import java.util.Scanner;

public class JaggedArray {
	
	public static void main(String[] args) 
		{
			Scanner scan= new Scanner(System.in);
			int[][]arr;
			System.out.print("Enter the number of persons:");
		        arr=new int[scan.nextInt()][];
	             menu:		
		     do
		     {
		    	 System.out.println("press 1 => Add Nth persons weigth:");
		    	 
		    	 System.out.println("press 2 => Find Min weight of Nth person:");
		    	 
		    	 System.out.println("press 3 => exit");
		    	 
		    	 int n=scan.nextInt();
			     
		    	 switch(n)
				 {
				  
				   case 1->
				   {
					  System.out.print("enter the person to add weight:");
					  int person=scan.nextInt();
					  
					  person-=1;
					  if(person>=0&&person<=arr.length-1)
					  {
						    arr=addWeight(person,arr);
					  }
					  else
						  System.out.println("invalid input");
					          break;
					 
				   }
				   case 2->
				   {
					   System.out.println("enter the person to find minimum weight:");
					   int per=scan.nextInt();
					  System.out.println(minimumWeight(per-1,arr));
				   }
				   case 3->
				   {
					   break menu;
				   }
			      
				   default->
				   {
					   System.out.println("invalid input pls enter the CORRECT INPUT");
				   }
				 };
				 }while(true);
		     
		}
				     public static int[][] addWeight(int per,int[][] arr)
				      {
				       Scanner scan=new Scanner(System.in); 
					  
				       System.out.print("enter the person count of weight:");
					   int num=scan.nextInt();
					
				        	arr[per]=new int[num];
				        	
				       	if(arr[per].length!=0)
				        	{
				        		for(int i=0;i<num;i++)
				        		{
				        			System.out.println("enter the person weight");
				        			arr[per][i]=scan.nextInt();
				        		}
				        	}
				       	return arr;
				      }
				   
				   public static int minimumWeight(int per,int[][] arr)
				   {
					   int m=arr[per][0];
					   if(arr[per].length!=0)
					   {
						   for(int i=1;i<arr[per].length;i++)
						   {
							   m=Math.min(m,arr[per][i]);
						   }
					   
						   return m;
					   }
					   return m;				   
				   }
					  
						   
				 }				   
					   
					   
		


