package objects;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseListener;

public class MouseBall extends Ball {
	MouseListener mouse;

	public MouseBall(int radius, Point position) {
		super(radius, position);
	}
	
	public void updatePos(){
		this.position = MouseInfo.getPointerInfo().getLocation();
	}

	public boolean isTouchingBall(Ball ball){
		double xDValue = Math.pow((this.position.getX() - ball.position.getX()), 2);
		double yDValue = Math.pow((this.position.getY() - ball.position.getY()), 2);
		double distance = Math.sqrt(xDValue + yDValue);
		return (distance < this.radius + ball.radius);
	}
}
