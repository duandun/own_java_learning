package com.cr.sort;

public class ShellSort {
	public static void sort(int a[], int n) {
		int j, gap;
		
		for (gap = n/2; gap > 0; gap /=2) {
			for (j = gap; j < n; j++) {
				if (a[j] < a[j - gap]) {
					int temp = a[j];
					int k = j-gap;
					while (k >= 0 && a[k] > temp) {
						a[k + gap] = a[k];
						k -= gap;
					}
					a[k + gap] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {45,1,2,7,6,18,19,22,11};
		sort(a,a.length);
		for (int i = 0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
	}
}
