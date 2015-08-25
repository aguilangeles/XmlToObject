package ar.com.ultimorescomercio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(name="", propOrder={
		"ultimosrescomercio",
		"NroComercio",
		"DescripcionComercio",
		"NroLiquidacion",
		"FechaEmision",
		"TotalCompras",
		"TotalDescuentos",
		"TotalBruto",
		"Aporte",
		"IvaAporte",
		"Iva",
		"IngBrutos",
		"Ganancias",
		"TotalNeto",
		"CondicionPago",
		"FechaCobro"	

})
@XmlAccessorType (XmlAccessType.FIELD)
@XmlRootElement
public class UltimosResComercio {

	private String ultimosrescomercio;
	private String NroComercio;
	private String DescripcionComercio;
	private String NroLiquidacion;
	private String FechaEmision;
	private String TotalCompras;
	private String TotalDescuentos;
	private String TotalBruto;
	private String Aporte;
	private String IvaAporte;
	private String Iva;
	private String IngBrutos;
	private String Ganancias;
	private String TotalNeto;
	private String CondicionPago;
	private String FechaCobro;
	/**
	 * @return the ultimosrescomercio
	 */
	public String getUltimosrescomercio() {
		return ultimosrescomercio;
	}
	/**
	 * @param ultimosrescomercio the ultimosrescomercio to set
	 */
	public void setUltimosrescomercio(String ultimosrescomercio) {
		this.ultimosrescomercio = ultimosrescomercio;
	}
	/**
	 * @return the nroComercio
	 */
	public String getNroComercio() {
		return NroComercio;
	}
	/**
	 * @param nroComercio the nroComercio to set
	 */
	public void setNroComercio(String nroComercio) {
		NroComercio = nroComercio;
	}
	/**
	 * @return the descripcionComercio
	 */
	public String getDescripcionComercio() {
		return DescripcionComercio;
	}
	/**
	 * @param descripcionComercio the descripcionComercio to set
	 */
	public void setDescripcionComercio(String descripcionComercio) {
		DescripcionComercio = descripcionComercio;
	}
	/**
	 * @return the nroLiquidacion
	 */
	public String getNroLiquidacion() {
		return NroLiquidacion;
	}
	/**
	 * @param nroLiquidacion the nroLiquidacion to set
	 */
	public void setNroLiquidacion(String nroLiquidacion) {
		NroLiquidacion = nroLiquidacion;
	}
	/**
	 * @return the fechaEmision
	 */
	public String getFechaEmision() {
		return FechaEmision;
	}
	/**
	 * @param fechaEmision the fechaEmision to set
	 */
	public void setFechaEmision(String fechaEmision) {
		FechaEmision = fechaEmision;
	}
	/**
	 * @return the totalCompras
	 */
	public String getTotalCompras() {
		return TotalCompras;
	}
	/**
	 * @param totalCompras the totalCompras to set
	 */
	public void setTotalCompras(String totalCompras) {
		TotalCompras = totalCompras;
	}
	/**
	 * @return the totalDescuentos
	 */
	public String getTotalDescuentos() {
		return TotalDescuentos;
	}
	/**
	 * @param totalDescuentos the totalDescuentos to set
	 */
	public void setTotalDescuentos(String totalDescuentos) {
		TotalDescuentos = totalDescuentos;
	}
	/**
	 * @return the totalBruto
	 */
	public String getTotalBruto() {
		return TotalBruto;
	}
	/**
	 * @param totalBruto the totalBruto to set
	 */
	public void setTotalBruto(String totalBruto) {
		TotalBruto = totalBruto;
	}
	/**
	 * @return the aporte
	 */
	public String getAporte() {
		return Aporte;
	}
	/**
	 * @param aporte the aporte to set
	 */
	public void setAporte(String aporte) {
		Aporte = aporte;
	}
	/**
	 * @return the ivaAporte
	 */
	public String getIvaAporte() {
		return IvaAporte;
	}
	/**
	 * @param ivaAporte the ivaAporte to set
	 */
	public void setIvaAporte(String ivaAporte) {
		IvaAporte = ivaAporte;
	}
	/**
	 * @return the iva
	 */
	public String getIva() {
		return Iva;
	}
	/**
	 * @param iva the iva to set
	 */
	public void setIva(String iva) {
		Iva = iva;
	}
	/**
	 * @return the ingBrutos
	 */
	public String getIngBrutos() {
		return IngBrutos;
	}
	/**
	 * @param ingBrutos the ingBrutos to set
	 */
	public void setIngBrutos(String ingBrutos) {
		IngBrutos = ingBrutos;
	}
	/**
	 * @return the ganancias
	 */
	public String getGanancias() {
		return Ganancias;
	}
	/**
	 * @param ganancias the ganancias to set
	 */
	public void setGanancias(String ganancias) {
		Ganancias = ganancias;
	}
	/**
	 * @return the totalNeto
	 */
	public String getTotalNeto() {
		return TotalNeto;
	}
	/**
	 * @param totalNeto the totalNeto to set
	 */
	public void setTotalNeto(String totalNeto) {
		TotalNeto = totalNeto;
	}
	/**
	 * @return the condicionPago
	 */
	public String getCondicionPago() {
		return CondicionPago;
	}
	/**
	 * @param condicionPago the condicionPago to set
	 */
	public void setCondicionPago(String condicionPago) {
		CondicionPago = condicionPago;
	}
	/**
	 * @return the fechaCobro
	 */
	public String getFechaCobro() {
		return FechaCobro;
	}
	/**
	 * @param fechaCobro the fechaCobro to set
	 */
	public void setFechaCobro(String fechaCobro) {
		FechaCobro = fechaCobro;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UltimosResComercio [ultimosrescomercio=");
		builder.append(ultimosrescomercio);
		builder.append(", NroComercio=");
		builder.append(NroComercio);
		builder.append(", DescripcionComercio=");
		builder.append(DescripcionComercio);
		builder.append(", NroLiquidacion=");
		builder.append(NroLiquidacion);
		builder.append(", FechaEmision=");
		builder.append(FechaEmision);
		builder.append(", TotalCompras=");
		builder.append(TotalCompras);
		builder.append(", TotalDescuentos=");
		builder.append(TotalDescuentos);
		builder.append(", TotalBruto=");
		builder.append(TotalBruto);
		builder.append(", Aporte=");
		builder.append(Aporte);
		builder.append(", IvaAporte=");
		builder.append(IvaAporte);
		builder.append(", Iva=");
		builder.append(Iva);
		builder.append(", IngBrutos=");
		builder.append(IngBrutos);
		builder.append(", Ganancias=");
		builder.append(Ganancias);
		builder.append(", TotalNeto=");
		builder.append(TotalNeto);
		builder.append(", CondicionPago=");
		builder.append(CondicionPago);
		builder.append(", FechaCobro=");
		builder.append(FechaCobro);
		builder.append("]");
		return builder.toString();
	}



}
