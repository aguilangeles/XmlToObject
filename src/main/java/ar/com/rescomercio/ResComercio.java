package ar.com.rescomercio;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlType(name="", propOrder = {
		"rescomercio", 
		"nro_comercio", 
		"nro_liquidacioncomercio",
		"id_tarjeta",
		"importe_autorizacion",
		"importe_cuota",
		"importe_cuotacoeficiente",
		"cuotas",
		"nro_cupon",
		"fecha_movimiento",
		"cod_autorizacion",
		"paginadoResponse_CantidadRegistros",
		"paginadoResponse_pagina",
		"paginadoResponse_RegistrosPagina"
		
		
})
@XmlAccessorType (XmlAccessType.FIELD)
@XmlRootElement
public class ResComercio {
	protected String rescomercio;
	protected String nro_comercio;
	protected String nro_liquidacioncomercio;
	protected String id_tarjeta;
	protected String importe_autorizacion;
	protected String importe_cuota;
	protected String importe_cuotacoeficiente;
	protected String cuotas;
	protected String nro_cupon;
	protected String fecha_movimiento;
	protected String cod_autorizacion;
	protected String paginadoResponse_CantidadRegistros;
	protected String paginadoResponse_pagina;
	protected String paginadoResponse_RegistrosPagina;
	
	/**
	 * @return the rescomercio
	 */
	public String getRescomercio() {
		return rescomercio;
	}
	/**
	 * @param rescomercio the rescomercio to set
	 */
	public void setRescomercio(String rescomercio) {
		this.rescomercio = rescomercio;
	}
	/**
	 * @return the nro_comercio
	 */
	public String getNro_comercio() {
		return nro_comercio;
	}
	/**
	 * @param nro_comercio the nro_comercio to set
	 */
	public void setNro_comercio(String nro_comercio) {
		this.nro_comercio = nro_comercio;
	}
	/**
	 * @return the nro_liquidacioncomercio
	 */
	public String getNro_liquidacioncomercio() {
		return nro_liquidacioncomercio;
	}
	/**
	 * @param nro_liquidacioncomercio the nro_liquidacioncomercio to set
	 */
	public void setNro_liquidacioncomercio(String nro_liquidacioncomercio) {
		this.nro_liquidacioncomercio = nro_liquidacioncomercio;
	}
	/**
	 * @return the id_tarjeta
	 */
	public String getId_tarjeta() {
		return id_tarjeta;
	}
	/**
	 * @param id_tarjeta the id_tarjeta to set
	 */
	public void setId_tarjeta(String id_tarjeta) {
		this.id_tarjeta = id_tarjeta;
	}
	/**
	 * @return the importe_autorizacion
	 */
	public String getImporte_autorizacion() {
		return importe_autorizacion;
	}
	/**
	 * @param importe_autorizacion the importe_autorizacion to set
	 */
	public void setImporte_autorizacion(String importe_autorizacion) {
		this.importe_autorizacion = importe_autorizacion;
	}
	/**
	 * @return the importe_cuota
	 */
	public String getImporte_cuota() {
		return importe_cuota;
	}
	/**
	 * @param importe_cuota the importe_cuota to set
	 */
	public void setImporte_cuota(String importe_cuota) {
		this.importe_cuota = importe_cuota;
	}
	/**
	 * @return the importe_cuotacoeficiente
	 */
	public String getImporte_cuotacoeficiente() {
		return importe_cuotacoeficiente;
	}
	/**
	 * @param importe_cuotacoeficiente the importe_cuotacoeficiente to set
	 */
	public void setImporte_cuotacoeficiente(String importe_cuotacoeficiente) {
		this.importe_cuotacoeficiente = importe_cuotacoeficiente;
	}
	/**
	 * @return the cuotas
	 */
	public String getCuotas() {
		return cuotas;
	}
	/**
	 * @param cuotas the cuotas to set
	 */
	public void setCuotas(String cuotas) {
		this.cuotas = cuotas;
	}
	/**
	 * @return the nro_cupon
	 */
	public String getNro_cupon() {
		return nro_cupon;
	}
	/**
	 * @param nro_cupon the nro_cupon to set
	 */
	public void setNro_cupon(String nro_cupon) {
		this.nro_cupon = nro_cupon;
	}
	/**
	 * @return the fecha_movimiento
	 */
	public String getFecha_movimiento() {
		return fecha_movimiento;
	}
	/**
	 * @param fecha_movimiento the fecha_movimiento to set
	 */
	public void setFecha_movimiento(String fecha_movimiento) {
		this.fecha_movimiento = fecha_movimiento;
	}
	/**
	 * @return the cod_autorizacion
	 */
	public String getCod_autorizacion() {
		return cod_autorizacion;
	}
	/**
	 * @param cod_autorizacion the cod_autorizacion to set
	 */
	public void setCod_autorizacion(String cod_autorizacion) {
		this.cod_autorizacion = cod_autorizacion;
	}
	/**
	 * @return the paginadoResponse_CantidadRegistros
	 */
	public String getPaginadoResponse_CantidadRegistros() {
		return paginadoResponse_CantidadRegistros;
	}
	/**
	 * @param paginadoResponse_CantidadRegistros the paginadoResponse_CantidadRegistros to set
	 */
	public void setPaginadoResponse_CantidadRegistros(
			String paginadoResponse_CantidadRegistros) {
		this.paginadoResponse_CantidadRegistros = paginadoResponse_CantidadRegistros;
	}
	/**
	 * @return the paginadoResponse_pagina
	 */
	public String getPaginadoResponse_pagina() {
		return paginadoResponse_pagina;
	}
	/**
	 * @param paginadoResponse_pagina the paginadoResponse_pagina to set
	 */
	public void setPaginadoResponse_pagina(String paginadoResponse_pagina) {
		this.paginadoResponse_pagina = paginadoResponse_pagina;
	}
	/**
	 * @return the paginadoResponse_RegistrosPagina
	 */
	public String getPaginadoResponse_RegistrosPagina() {
		return paginadoResponse_RegistrosPagina;
	}
	/**
	 * @param paginadoResponse_RegistrosPagina the paginadoResponse_RegistrosPagina to set
	 */
	public void setPaginadoResponse_RegistrosPagina(
			String paginadoResponse_RegistrosPagina) {
		this.paginadoResponse_RegistrosPagina = paginadoResponse_RegistrosPagina;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResComercio [rescomercio=");
		builder.append(rescomercio);
		builder.append(", \nnro_comercio=");
		builder.append(nro_comercio);
		builder.append(", \nnro_liquidacioncomercio=");
		builder.append(nro_liquidacioncomercio);
		builder.append(", \nid_tarjeta=");
		builder.append(id_tarjeta);
		builder.append(", \nimporte_autorizacion=");
		builder.append(importe_autorizacion);
		builder.append(", \nimporte_cuota=");
		builder.append(importe_cuota);
		builder.append(", \nimporte_cuotacoeficiente=");
		builder.append(importe_cuotacoeficiente);
		builder.append(", \ncuotas=");
		builder.append(cuotas);
		builder.append(", \nnro_cupon=");
		builder.append(nro_cupon);
		builder.append(", \nfecha_movimiento=");
		builder.append(fecha_movimiento);
		builder.append(", \ncod_autorizacion=");
		builder.append(cod_autorizacion);
		builder.append(", \npaginadoResponse_CantidadRegistros=");
		builder.append(paginadoResponse_CantidadRegistros);
		builder.append(", \npaginadoResponse_pagina=");
		builder.append(paginadoResponse_pagina);
		builder.append(", \npaginadoResponse_RegistrosPagina=");
		builder.append(paginadoResponse_RegistrosPagina);
		builder.append("]");
		return builder.toString();
	}


}


