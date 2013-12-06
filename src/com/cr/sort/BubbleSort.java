package com.cr.sort;

public class BubbleSort {

	/**
	 * @param args
	 */
	
	public static void bubble(int[] array, int front, int end) {
		for(int i = 0; i < end; i++) {
			for (int j = i; j<end-1;j++) {
				if (array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,1,5,2,10,7,6,45,21,16};
		bubble(a, 0, a.length);
		
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
	}

}
