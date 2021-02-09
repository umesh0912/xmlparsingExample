package com.jackson.xmlparsingExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.jackson.xmlparsingExample.model.EntitlementBeansContext;

@SpringBootApplication
public class XmlparsingexampleApplication {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//SpringApplication.run(XmlparsingexampleApplication.class, args);
		
		//working for testSmall.xml
		File file = new File("testSmall.xml");
		
		//not working for testLarge.xml
		//File file = new File("testLarge.xml");
	    XmlMapper xmlMapper = new XmlMapper();
	  //s  xmlMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
	    String xml = inputStreamToString(new FileInputStream(file));
	    EntitlementBeansContext value =  xmlMapper.readValue(xml, EntitlementBeansContext.class);
	   
	    System.out.println("Pojo --> " + value.toString().length());
	}
	
	public static String inputStreamToString(InputStream is) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    String line;
	    BufferedReader br = new BufferedReader(new InputStreamReader(is));
	    while ((line = br.readLine()) != null) {
	        sb.append(line);
	    }
	    br.close();
	    return sb.toString();
	}

}
