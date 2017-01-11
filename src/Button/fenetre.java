package Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class fenetre extends JFrame{

	public fenetre(){
		this.setTitle("button");
	    this.setSize(300, 200);              
	 
	    JPanel pan = new JPanel();
	    
	    JComboBox<String> box = new JComboBox<>();
	    box.addItem("Mario");
	    box.addItem("StarWars");
	    
	    pan.add(box);
	    
	   /* IThemeFactory bouton = new MarioTheme();
		JButton mybouton = bouton.createButton("Mario"); // Ajout d'un bouton au début
		pan.add(mybouton); */
	    
	    box.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton mybouton;
				if(box.getSelectedItem().equals("Mario")){
					IThemeFactory bouton = new MarioTheme();
					mybouton = bouton.createButton("Mario");
				}
				else {
					IThemeFactory bouton = new StarWarsTheme();
				    mybouton = bouton.createButton("StarWars");
				}
								
				try {
					pan.remove(1); // moche
				} catch (Exception e2) {
					// Bouton inexistant lors du premier appuie 
				}
				
				pan.add(mybouton);
				pan.repaint();
				pan.revalidate();
				
			}
		});
	    
	    this.setContentPane(pan);               
	    this.setVisible(true);
	}
	
	public static void main(String[] args){
		JFrame fenetre = new fenetre();
	}
}
