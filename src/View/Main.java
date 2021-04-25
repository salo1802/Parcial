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
		for(int i=0;i<5;i++) {
			prueba.OrdenarAtributo(i);
		}
		textAlign(LEFT,CENTER);
		textSize(40);
		fill(0);
		
	}
	
	@Override
	public void draw() {
	//prueba.draw(this);
		
	
	  
     
     

     
    
	}

 }

