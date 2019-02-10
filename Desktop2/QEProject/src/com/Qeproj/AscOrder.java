package com.Qeproj;

import java.util.Arrays;
import java.util.Scanner;

public class AscOrder {

	public static void main(String[] args) {

		int num;// num can hold the size of the input 
		Scanner s = new Scanner(System.in);
		System.out.print("How many Number to Enter: ");
		num = s.nextInt();
		int arr[] = new int[num];

		for (int i = 0; i < num; i++) {

			arr[i] = Integer.parseInt(s.next());
			
		}

		System.out.print("Numbers in Ascending Order:");

		 //for(int i = 0; i < arr.length; i++) {
		for (int i = 0; i < num; i++) {
			Arrays.sort(arr);
			System.out.print(" " + arr[i]);
		}


	}
}


//Integer.parseInt(method args)
//String method arguments  ----> an integer object 
//

