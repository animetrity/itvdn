package main.java.java_4_Professionall.lesson_7.task_3_and_4;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Main {
public static void main(String[] args) throws ParserConfigurationException, TransformerException, JAXBException {
	String url = "/home/logrog/IdeaProjects/itvdn/src/main/java/java_4_Professionall/lesson_7/task_3_and_4/file.xml";


	//System.out.println("Записуєм в файл XML");
	//writeXML(url);
	//System.out.println("Читаєм з файлу за допомогою XMLSAXParser");
	parseXMLSAXParser(url);
	//System.out.println("Читаєм з файлу за допомогою JAXB");
	//parseJAXB(url);


}

public static void parseJAXB(String url) throws JAXBException {

	JAXBContext jaxbContext = JAXBContext.newInstance(Object.class);
	Unmarshaller unmar = jaxbContext.createUnmarshaller();
	Object object = (Object) unmar.unmarshal(new File(url));
	System.out.println(object);
}
public static void writeXML(String url) throws ParserConfigurationException, TransformerException {
	Document doc = DocumentBuilderFactory
			.newInstance()
			.newDocumentBuilder()
			.newDocument();

	Element root = doc.createElement("objects");

	Element city = doc.createElement("city");
	city.setTextContent("Kyiv");
	city.setAttribute("size", "big");

	Element street = doc.createElement("street");
	street.setTextContent("Shevchenka");
	Element house = doc.createElement("house");
	house.setTextContent("12");

	doc.appendChild(root);
	root.appendChild(city);
	root.appendChild(street);
	root.appendChild(house);

	TransformerFactory tf = TransformerFactory.newInstance();
	Transformer t = tf.newTransformer();
	DOMSource source = new DOMSource(doc);
	StreamResult sr = new StreamResult(new File(url));
	t.transform(source, sr);
}
public static void parseXMLSAXParser(String url) {
	final String fileName = url;
	try {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		DefaultHandler handler = new DefaultHandler() {
			boolean city = false;
			boolean street = false;
			boolean house = false;

			boolean test = false;
			String text = "";

			@Override
			public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {


				if (qName.equalsIgnoreCase("city")) {
					city = true;
				}
				if (qName.equalsIgnoreCase("street")) {
					street = true;
				}
				if (qName.equalsIgnoreCase("house")) {
					house = true;
				}
			}

			@Override
			public void characters(char ch[], int start, int length) throws SAXException {
				if (city) {
					System.out.println("city: " + new String(ch, start, length));
					city = false;
				}
				if (street) {
					System.out.println("street: " + new String(ch, start, length));
					street = false;
				}
				if (house) {
					System.out.println("house: " + new String(ch, start, length));
					house = false;
				}
			}
		};
		saxParser.parse(fileName, handler);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
