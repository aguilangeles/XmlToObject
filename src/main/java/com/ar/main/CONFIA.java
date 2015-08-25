package com.ar.main;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="CONFIA")
@XmlAccessorType (XmlAccessType.FIELD)

public class CONFIA {
	
	private String CONFIA;
	
	@XmlElement(name ="rescomercio")
	private List<ResComercio> rescomercios =null;


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CONFIA [CONFIA=");
		builder.append(CONFIA);
		builder.append(", rescomercios=");
		builder.append(rescomercios);
		builder.append("]");
		return builder.toString();
	}


	/**
	 * @return the cONFIA
	 */
	public String getCONFIA() {
		return CONFIA;
	}


	/**
	 * @param cONFIA the cONFIA to set
	 */
	public void setCONFIA(String cONFIA) {
		CONFIA = cONFIA;
	}


	/**
	 * @return the rescomercios
	 */
	public List<ResComercio> getRescomercios() {
		return rescomercios;
	}


	/**
	 * @param rescomercios the rescomercios to set
	 */
	public void setRescomercios(List<ResComercio> rescomercios) {
		this.rescomercios = rescomercios;
	}


	


}
