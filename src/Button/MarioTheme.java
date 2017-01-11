package Button;

import javax.swing.JButton;

public class MarioTheme implements IThemeFactory{

	@Override
	public JButton createButton(String titre) {
		return new MarioThemeButton(titre);
	}

}
