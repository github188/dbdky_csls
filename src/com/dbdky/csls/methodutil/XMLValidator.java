package com.dbdky.csls.methodutil;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

public class XMLValidator {
	public static boolean validateXmlFileWithSchemaFile(String schemaFileName, String xmlFileName) {
			boolean ret = false;
			try {
				SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
				File schemaFile = new File(schemaFileName);
				Schema schema = schemaFactory.newSchema(schemaFile);
				Validator validator = schema.newValidator();
				Source source = new StreamSource(xmlFileName);
				validator.validate(source);
				ret = true;
			}
			catch (SAXException ex) {
				ret = false;
			}
			catch (Exception ex) {
				ret = false;
			}
			
			return ret;
	}
	
	public static boolean validateXmlStrWithSchemaFile(String schemaFileName, String strXml) {
		//TODO:
		return true;
	}
}