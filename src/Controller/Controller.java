package Controller;

import Model.Logic;
import processing.core.PApplet;

public class Controller {
	
	public int button = 0;
	Logic logica;
	
	public Controller(PApplet app) {
		logica = new Logic();
		logica.crearLista(app);
		for(int i=0;i<5;i++) {
			logica.OrdenarAtributo(i);}
		logica.OrdenarAtributo(button);
	}
	
	public void draw(PApplet app) {
		logica.OrdenarAtributo(button);
		logica.draw(app);
		app.noStroke();
		app.fill(94,33,41,60);
		switch (button) {
		case 0:
		app.rect(150,40 , 75, 90);
		break;
		case 1:
			app.rect(315,40 , 240, 90);
			break;
		case 2:
			app.rect(630,40 , 370, 90);
			break;
		case 3:
			app.rect(960,40 , 270, 90);
			break;
		case 4:
			app.rect(1150,40 , 85, 90);
			break;
		}
	}
	
	public void Buttons(int mousex, int mousey) {
		if (mousey > 0 && mousey < 100) {
			if(mousex>100 && mousex<190) {button = 0;}
			if(mousex>190 && mousex<440) {button = 1;}
			if(mousex>440 && mousex<820) {button = 2;}
			if(mousex>820 && mousex<1100) {button = 3;}
			if(mousex>1100 && mousex<1190) {button = 4;}
		}}

}
