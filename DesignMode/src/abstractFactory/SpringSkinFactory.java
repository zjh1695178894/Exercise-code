package abstractFactory;

public class SpringSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		return new SpringButton();
	}

	@Override
	public TextField createTextFiled() {
		// TODO Auto-generated method stub
		return new SpringTextField();
	}

	@Override
	public ComboBox createComboBox() {
		// TODO Auto-generated method stub
		return new SpringComboBox();
	}

}
