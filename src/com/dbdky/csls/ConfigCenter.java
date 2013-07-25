package com.dbdky.csls;

public class ConfigCenter {
	public static ConfigCenter getInstance() {
		if (null == instance_) {
			instance_ = new ConfigCenter();
		}
		
		return instance_;
	}
	
	private static ConfigCenter instance_;
	
	public void init() {
		//TODO:
	}
	
	public void init(String configFileFullPath) {
		
	}
	
	public String getProxyIP() {
		return proxyIP_;
	}
	
	public String getProxyPort() {
		return proxyPort_;
	}
	
	private void setProxyIP(String ip) {
		proxyIP_ = ip;
	}
	
	private void setProxyPort(String port) {
		proxyPort_ = port;
	}
	
	private String proxyIP_;
	private String proxyPort_;
	
}