package com.dbdky.csls;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.dbdky.csls.methodutil.*;

@WebService(endpointInterface = "com.dbdky.csls.I2Service")
public class I2ServiceImpl implements I2Service {
	public String uploadCACHeartbeatInfo(String strXmlParams) {
		return UploadHeartbeatInfoImpl.transfer(strXmlParams);
	}
	
	public String uploadCACData(String strXmlParams) {
		return UploadCACDataImpl.transfer(strXmlParams);
	}
	
	public String uploadCACConfig(String strXmlParams) {
		return UploadCACConfigImpl.transfer(strXmlParams);
	}
	
	public String downloadCAGCtrl(String strXmlParams) {
		return DownloadCAGCtrlImpl.transfer(strXmlParams);
	}
	
	public String downloadCACLatestVersion(String strXmlParams) {
		return DownloadCACLatestVersionImpl.transfer(strXmlParams);
	}
	
	public String downloadCACHistoryVersion(String strXmlParams) {
		return DownloadCACHistoryVersionImpl.transfer(strXmlParams);
	}
	
	public String downloadCACUpdateFile(String strXmlParams) {
		return DownloadCACUpdateFileImpl.transfer(strXmlParams);
	}
}