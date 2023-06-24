package com.dsa.sorting;

public class BubbleSort {
	
	/* Bubble sort works on the repeatedly swapping of adjacent elements until they are not in the intended order 
	 * The average and worst-case complexity of Bubble sort is O(n2), where n is a number of items.
	 *  
	 **/ 
	
	
	public static void main(String...args)
	{
		int [] arr = { 10,5,69,59,45,2};
		
		bubbleSort(arr);
		
		for ( int i =0 ; i< arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void bubbleSort(int[] arr)
	{
		int len = arr.length;
		boolean isSortingRequired=false;
		
		/** the outer loop ensure we have compared all the elements and control the len of the arr **/
		/** the inner loop compare all the elements ,swap them 
		 * and ensure the biggest / smallest element at the end  , so need to consider the same element again **/
		for ( int j=0 ; j< len ; j++ )
		{
			for( int i =1; i< len-j ; i++)
			{
				if ( arr[i] < arr[i-1])
				{
					/** swap the position **/
					
					int t = arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=t; 
					
					isSortingRequired=true;
					
				}
				
			}
			
			if (!isSortingRequired)
			{
				break;
			}
			
			
		}
	}

}