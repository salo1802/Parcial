package View;


import Model.Logic;
import processing.core.PApplet;

public class Main extends PApplet{
	
	public static void main(String[] args) {
		PApplet.main("View.Main");
		
	}
	
	Logic prueba;
	
	@Override
	public void settings() {
		size(1200,595);
		 
		 
	}
	
	

	
	
	@Override
	public void setup() {
	
		prueba = new Logic();
		prueba.crearLista(this);
		System.out.println(prueba.getPrueba(4));
		textAlign(LEFT,CENTER);
		textSize(40);
		fill(0);
		
	}
	
	@Override
	public void draw() {
	prueba.draw(this);
		
	
	  
     
     

     
    
	}

 }

