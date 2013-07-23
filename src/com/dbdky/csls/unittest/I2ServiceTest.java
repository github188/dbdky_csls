package com.dbdky.csls.unittest;

import com.dbdky.csls.I2ServiceC.*;

public class I2ServiceTest {
	public static void main(String[] args) {
		I2ServiceImplService service = new I2ServiceImplService();
		
		I2Service eif = service.getI2ServiceImplPort();
		
		System.out.println(eif.uploadCACData("hello"));
		
	}
}