package com.pattern.bridge;

import java.util.List;

public class QueryCustomerInfo extends QueryCustomerInfoImp {

	private final static long max = 100000L; 
	@Override
	public void printCustomerInfo(List customer) {
		// TODO Auto-generated method stub
		//具体实现打印的功能省略
	}
	
	public QueryCustomerInfo(String customerName, int placeFlag) {
		super(customerName, placeFlag);
		
	}
	
	public static void main(String argv[]) {
		String customerName = "小王";
		int placeFlag = AccessDBFactory.PLACE_BEIJING;
		QueryCustomerInfo queryCustomerInfo = new QueryCustomerInfo(customerName, placeFlag);
		queryCustomerInfo.doBusinessLogic(); //调用doBusinessLogic完成逻辑
		
		//完美数的计算
		long sum = 0;
		for (long i = 2; i < max; i++) {
			sum = 0;
			for (long j = 1; j <= i/2; j++) {
				if (i%j==0) {
					sum += j;
					if (sum>i) break;
				}
				
			}
			if (sum==i) {
				System.out.println(sum);
			}
		}
		
	}

}
