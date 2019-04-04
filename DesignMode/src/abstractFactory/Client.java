package abstractFactory;

public class Client {
	public static void main(String args[]){
		SkinFactory factory =(SkinFactory) XMLUtil.getBean();
		Button bt = factory.createButton();
		ComboBox cb = factory.createComboBox();
		TextField tf = factory.createTextFiled();
		bt.display();
		cb.display();
		tf.display();
	}
}
