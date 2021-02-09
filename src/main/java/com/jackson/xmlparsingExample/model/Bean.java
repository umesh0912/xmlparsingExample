package com.jackson.xmlparsingExample.model;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data 
public class Bean {

	
	@JacksonXmlProperty(isAttribute = true, localName = "id")
	String beanId;
	
	@JacksonXmlProperty(isAttribute = true, localName = "class")
	String className;
	
	
	
	public Bean(String beanId, String className, List<Property> listsOfProperties) {
		super();
		this.beanId = beanId;
		this.className = className;
		this.listsOfProperties = listsOfProperties;
	}



	public Bean() {
	}



	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "property")
	List<Property> listsOfProperties;
}
