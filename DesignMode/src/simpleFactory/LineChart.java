package simpleFactory;

public class LineChart implements Chart {
	public LineChart(){
		System.out.println("��������ͼ");
	}
	@Override
	public void display() {
		System.out.println("��ʾ����ͼ");
	}

}
