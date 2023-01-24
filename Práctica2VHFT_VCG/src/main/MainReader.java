package main;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import listaCanciones.Cancion;
import listaCanciones.Lista;
import manejador.XMLHandler;

public class MainReader {

	public static void main(String[] args) {
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser;
		XMLHandler handler;
		
		try {
			parser = factory.newSAXParser();
			handler = new XMLHandler();
			parser.parse(new File("listas.xml"), handler);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		
	}
	
}