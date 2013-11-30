package com.pattern.bridge;

import java.util.List;

public class QueryCustomerInfo extends QueryCustomerInfoImp {

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
		
	}

}
