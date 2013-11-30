package com.pattern.bridge;

import java.util.List;

public class AccessDBOracle implements IAccessDB {

	public AccessDBOracle() {}
	
	@Override
	public List queryCustomerInfo(String customerName) {
		// TODO Auto-generated method stub
		List customerInfo = null;
		
		//具体查询过程省略
		
		return customerInfo;
	}

}
