package simpleFactory;

public class Client {

	public static void main(String[] args) {
		Chart chart1;	
		chart1=ChartFactory.getChart("line");
		chart1.display();
		
		//�������ʽ���ã����Ͽ���ԭ��(����չ���ţ����޸Ĺر�)
		Chart chart2;
		String type=XMLUtil.getChartType();
		chart2=ChartFactory.getChart(type);
		chart2.display();
	}

}
