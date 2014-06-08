package world;

import javax.swing.JFrame;

public class View {
	JFrame frame;
	BallWorld bWorld;
	
	public View(){
		
	}
	
	public View (int width, int height){
		this.frame = new JFrame();
		this.frame.setSize(width, height);
		this.frame.setVisible(true);
		this.bWorld = new BallWorld(frame, 500, 500);
		this.bWorld.drawFBalls();
	}
	
	public void addBallWorld(){
		this.frame.add(this.bWorld);
	}
}
