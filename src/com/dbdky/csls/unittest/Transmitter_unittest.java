package com.dbdky.csls.unittest;

import com.dbdky.csls.methodutil.*;

public class Transmitter_unittest {
	public static void main(String[] args) {
		String str = "<?xml version=\"1.0\" encoding=\"utf-8\"?> \n <request></request>";
		
		if (TransmitterFactory.getInstance().getTransmitter().transmit(str)) {
			System.out.println("OK");
		}
		else {
			System.out.println("BAD");
		}
	}
}