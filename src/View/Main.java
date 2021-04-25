package View;


import Controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet{
	
	public static void main(String[] args) {
		PApplet.main("View.Main");
		
	}
	
	Controller prueba;
	
	@Override
	public void settings() {
		size(1200,695);
		 
		 
	}
	
	

	
	
	@Override
	public void setup() {
	
		prueba = new Controller(this);
		textAlign(LEFT,CENTER);
		imageMode(CENTER);
		textSize(40);
		fill(0);
		
	}
	
	@Override
	public void draw() {
		background(255);
	prueba.draw(this);}

	
	@Override
	public void mousePressed() {
	prueba.Buttons(mouseX, mouseY);
	}

	@Override
	public void mouseDragged() {
	prueba.Dragged(mouseY);
	}
	
	@Override
	public void mouseReleased() {
	prueba.Released(mouseY);
	}
}



