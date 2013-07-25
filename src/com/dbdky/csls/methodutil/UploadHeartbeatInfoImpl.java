package com.dbdky.csls.methodutil;

import com.dbdky.csls.methodutil.ProxyMsgProto.ProxyMsg;
import com.dbdky.csls.methodutil.ProxyMsgProto.ProxyMsg.MSGTYPE;

public class UploadHeartbeatInfoImpl {
	private static final String requestSchemaFileName = "uploadCACHeartbeatInfo_request.xsd";
	private static final String responseSchemaFileName = "uploadCACHeartbeatInfo_response.xsd";
	private static final String responseHeaderStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> \n <response> \n";
	private static final String responseTailStr = "</response>";
	
	public static String transfer(String strXmlParams) {
		String requestSchemaPath = System.getProperty("user.dir") + "/" + requestSchemaFileName;
		
		if (!XMLValidator.validateXmlStrWithSchemaFile(requestSchemaPath, strXmlParams)) {
			return I2ServiceError.E_XML_INVALID;
		}
	
		ProxyMsg.Builder proxymsg = ProxyMsg.newBuilder();
		
		proxymsg.setMsgtype(MSGTYPE.HEARTBEATINFO);
		proxymsg.setMsgbody(strXmlParams);
		
		String sendStr = proxymsg.build().toString();
		
		StringBuilder builder = new StringBuilder();
		builder.append(responseHeaderStr);
		
		//Transmitter trans = new Transmitter();
		
		//if (trans.transmit(sendStr)) {
		if (TransmitterFactory.getInstance().getTransmitter().transmit(sendStr)) {
			builder.append("<result code=\"0\"/> \n");
		}
		else {
			builder.append("<result code=\"1\"/> \n");
		}
		
		builder.append(responseTailStr);
		
		return builder.toString();
	}
}