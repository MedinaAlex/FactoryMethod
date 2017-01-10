package Button;

import javax.swing.JButton;

public class Theme1Factory implements FactoryButton{

	@Override
	public JButton createButton() {
		return new Theme1();
	}
}
