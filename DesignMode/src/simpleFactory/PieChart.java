package simpleFactory;

public class PieChart implements Chart {
	public PieChart(){
		System.out.println("´´½¨±ý×´Í¼");
	}
	@Override
	public void display() {
		System.out.println("ÏÔÊ¾±ý×´Í¼");
	}

}
