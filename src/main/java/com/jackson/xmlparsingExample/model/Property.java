package com.jackson.xmlparsingExample.model;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
public class Property {

	@JacksonXmlProperty(isAttribute = true, localName = "name")
	private String name;
	
	@JacksonXmlProperty(isAttribute = true, localName = "value")
	String value;
	
	@JacksonXmlElementWrapper(localName = "list")
	@JacksonXmlProperty(localName = "bean")
	List<Bean> listOfBean;

	
	public Property(String name, String value, List<Bean> listOfBean) {
		super();
		this.name = name;
		this.value = value;
		this.listOfBean = listOfBean;
	}


	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
