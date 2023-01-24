package manejador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import persona.Usuario;

public class XMLHandler extends DefaultHandler {
	
	private ArrayList<Usuario> usuarios;
	private Usuario usuarioActual;
	private String texto;
	
	public XMLHandler() {
		super();
		usuarios = new ArrayList<Usuario>();
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
			System.out.println("Etiqueta de texto detectada: " + texto);
		}
		
	}
	
	@Override
	public void startElement(String nameSpaceUri, String localName, String qName, Attributes atts) {
		
		System.out.println("Etiqueta: " + qName);
		
		for (int i = 0; i < atts.getLength(); i++) {
			System.out.println("\t" + atts.getLocalName(i) + ": " + atts.getValue(i));
		}
		
		if (qName.equalsIgnoreCase("usuario")) {
			usuarioActual = new Usuario();
		}
		
	}
	
	@Override
	public void endElement(String nameSpaceUri, String localName, String qName) {
		
		System.out.println("Fin de etiqueta: " + qName);
		
		if (qName.equalsIgnoreCase("nombre")) {
			usuarioActual.setNombre(texto);
		} else if (qName.equalsIgnoreCase("edad")) {
			usuarioActual.setEdad(Integer.parseInt(texto));
		} else if (qName.equalsIgnoreCase("fechaRegistro")) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaRegistro = LocalDate.parse(texto, dtf);
			usuarioActual.setFechaRegistro(fechaRegistro);
		} else if (qName.equalsIgnoreCase("usuario")) {
			usuarios.add(usuarioActual);
		}
		
	}
	
	@Override
	public void ignorableWhitespace(char[] ch, int start, int length) {
		
		System.out.println("Espacios en blanco seguidos. ELiminar.");
		
	}
	
	@Override
	public void skippedEntity(String name) {
		
		System.out.println("Entidad saltada.");
		
	}
	
}