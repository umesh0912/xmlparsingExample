package com.jackson.xmlparsingExample.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "beans")
public class EntitlementBeansContext {
	
	@JacksonXmlProperty(isAttribute = true, localName = "xmlns")
	String xmlns;
	
	Bean bean;

	
	public EntitlementBeansContext(String xmlns, Bean bean) {
		super();
		this.xmlns = xmlns;
		this.bean = bean;
	}


	public EntitlementBeansContext() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
