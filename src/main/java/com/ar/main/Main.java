package com.ar.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.InputSource;



public class Main {

	public static void main(String[] args) throws JAXBException {


		JAXBContext jc = JAXBContext.newInstance(CONFIA2.class);

		Unmarshaller unmarshaller =jc.createUnmarshaller();

		//en caso de que lo lea de un xml
		File file = getXml();

		// en caso de que lo lea desde un String
//		StreamSource streamsource = getResultado();

		//CONFIA confia = (CONFIA) unmarshaller.unmarshal(file);

		/*CONFIA confia = (CONFIA) unmarshaller.unmarshal(file);
		  System.out.println("======= lista=========================");
		for(ResComercio comercio : confia.getRescomercios()){
			System.out.println(comercio);
			System.out.println("-----------------------------------");
		}
		System.out.println("========fin===========================");*/
		
		CONFIA2 confia2 = (CONFIA2) unmarshaller.unmarshal(file);
		System.out.println("======= lista=========================");
		for(UltimosResComercio ultimoscomercios : confia2.getUltimosrescomercios()){
			System.out.println(ultimoscomercios);
			System.out.println("-----------------------------------");
		}
		System.out.println("========fin===========================");
	}

	private static StreamSource getResultado() {

		String xml = new Llamadas().getResComercio();
		System.out.println(xml);
		StreamSource streamsource = new StreamSource(new StringReader(xml));
		return streamsource;
	}

	private static File getXml() {

		File file = new File("/Users/angeles/Desktop/workspace/XmlToObject/src/main/resources/resUltimosComercios.xml");
		try {
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader); 
			String s; 
			while((s = br.readLine()) != null) { 
				System.out.println(s); 
			} 
			reader.close(); 

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("leyó el xml");
		return file;
	}

}
