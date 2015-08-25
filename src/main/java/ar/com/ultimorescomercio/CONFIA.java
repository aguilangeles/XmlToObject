package ar.com.ultimorescomercio;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="CONFIA")
@XmlAccessorType (XmlAccessType.FIELD)

public class CONFIA {
	
	private String CONFIA;
	
	@XmlElement(name ="ultimosrescomercio")
	private List<UltimosResComercio> ultimosrescomercios =null;

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
	 * @return the ultimosrescomercios
	 */
	public List<UltimosResComercio> getUltimosrescomercios() {
		return ultimosrescomercios;
	}

	/**
	 * @param ultimosrescomercios the ultimosrescomercios to set
	 */
	public void setUltimosrescomercios(List<UltimosResComercio> ultimosrescomercios) {
		this.ultimosrescomercios = ultimosrescomercios;
	}


	
}
