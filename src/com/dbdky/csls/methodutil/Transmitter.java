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
			remoteIP_ = "172.168.1.239";
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
		boolean retVal = false;
		
		try {
			String readline;
			
			os_ = new PrintWriter(socket_.getOutputStream());
			is_ = new BufferedReader(new InputStreamReader(socket_.getInputStream()));
			
			os_.println(str);
			os_.flush();
			
			//readline = is_.readLine();
			
			//int ret = Integer.parseInt(readline);
			
			
			//retVal = (ret == 0) ? true : false;
			
		} catch (Exception e) {
			System.out.println("11Error:" + e);
		} finally {
			os_.close();
			try {
				is_.close();
			} catch (IOException ex) {
			}
		}
		
		
		return retVal;
	}
	
	public String getRemoteIPAsString() {
		return remoteIP_;
	}
	
	public String getRemotePortAsString() {
		String strPort = "" + remotePort_;
		return strPort;
	}
	
	public boolean start() {
		if ((null != socket_) && socket_.isConnected()) {
			return true;
		}
		
		if (null == socket_) {
			try {
				socket_ = new Socket(remoteIP_, remotePort_);
			} catch (Exception e) {
				System.out.println("Can't create socket:" + e);
				return false;
			}
		}
		return true;
	}
	
	public void stop() {
		try {
			os_.close();
			is_.close();
			socket_.close();
		} catch (Exception e) {
			System.out.println("Error:" + e);
		}
	}
	
	private String remoteIP_;
	private int remotePort_;
	
	private Socket socket_;
	private BufferedReader sin_;
	private PrintWriter os_;
	private BufferedReader is_;
	
}