package crearXML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Main {

	public static void main(String[] args) {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
		DocumentBuilder db;
		Document doc;
		Element element;
		Attr atributo;
		TransformerFactory tf = TransformerFactory.newDefaultInstance();
		Transformer transformer;
		DOMSource doms;
		StreamResult sr;
		
		try {
			
			db = dbf.newDocumentBuilder();
			doc = db.newDocument();
			
			// Creamos el elemento raíz
			element = doc.createElement("personas");

			// Y lo tenemos que añadir para que funcione
			doc.appendChild(element);
			
			// Creamos un ID para la raíz
			atributo = doc.createAttribute("id");
			
			// Le damos valor al atributo
			atributo.setValue("908");
			
			// Le ponemos el atributo al elemento
			element.setAttributeNode(atributo);
			
			transformer = tf.newTransformer();
			doms = new DOMSource(doc);
			sr = new StreamResult(new File("Personitas.xml"));
			
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty(OutputKeys.INDENT, "YES");
			transformer.transform(doms, sr);
			
		} catch (ParserConfigurationException e) {
			System.err.println(e.getMessage());
		} catch (TransformerConfigurationException e) {
			System.err.println(e.getMessage());
		} catch (TransformerException e) {
			System.err.println(e.getMessage());
		}

	}

}
