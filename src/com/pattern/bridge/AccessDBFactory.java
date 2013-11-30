package com.pattern.bridge;

public class AccessDBFactory {

	public AccessDBFactory() {}
	public final static int PLACE_BEIJING = 1;
	public final static int PLACE_SHANGHAI = 2;
	
	public static IAccessDB create(int placeflag) {
		IAccessDB accessdb = null;
		switch(placeflag) {
		case PLACE_BEIJING:
			accessdb = new AccessDBOracle();
			break;
		case PLACE_SHANGHAI:
			accessdb = new AccessDBSqlServer();
			break;
		}
		
		return accessdb;
	}
	
}
