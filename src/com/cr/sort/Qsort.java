package com.cr.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * description: øÏÀŸ≈≈–Ú
 * @author jiaqi
 *
 */
public class Qsort {
	public static void quicksort(int n[], int left, int right) {
		int dp;
		if (left < right) {
			dp = partition(n, left, right);
			quicksort(n, left, dp - 1);
			quicksort(n, dp+1, right);
		}
	}
	
	public static int partition(int n[], int left, int right) {
		int pivot = n[left];
		while (left < right) {
			while (left < right && n[right] >= pivot) {
				right--;
			}
			if (left < right)
				n[left++] = n[right];
			while (left <right && n[left] <= pivot)
				left++;
			if (left < right) 
				n[right--] = n[left];
			
		}
		
		n[left] = pivot;
		return left;
	}
	
	public static void main(String[] args)  {
		
		for (int i = 0;i<args.length;i++)
		System.out.println(args[i]);
		
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		String[] k = str.split(",");
		int[] a = new int[k.length];
		for (int i = 0;i<k.length;i++) {
			a[i] = Integer.parseInt(k[i]);			
		}
		
		quicksort(a, 0, a.length-1);
		for (int i = 0;i<a.length;i++) {
			System.out.print(a[i]);
			System.out.print(",");
		}
	}
	
}
