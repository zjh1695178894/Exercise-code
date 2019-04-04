package abstractFactory;

public class SummerSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		return new SummerButton();
	}

	@Override
	public TextField createTextFiled() {
		// TODO Auto-generated method stub
		return new SummerTextField();
	}

	@Override
	public ComboBox createComboBox() {
		// TODO Auto-generated method stub
		return new SummerComboBox();
	}

}
