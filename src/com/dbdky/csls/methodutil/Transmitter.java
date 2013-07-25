package com.dbdky.csls.methodutil;

import java.io.*;
import java.net.*;

public class Transmitter {
	public Transmitter(String remoteIP, String remotePort) {
		setRemoteIP(remoteIP);
		setRemotePort(remotePort);
	}
	
	public boolean transmit(String remoteIP,
			String remotePort,
			String str) {
		//TODO:
		return true;
	}
	
	private void setRemoteIP(String remoteIP) {
		if (remoteIP.length() < 8) {
			// 0.0.0.0
			remoteIP_ = "127.0.0.1";
		}
		else {
			remoteIP_ = remoteIP;
		}
	}
	
	private void setRemotePort(String remotePort) {
		if (remotePort.length() == 0) {
			remotePort_ = 9527; // :)
		}
		else {
			remotePort_ = Integer.parseInt(remotePort);
		}
	}
	
	public boolean transmit(String str) {
		//TODO:
		return true;
	}
	
	private String remoteIP_;
	private int remotePort_;
	
	private Socket socket_;
}