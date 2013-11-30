package com.pattern.bridge;

import java.util.List;

public abstract class QueryCustomerInfoImp {
	private String customerName;
	private int placeFlag;
	
	public QueryCustomerInfoImp(String customerName, int placeFlag) {
		this.customerName = customerName;
		this.placeFlag = placeFlag;
	}
	
	public abstract void printCustomerInfo(List customer);  //�����ӡ�ͻ���Ϣ����
	
	public void doBusinessLogic() { //����ҵ���߼�ʵ������
		IAccessDB access = AccessDBFactory.create(placeFlag);
		List customerInfo = access.queryCustomerInfo(customerName);
		printCustomerInfo(customerInfo);
	}
}
