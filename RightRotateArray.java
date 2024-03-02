package assignment5;
import java.util.*;
public class RightRotateArray {
        
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int[] nums={2,3,4,6,8};
		System.out.print("enter the rotateCount:");
		int count=scan.nextInt();
		
		for(int i=0;i<count;i++)
		{
			int j,temp;
			
			temp=nums[nums.length-1];
			
			for(j=nums.length-1;j>0;j--)
			{
				nums[j]=nums[j-1];
			}
			nums[0]=temp;
		}
		 
		for(int i:nums)
		{
			System.out.println(i);
		}
	      }
	
}
