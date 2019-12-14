package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
	private static Scanner sc= new Scanner(System.in);
	public static int[] readIntegers(int count){
		System.out.println("Enter the "+count+"values for array");
		int [] arr= new int[count];
		
			
			for(int i =0;i<count;i++){
				
				arr[i]= sc.nextInt();
			}
		
		System.out.println(Arrays.toString(arr));
		return arr;
		
		
	}
	
	private static int findMin(int[] arr){
		int temp=0;
		boolean flag= true;
			for(int i=0;i<arr.length-1;i++){
				
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
		
		
		}
		System.out.println(Arrays.toString(arr));
		return temp;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the index no. of array: ");
		if(sc.hasNextInt()){
			int[] arr=readIntegers(sc.nextInt());		
			System.out.println("Min value of arr is: "+findMin(arr));
		}
		sc.close();
	}

}
