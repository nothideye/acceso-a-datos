package main;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import persona.Usuario;

public class MainWriter {

	public static void main(String[] args) {

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		XMLOutputFactory xof = XMLOutputFactory.newInstance();
		XMLStreamWriter xsw;
		
		usuarios.add(new Usuario("Juan", 23, LocalDate.of(2005, 2, 21)));
		usuarios.add(new Usuario("Maria", 32, LocalDate.of(2020, 3, 14)));
		usuarios.add(new Usuario("Lucia", 51, LocalDate.of(2016, 10, 5)));
		
		try {
			xsw = xof.createXMLStreamWriter(new FileWriter("Usuarios.xml"));
			
			// Inicio del documento con prólogo (sin salto de línea)
			xsw.writeStartDocument();
			
			// Salto de línea entre el prólogo y el elemento raíz <usuarios>
			xsw.writeCharacters("\n");
			
			// Etiqueta de inicio de <usuarios>
			xsw.writeStartElement("usuarios");
			
			for (Usuario u : usuarios) {
				
				// Salto de línea y tabulación para mantener la jerarquía del árbol
				xsw.writeCharacters("\n\t");
				
				// Etiqueta de inicio de <usuario>
				xsw.writeStartElement("usuario");
				
				// Nombre
				xsw.writeCharacters("\n\t\t");
				xsw.writeStartElement("nombre");
				xsw.writeCharacters(u.getNombre());
				xsw.writeEndElement();
				
				// Edad
				xsw.writeCharacters("\n\t\t");
				xsw.writeStartElement("edad");
				xsw.writeCharacters("" + u.getEdad());
				xsw.writeEndElement();
				
				// Fecha de registro
				xsw.writeCharacters("\n\t\t");
				xsw.writeStartElement("fechaRegistro");
				xsw.writeCharacters(u.getFechaRegistro().toString());
				xsw.writeEndElement();
				
				// Cierre de <usuario> con salto de línea y tabulación previa 
				xsw.writeCharacters("\n\t");
				xsw.writeEndElement();
				
			}
			
			xsw.writeCharacters("\n");
			
			// Cierre de <usuarios>
			xsw.writeEndElement();

			// Cierre del documento
			xsw.writeEndDocument();
			
			// Le obligamos a que escriba la información almacenada en el documento y que no lo siga guardando en la "memoria"
			xsw.flush();
			
			xsw.close();
			
		} catch (XMLStreamException | IOException e) {
			e.printStackTrace();
		}

	}

}