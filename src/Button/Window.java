package Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame{
	
	ArrayList<IThemeFactory> model = new ArrayList<>();

	public Window(){
		this.setTitle("button");
	    this.setSize(300, 200);              
	 
	    JPanel pan = new JPanel();

	    model.add(new MarioTheme());
		model.add(new StarWarsTheme());
	    
	    JComboBox<String> box = new JComboBox<>();
	    box.addItem("Theme Mario");
	    box.addItem("Theme StarWars");
	    
	    pan.add(box);
	    
	    box.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {		
				try {
					pan.remove(1); // moche
				} catch (Exception e2) {
					// Bouton inexistant lors du premier appuie 
				}
				
				pan.add(model.get(box.getSelectedIndex()).createButton());
				pan.repaint();
				pan.revalidate();
				
			}
		});
	    
	    this.setContentPane(pan);               
	    this.setVisible(true);
	}
	
	public static void main(String[] args){
		JFrame fenetre = new Window();
	}
}
