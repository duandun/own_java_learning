package com.pattern.bridge;

import java.util.List;

public class AccessDBSqlServer implements IAccessDB {

	public AccessDBSqlServer() {}
	
	@Override
	public List queryCustomerInfo(String customerName) {
		List customerInfo = null;
		
		//具体查询过程省略
		 
		return customerInfo;
	}

}
