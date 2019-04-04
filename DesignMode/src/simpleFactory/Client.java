package simpleFactory;

public class Client {

	public static void main(String[] args) {
		Chart chart1;	
		chart1=ChartFactory.getChart("line");
		chart1.display();
		
		//下面的形式更好，符合开闭原则(对扩展开放，对修改关闭)
		Chart chart2;
		String type=XMLUtil.getChartType();
		chart2=ChartFactory.getChart(type);
		chart2.display();
	}

}
