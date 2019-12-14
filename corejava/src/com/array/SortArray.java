package com.array;

import java.util.Arrays;

public class SortArray {
	
	public static void main (String args[]){
		//int [] arr = {10,11,31,58,45};
		
		int []array= new int[5];
		int []array2= new int[5];
		array2[1]=2;
		
			System.out.println(Arrays.toString(array));
			System.out.println(Arrays.toString(array2));
	
		
		/*int temp=0;
		boolean flag=true;
		while(flag){
			flag=false;
		for(int i=0;i<arr.length-1;i++){
			System.out.println("hi");
			if(arr[i]<arr[i+1]){
				temp= arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				flag=true;
			}
			
		}
		for(int i=0;i<arr.length;i++){
		System.out.println("sorted arr= "+arr[i]);
		}
	}
*/}
}