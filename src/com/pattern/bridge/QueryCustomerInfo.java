package com.pattern.bridge;

import java.util.List;

public class QueryCustomerInfo extends QueryCustomerInfoImp {

	private final static long max = 100000L; 
	@Override
	public void printCustomerInfo(List customer) {
		// TODO Auto-generated method stub
		//����ʵ�ִ�ӡ�Ĺ���ʡ��
	}
	
	public QueryCustomerInfo(String customerName, int placeFlag) {
		super(customerName, placeFlag);
		
	}
	
	public static void main(String argv[]) {
		String customerName = "С��";
		int placeFlag = AccessDBFactory.PLACE_BEIJING;
		QueryCustomerInfo queryCustomerInfo = new QueryCustomerInfo(customerName, placeFlag);
		queryCustomerInfo.doBusinessLogic(); //����doBusinessLogic����߼�
		
		//�������ļ���
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
