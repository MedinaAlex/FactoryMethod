package Button;

import javax.swing.JButton;

public class StarWarsTheme implements IThemeFactory{

	@Override
	public JButton createButton(String titre) {
		return new StarWarsThemeButton(titre);
	}
}
