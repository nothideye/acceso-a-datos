package manejador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import canciones.Cancion;
import canciones.Lista;

public class XMLHandler extends DefaultHandler {
	
	private ArrayList<Lista> listas = new ArrayList<Lista>();
	private Lista c ;
	private ArrayList<Cancion>canciones;
	private Cancion cancionActual;
	String texto;
	
	
	public XMLHandler() {
		super();
		canciones = new ArrayList<Cancion>();
	
	}
	
	// Este método se ejecuta cuando se abre el documento
	@Override
	public void startDocument() {
		System.out.println("El documento se ha abierto.");
		
	}
	
	// Este método se ejecuta cuando se cierra el documento
	@Override
	public void endDocument() {
		System.out.println("El documento se ha cerrado.");
		
	}
	
	@Override
	public void characters(char[] ch, int start, int length) {
		
		texto = new String(ch, start, length);
		
		if (!texto.isBlank()) {
			System.out.println("Etiqueta de texto detectada: " + "<" +  texto + ">");
		}
		
	}
	
	@Override
	public void startElement(String nameSpaceUri, String localName, String qName, Attributes atts) {
		
		System.out.println("Etiqueta: " + "<" + qName + ">");
		
		
		if (qName.equalsIgnoreCase("cancion")) {
			cancionActual = new Cancion();
		}else if(qName.equalsIgnoreCase("lista")){
			c = new Lista();
		
		}
		
	}
	
	
	@Override
	public void endElement(String nameSpaceUri, String localName, String qName) {
		
		System.out.println("Fin de etiqueta: " + "<" + qName +">");
		
		if (qName.equalsIgnoreCase("titulo")) {
			cancionActual.setTituloCancion(texto);
		} else if (qName.equalsIgnoreCase("artista")) {
			cancionActual.setArtista(texto);
		} else if (qName.equalsIgnoreCase("duracion")) {
			cancionActual.setDuracionCancion(Integer.parseInt(texto));

		}else if (qName.equalsIgnoreCase("nombre")) {
			c.setNombreLista((texto));
		
		}else if (qName.equalsIgnoreCase("numeroCanciones")) {
			c.setNumeroCanciones(Integer.parseInt(texto));
	
		}else if(qName.equalsIgnoreCase("cancion")) {
			c.getListaCanciones().add(cancionActual);
			
		}else if(qName.equalsIgnoreCase("lista")) {
			listas.add(c);
		}
	}

	public ArrayList<Lista> getListas() {
		return listas;
	}
	
}
