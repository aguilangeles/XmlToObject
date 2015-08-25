package ar.com.helpers;

public class Llamadas {
	
	private String ultimorescomercio = "ultimosrescomercio";
	private String comercio;
	private String rescomercio="rescomercio";
	private String nroresumen;
	private String paginadoRequest_pagina;
	private String paginadoRequest_RegistrosPagina;
	
	private String starXml ="<xml>";
	private String endXml ="</xml>";
	
	private String starCmd ="<cmd>";
	private String endCmd ="</cmd>";
	
	
	private String starComercio ="<comercio>";
	private String endComercio ="</comercio>";

	/*<xml>
	<cmd>rescomercio</cmd>
	<nroresumen>12345</nroresumen>
	<PaginadoRequest-pagina>1</PaginadoRequest-pagina>
	<PaginadoRequest-RegistrosPagina>40</PaginadoRequest-RegistrosPagina>
	</xml>*/
	private String startResumen ="<nroresumen>";
	private String endResumen ="</nroresumen>";
	private String starPagina ="<PaginadoRequest_pagina>";
	private String endPagina ="</PaginadoRequest_pagina>";
	private String starRegistro ="<PaginadoRequest_RegistrosPagina>";
	private String endRegistro ="</PaginadoRequest_RegistrosPagina>";
	
	
	/*<xml>
	<cmd>ultimosrescomercio</cmd>
	<comercio>19200707004</comercio>
	</xml>*/
	public String getLlamadaUltimoResComercio(String comercio ){
		
		StringBuilder xml = new StringBuilder();
		xml.append(starXml);
		xml.append(starCmd);
		xml.append(ultimorescomercio);
		xml.append(endCmd);
		xml.append(starComercio);
		xml.append(comercio);
		xml.append(endComercio);
		xml.append(endXml);
		return xml.toString();
	}
	
	/*<xml>
	<cmd>rescomercio</cmd>
	<nroresumen>12345</nroresumen>
	<PaginadoRequest-pagina>1</PaginadoRequest-pagina>
	<PaginadoRequest-RegistrosPagina>40</PaginadoRequest-RegistrosPagina>
	</xml>*/
	/*<xml>
	 * <cmd>rescomercio</cmd>
	 * <nroresumen>1235</nroresumen>
	 * <PaginadoRequest-pagina>1</PaginadoRequest-pagina>
	 * <PaginadoRequest-RegistrosPagina>10</PaginadoRequest-RegistrosPagina>
	 * </xml>*/
	public String getLlamadaResComercio(	
	String nroresumen,
	String paginadoRequest_pagina,
	String paginadoRequest_RegistrosPagina){
		
		StringBuilder xml = new StringBuilder();
		xml.append(starXml);
		xml.append(starCmd);
		xml.append(rescomercio);
		xml.append(endCmd);
		xml.append(startResumen);
		xml.append(nroresumen);
		xml.append(endResumen);
		xml.append(starPagina);
		xml.append(paginadoRequest_pagina);
		xml.append(endPagina);
		xml.append(starRegistro);
		xml.append(paginadoRequest_RegistrosPagina);
		xml.append(endRegistro);
		xml.append(endXml);
		return xml.toString();
		
	}
	
	public String getResComercio(){
	return 
		"<CONFIA>"+
				
				"<rescomercio>"+
			    "<nro_comercio>21000022003</nro_comercio>"+
			    "<nro_liquidacioncomercio>1235</nro_liquidacioncomercio>"+
			    "<id_tarjeta>5047444003126800</id_tarjeta>"+
			    "<importe_autorizacion>30.24</importe_autorizacion>"+
			    "<importe_cuota>30.24</importe_cuota>"+
			    "<importe_cuotacoeficiente>28.80</importe_cuotacoeficiente>"+
			    "<cuotas>3</cuotas>"+
			    "<nro_cupon>463</nro_cupon>"+
			    "<fecha_movimiento>07/01/2003</fecha_movimiento>"+
			    "<cod_autorizacion>32467</cod_autorizacion>"+
			    "<PaginadoResponse_CantidadRegistros>45</PaginadoResponse_CantidadRegistros>"+
			    "<PaginadoResponse_pagina>1</PaginadoResponse_pagina>"+
			    "<PaginadoResponse_RegistrosPagina>10</PaginadoResponse_RegistrosPagina>"+
			  "</rescomercio>"	+  
			  "<rescomercio>"+
			    "<nro_comercio>21000022005</nro_comercio>"+
			    "<nro_liquidacioncomercio>1235</nro_liquidacioncomercio>"+
			    "<id_tarjeta>5047444106302220</id_tarjeta>"+
			    "<importe_autorizacion>34.54</importe_autorizacion>"+
			    "<importe_cuota>34.54</importe_cuota>"+
			    "<importe_cuotacoeficiente>33.70</importe_cuotacoeficiente>"+
			    "<cuotas>2</cuotas>"+
			    "<nro_cupon>476</nro_cupon>"+
			    "<fecha_movimiento>07/01/2003</fecha_movimiento>"+
			    "<cod_autorizacion>33026</cod_autorizacion>"+
			    "<PaginadoResponse_CantidadRegistros>45</PaginadoResponse_CantidadRegistros>"+
			    "<PaginadoResponse_pagina>1</PaginadoResponse_pagina>"+
			    "<PaginadoResponse_RegistrosPagina>10</PaginadoResponse_RegistrosPagina>"+
			  "</rescomercio>"+
			  "<rescomercio>"+
			    "<nro_comercio>21000022008</nro_comercio>"+
			    "<nro_liquidacioncomercio>1235</nro_liquidacioncomercio>"+
			    "<id_tarjeta>5047449902243160</id_tarjeta>"+
			    "<importe_autorizacion>70.91</importe_autorizacion>"+
			    "<importe_cuota>70.9</importe_cuota>"+
			    "<importe_cuotacoeficiente>67.53</importe_cuotacoeficiente>"+
			    "<cuotas>3</cuotas>"+
			    "<nro_cupon>485</nro_cupon>"+
			    "<fecha_movimiento>08/01/2003</fecha_movimiento>"+
			    "<cod_autorizacion>33806</cod_autorizacion>"+
			    "<PaginadoResponse_CantidadRegistros>4</PaginadoResponse_CantidadRegistros>"+
			    "<PaginadoResponse_pagina>1</PaginadoResponse_pagina>"+
			    "<PaginadoResponse_RegistrosPagina>10</PaginadoResponse_RegistrosPagina>"+
			  "</rescomercio>"+
			  "</CONFIA>";
	}
	public String getUltimosResComercio(){
		return  "<CONFIA>"+"<ultimosrescomercio>"+
	"<NroComercio>19200707004</NroComercio>"+
				"<DescripcionComercio>CEDICOM SACIFA NQN.</DescripcionComercio>"+
	"<NroLiquidacion>436607</NroLiquidacion>"+"<FechaEmision>13/02/2015</FechaEmision>"+
				"<TotalCompras>101439.17</TotalCompras>"+"<TotalDescuentos>0.00</TotalDescuentos>"+
	"<TotalBruto>101439.17</TotalBruto><Aporte>3043.18</Aporte>"+"<IvaAporte>639.07</IvaAporte>"+""
			+ "<Iva>977.57</Iva>"+"<IngBrutos>977.57</IngBrutos>"+"<Ganancias>977.57</Ganancias>"+
	"<TotalNeto>94824.21</TotalNeto>"+"<CondicionPago>14</CondicionPago>"+
			"<FechaCobro>27/02/2015</FechaCobro>"+"</ultimosrescomercio>"+"</CONFIA>";
	}
}
