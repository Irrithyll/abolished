package entities;

import graphics.Paint;

import java.awt.Image;

public class Hero {
	public boolean crouching = false;
	public boolean attacking = false;
	public Image frame;
	public int x = 50, y = 200;
	
	public Hero() {
		frame = Paint.image("hero");
	}
	
	public void walkRight(){
		if (crouching == false) {
			x += 5;
		}
	}
	
	public void walkLeft(){
		if (crouching == false) {
			x -= 5;
		}
	}
	
	public void jump() {
		
	}
	
	public void crouch() {
		frame = Paint.image("herocrouch");
		crouching = true;
	}
	
	public void releaseCrouch() {
		frame = Paint.image("hero");
		crouching = false;
	}
	
	
	public void stab() {
		if (crouching == true) {
			frame = Paint.image("herocrouchattack");
		} else {
			frame = Paint.image("heroattack");
		}
		
		attacking = true;
	}
	
	public void releaseStab(){
		if (crouching == true) {
			frame = Paint.image("herocrouch");
		} else {
			frame = Paint.image("hero");
		}
		
		attacking = false;
	}
}
