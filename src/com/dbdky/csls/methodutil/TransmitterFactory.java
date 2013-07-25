package com.dbdky.csls.methodutil;

import java.util.List;

public class TransmitterFactory {
	public static TransmitterFactory getInstance() {
		if (null == instance_) {
			instance_ = new TransmitterFactory();
		}
		
		return instance_;
	}
	
	public Transmitter getTransmitter(String remoteIP, String remotePort) {
		//TODO:
		return defaultTransmitter_;
	}
	
	public Transmitter getTransmitter() {
		//TODO:
		return defaultTransmitter_;
	}
	
	private static TransmitterFactory instance_;
	private Transmitter defaultTransmitter_;
	private List<Transmitter> transmitter_list_;
}