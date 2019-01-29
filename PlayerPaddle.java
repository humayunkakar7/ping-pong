import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class PlayerPaddle {
	int x;
	int y;
	static int width = 20 ;
	static int height = 50;
	
	int speed = 3; 

	//paddle going up or down conditions
	boolean goingUp = false;
	boolean goingDown = false;
	
	Rectangle boundingBox; 
	

	public PlayerPaddle(int x, int y){
		this.x = x;
		this.y = y;
		
		//create a rectangular box that fits the paddle so that the ball would bounce away 
		boundingBox = new Rectangle(x, y, width, height);
		boundingBox.setBounds(x, y, width, height);
	}

}
