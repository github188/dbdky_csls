package com.dbdky.csls;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface I2Service {
	@WebMethod String uploadCACHeartbeatInfo(String strXmlParams);
	@WebMethod String uploadCACData(String strXmlParams);
	@WebMethod String uploadCACConfig(String strXmlParams);
	@WebMethod String downloadCAGCtrl(String strXmlParams);
	@WebMethod String downloadCACLatestVersion(String strXmlParams);
	@WebMethod String downloadCACHistoryVersion(String strXmlParams);
	@WebMethod String downloadCACUpdateFile(String strXmlParams);
}