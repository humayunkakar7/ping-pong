import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class MainMenu extends JFrame {
	private static final long serialVersionUID = 1L;

	int screenWidth = 250;
	int screenHeight = 200;

	int buttonWidth = 100;
	int buttonHeight = 40;
	int checkBoxWidth = 150;
	int checkBoxHeight = 40;

	static String userName;

	JFrame frame = new JFrame();

	JButton Play, Quit;
	ButtonGroup bg = new ButtonGroup();
	JRadioButton Level1, Level2, Level3;

	public MainMenu() {


		addButtons();
		addActions();

		getContentPane().setLayout(null);

		Play.setBounds((screenWidth - buttonWidth) / 2, 5, buttonWidth, buttonHeight); // Position the Play button
		Quit.setBounds((screenWidth - buttonWidth) / 2, 50, buttonWidth, buttonHeight); // Position the Quit button
		Level1.setBounds((screenWidth - buttonWidth) / 2, 85, checkBoxWidth, checkBoxHeight);
		Level2.setBounds((screenWidth - buttonWidth) / 2, 105, checkBoxWidth, checkBoxHeight);
		Level3.setBounds((screenWidth - buttonWidth) / 2, 125, checkBoxWidth, checkBoxHeight);

		//group radio buttons allowing only one button can be pressed
		bg.add(Level1);
		bg.add(Level2);
		bg.add(Level3);

		// Adding buttons to JFrame
		getContentPane().add(Play); 
		getContentPane().add(Quit); 
		add(Level1);
		add(Level2);
		add(Level3);

		// Framework for Main Menu  
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(screenWidth, screenHeight);
		setTitle("Pong Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	public void addButtons(){
		Play = new JButton("Play");
		Quit = new JButton("Quit");
		Level1 = new JRadioButton("Easy");
		Level2 = new JRadioButton("Intermediate");
		Level3 = new JRadioButton("Difficult");
	}

	//add actions to buttons


	public static void main(String[] args) {
		new MainMenu(); // Launch game
	}
}
