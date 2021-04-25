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
		size(400,400);
		 
		 
	}
	
	

	
	
	@Override
	public void setup() {
	
		prueba = new Logic();
		prueba.crearLista(this);
		System.out.println(prueba.getPrueba());
		 
	}
	
	@Override
	public void draw() {
	
	
	  
     
     

     
    
	}

 }

