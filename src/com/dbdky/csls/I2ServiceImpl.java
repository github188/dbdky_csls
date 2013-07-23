package com.dbdky.csls;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.dbdky.csls.methodutil.*;

@WebService(endpointInterface = "com.dbdky.csls.I2Service")
public class I2ServiceImpl implements I2Service {
	public String uploadCACHeartbeatInfo(String strXmlParams) {
		//TODO:
		return UploadHeartbeatInfoImpl.transfer(strXmlParams);
	}
	
	public String uploadCACData(String strXmlParams) {
		//TODO:
		return new String("uploadCACData");
	}
	
	public String uploadCACConfig(String strXmlParams) {
		//TODO:
		return new String("uploadCACConfig");
	}
	
	public String downloadCAGCtrl(String strXmlParams) {
		//TODO:
		return new String("downloadCAGCtrl");
	}
	
	public String downloadCACLatestVersion(String strXmlParams) {
		//TODO:
		return new String("downloadCACLatestVersion");
	}
	
	public String downloadCACHistoryVersion(String strXmlParams) {
		//TODO:
		return new String("downloadCACHistoryVersion");
	}
	
	public String downloadCACUpdateFile(String strXmlParams) {
		//TODO:
		return new String("downloadCACUpdateFile");
	}
}