package objects;

import java.awt.Point;

public class FloatingBall extends Ball {
	int xDirection;
	int yDirection;
	
	public FloatingBall(int radius, Point position, int xdir, int ydir) {
		super(radius, position);
		this.xDirection = xdir;
		this.yDirection = ydir;
	}
	
	public void updatePos(){
		this.position.x += xDirection;
		this.position.y += yDirection;
	}
	
	public void ifHitTopBottomEdge(){
		yDirection = -yDirection;
	}
	
	public void ifHitLeftRightEdge(){
		xDirection = -xDirection;
	}
	
	public int getXDirection(){
		return this.xDirection;
	}
	
	public void setXDirection(int xDir){
		this.xDirection = xDir;
	}
	
	public int getYDirection(){
		return this.yDirection;
	}
	
	public void setYDirection(int yDir){
		this.yDirection = yDir;
	}
}
