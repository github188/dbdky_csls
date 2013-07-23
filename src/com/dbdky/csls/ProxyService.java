package com.dbdky.csls;

public class ProxyService {
	private static boolean is_init; 
	{
		is_init = false;
	}
	
	public static boolean init() {
		if (is_init) {
			return true;
		}
		//TODO:
		return true;
	}
}