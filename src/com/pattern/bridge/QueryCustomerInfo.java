package com.pattern.bridge;

import java.util.List;

public class QueryCustomerInfo extends QueryCustomerInfoImp {

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
		
	}

}
