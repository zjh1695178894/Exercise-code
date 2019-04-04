package factoryMethod;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class XMLUtil {
	public static Object getBean(){
		try{
			//创建dom文档对象
			DocumentBuilderFactory dfactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dfactory.newDocumentBuilder();
			Document doc= builder.parse(new File("src//factoryMethod//config.xml"));
			//获取包含内名的文本节点
			Node node = doc.getElementsByTagName("classname").item(0).getFirstChild();
			String value = node.getNodeValue();
			//通过反射机制获取实例对象
			Class c=Class.forName(value);
			Object obj = c.newInstance();
			return obj;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
