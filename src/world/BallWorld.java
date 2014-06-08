package world;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Vector;

import javax.swing.JWindow;

import objects.*;

public class BallWorld extends JWindow{
	int width;
	int height;
	MouseBall mBall;
	Vector<FloatingBall> fBalls;
	Graphics g;
	
	
	public BallWorld(Frame owner, int width, int height){
		super(owner);
		this.width = width;
		this.height = height;
		this.addFBall();
	}
	
	public boolean isGameOver(){
		for (FloatingBall ball: this.fBalls){
			if (mBall.isTouchingBall(ball))
				return true;
		}
		return false;
	}
	
	public void handleCollisions(){
		for (FloatingBall ball1: this.fBalls){
			for (FloatingBall ball2: this.fBalls){
				double xDValue = Math.pow((ball1.getPosition().getX() - ball2.getPosition().getX()), 2);
				double yDValue = Math.pow((ball1.getPosition().getY() - ball2.getPosition().getY()), 2);
				double distance = Math.sqrt(xDValue + yDValue);
				if (distance < ball1.getRadius() + ball2.getRadius()){
					this.collide(ball1, ball2);
				}
			}
		}
	}

	private void collide(FloatingBall ball1, FloatingBall ball2) {
		
	}
	
	public void updateFBallPositions(){
		for (FloatingBall ball: this.fBalls){
			if (ball.getPosition().getX() <= 0 || ball.getPosition().getX() >= this.width)
				ball.HitLeftRightEdge();
			if (ball.getPosition().getY() <= 0 || ball.getPosition().getY() >= this.height)
				ball.HitTopBottomEdge();
			ball.updatePos();
		}
	}
	
	public void addFBall(){
		Point pos = null;
		int xdir = (int) (Math.random() * 10);
		int ydir = 10 - xdir;
		FloatingBall ball = new FloatingBall(5, pos, xdir, ydir);
		this.fBalls.add(ball);
	}
	
	public void drawFBalls(){
		if (!this.fBalls.isEmpty())
			for (FloatingBall ball: this.fBalls){
				ball.drawBall(g);
			}
	}
}
