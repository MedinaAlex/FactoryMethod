package Button;

import javax.swing.JButton;

public class Theme2Factory implements FactoryButton{

	@Override
	public JButton createButton() {
		return new Theme2();
	}

	
}
