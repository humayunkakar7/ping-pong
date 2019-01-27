import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InputHandler implements KeyListener {

	JFrame frame = new JFrame();

	public InputHandler(Game game){
		//adds the handler to the frame and whenever the screen is selected, it'll listen for keys
		game.addKeyListener(this);
	}



	public void keyTyped(KeyEvent e) {

	}

}
