package com.dbdky.csls.methodutil;

import java.util.List;
import com.dbdky.csls.ConfigCenter;

public class TransmitterFactory {
	public static TransmitterFactory getInstance() {
		if (null == instance_) {
			instance_ = new TransmitterFactory();
		}
		
		return instance_;
	}
	
	public Transmitter getTransmitter(String remoteIP, String remotePort) {
	
		for (Transmitter trans : transmitter_list_) {
			if ((trans.getRemoteIPAsString().equals(remoteIP))
					&& (trans.getRemotePortAsString().equals(remotePort))) {
				return trans;
			}
		}
		return defaultTransmitter_;
	}
	
	public Transmitter getTransmitter() {
		if (null == defaultTransmitter_) {
			defaultTransmitter_ = new Transmitter(ConfigCenter.getInstance().getProxyIP(),
					ConfigCenter.getInstance().getProxyPort());
			defaultTransmitter_.start();
		}
		
		return defaultTransmitter_;
	}
	
	private static TransmitterFactory instance_;
	private Transmitter defaultTransmitter_;
	private List<Transmitter> transmitter_list_;
}