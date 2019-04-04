package abstractFactory;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class XMLUtil {
	public static Object getBean(){
		try{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("src//abstractFactory//config.xml"));
			
			Node node = document.getElementsByTagName("className").item(0).getFirstChild();
			String name = node.getNodeValue();
			
			Class c= Class.forName(name);
			Object obj = c.newInstance();
			return obj;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
