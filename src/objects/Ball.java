package objects;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Ball {
	Point position;
	int radius;
	
	public Ball (){
		this.position = null;
		this.radius = 0;
	}
	
	public Ball(int radius, Point position){
		this.position = position;
		this.radius = radius;
	}
	
	public void drawBall(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.drawOval(this.position.x, this.position.y, this.radius, this.radius);
	}
	
	public Point getPosition(){
		return this.position;
	}
	
	public void setPosition(Point pos){
		this.position = pos;
	}
	
	public int getRadius(){
		return this.radius;
	}
}
