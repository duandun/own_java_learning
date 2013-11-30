package com.pattern.bridge;

import java.util.List;

public abstract class QueryCustomerInfoImp {
	private String customerName;
	private int placeFlag;
	
	public QueryCustomerInfoImp(String customerName, int placeFlag) {
		this.customerName = customerName;
		this.placeFlag = placeFlag;
	}
	
	public abstract void printCustomerInfo(List customer);  //定义打印客户信息方法
	
	public void doBusinessLogic() { //处理业务逻辑实现需求
		IAccessDB access = AccessDBFactory.create(placeFlag);
		List customerInfo = access.queryCustomerInfo(customerName);
		printCustomerInfo(customerInfo);
	}
}
