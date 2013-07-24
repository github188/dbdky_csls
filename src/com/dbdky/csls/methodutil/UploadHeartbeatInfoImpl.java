package com.dbdky.csls.methodutil;

public class UploadHeartbeatInfoImpl {
	private static final String requestSchemaFileName = "uploadCACHeartbeatInfo_request.xsd";
	private static final String responseSchemaFileName = "uploadCACHeartbeatInfo_response.xsd";
	
	public static String transfer(String strXmlParams) {
		String requestSchemaPath = System.getProperty("user.dir") + "/" + requestSchemaFileName;
		
		if (!XMLValidator.validateXmlStrWithSchemaFile(requestSchemaPath, strXmlParams)) {
			return I2ServiceError.E_XML_INVALID;
		}
	
		return new String("UploadHeartbeatInfoImpl.transfer");
	}
}