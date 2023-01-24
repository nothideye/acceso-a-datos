package dom_xml;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
		DocumentBuilder db;
		Document doc;
		File archivoXML;
		String path = "Personas.xml";
		XPath xPath;
		NodeList nodos;
		
		try {
			
			db = dbf.newDocumentBuilder();
			archivoXML = new File(path);
			doc = db.parse(archivoXML);
			
			doc.normalizeDocument();
			
			xPath = XPathFactory.newInstance().newXPath();
			
			nodos = (NodeList) xPath.compile("//persona").evaluate(doc, XPathConstants.NODESET);
			
			for (int i = 0; i < nodos.getLength(); i++) {
				Element e = (Element) nodos.item(i);
				Persona p;
				
				//p = new Persona(e.getElementsByTagName("nombre").item(0).getTextContent(), e.getElementsByTagName("apellidos").item(0).getTextContent(), e.getElementsByTagName("nacimiento").item(0).getTextContent(new Date()));
				
				System.out.println(e.getTagName());
				System.out.println(e.getAttribute("id"));
				//System.out.println(p);
				
				
			}
			
		} catch (ParserConfigurationException e) {
			System.err.println(e.getMessage());
		} catch (SAXException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} catch (XPathExpressionException e) {
			System.err.println(e.getMessage());
		}

	}

}