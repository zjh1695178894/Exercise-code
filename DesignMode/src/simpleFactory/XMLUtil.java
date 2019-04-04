package simpleFactory;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static String getChartType(){
		try{
		//�����ĵ�����
		DocumentBuilderFactory dfactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = dfactory.newDocumentBuilder();
		Document doc = builder.parse(new File("src//simpleFactory//Config.xml"));
		
		//����xml����ȡ�ı��ڵ�
		NodeList list = doc.getElementsByTagName("chart");
		Node node = list.item(0).getFirstChild();
		String chartType = node.getNodeValue().trim();
		return chartType;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
