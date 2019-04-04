package factoryMethod;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class XMLUtil {
	public static Object getBean(){
		try{
			//����dom�ĵ�����
			DocumentBuilderFactory dfactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dfactory.newDocumentBuilder();
			Document doc= builder.parse(new File("src//factoryMethod//config.xml"));
			//��ȡ�����������ı��ڵ�
			Node node = doc.getElementsByTagName("classname").item(0).getFirstChild();
			String value = node.getNodeValue();
			//ͨ��������ƻ�ȡʵ������
			Class c=Class.forName(value);
			Object obj = c.newInstance();
			return obj;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
