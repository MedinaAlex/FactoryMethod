package AbstractFactory;

import javax.swing.JButton;

public class StarWarsTheme implements IThemeFactory{

	@Override
	public JButton createButton() {
		return new StarWarsThemeButton();
	}
}
