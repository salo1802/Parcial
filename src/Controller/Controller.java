package Controller;

import Model.Logic;
import processing.core.PApplet;

public class Controller {
	
	public int button = 0;
	public boolean ordenboton;
	public int selected;
	Logic logica;
	
	public Controller(PApplet app) {
		logica = new Logic();
		logica.crearLista(app);
		for(int i=0;i<5;i++) {
			logica.OrdenarAtributo(i);}
		logica.OrdenarAtributo(button);
	}
	
	public void draw(PApplet app) {
		logica.draw(app);
		app.noStroke();
		app.fill(94,33,41,60);
		if(ordenboton==true) {logica.OrdenarAtributo(button);}
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
		logica.ordenarPorlista();
		ordenboton= true;
		if (mousey > 0 && mousey < 100) {
			if(mousex>100 && mousex<190) {button = 0;}
			if(mousex>190 && mousex<440) {button = 1;}
			if(mousex>440 && mousex<820) {button = 2;}
			if(mousex>820 && mousex<1100) {button = 3;}
			if(mousex>1100 && mousex<1190) {button = 4;}
		}
		
		
	
	}
	
	public void Dragged(int mouseY) {
		ordenboton = false;
		if(mouseY> 100 && mouseY> 200) {selected=1;}
		if(mouseY> 200 && mouseY> 300) {selected=2;}
		if(mouseY> 300 && mouseY> 400) {selected=3;}
		if(mouseY> 400 && mouseY> 500) {selected=4;}
		if(mouseY> 500 && mouseY> 600) {selected=5;}
	//movimientos del primero en la lista
		if(selected == 1){
		if(mouseY>200&&mouseY<300) {
		logica.peluditos.get(1).setNroLista(1);
		logica.peluditos.get(0).setNroLista(2);}
		if(mouseY>300&&mouseY<400) {
		logica.peluditos.get(1).setNroLista(1);
		logica.peluditos.get(2).setNroLista(2);
		logica.peluditos.get(0).setNroLista(3);
		logica.peluditos.get(3).setNroLista(4);
		logica.peluditos.get(4).setNroLista(5);}
		if(mouseY>400&&mouseY<500) {
		logica.peluditos.get(1).setNroLista(1);
		logica.peluditos.get(2).setNroLista(2);
		logica.peluditos.get(3).setNroLista(3);
		logica.peluditos.get(0).setNroLista(4);
		logica.peluditos.get(4).setNroLista(5);}
		if(mouseY>500) {
		logica.peluditos.get(1).setNroLista(1);
		logica.peluditos.get(2).setNroLista(2);
		logica.peluditos.get(3).setNroLista(3);
		logica.peluditos.get(4).setNroLista(4);
		logica.peluditos.get(0).setNroLista(5);}}
		
		if(selected == 2){
			if(mouseY>100&&mouseY<200) {
			logica.peluditos.get(0).setNroLista(2);
			logica.peluditos.get(1).setNroLista(1);}
			if(mouseY>300&&mouseY<400) {
			logica.peluditos.get(1).setNroLista(3);
			logica.peluditos.get(2).setNroLista(2);
			logica.peluditos.get(0).setNroLista(1);}
			if(mouseY>400&&mouseY<500) {
			logica.peluditos.get(1).setNroLista(4);
			logica.peluditos.get(2).setNroLista(2);
			logica.peluditos.get(3).setNroLista(3);
			logica.peluditos.get(0).setNroLista(1);}
			if(mouseY>500) {
			logica.peluditos.get(2).setNroLista(2);
			logica.peluditos.get(3).setNroLista(3);
			logica.peluditos.get(4).setNroLista(4);
			logica.peluditos.get(1).setNroLista(5);
			logica.peluditos.get(0).setNroLista(1);}}
		
		if(selected == 3){
			if(mouseY>100&&mouseY<200) {
			logica.peluditos.get(2).setNroLista(1);
			logica.peluditos.get(0).setNroLista(2);
			logica.peluditos.get(1).setNroLista(3);}
			if(mouseY>200&&mouseY<300) {
			logica.peluditos.get(1).setNroLista(3);
			logica.peluditos.get(2).setNroLista(2);
			logica.peluditos.get(0).setNroLista(1);}
			if(mouseY>400&&mouseY<500) {
			logica.peluditos.get(2).setNroLista(4);
			logica.peluditos.get(1).setNroLista(2);
			logica.peluditos.get(3).setNroLista(3);
			logica.peluditos.get(0).setNroLista(1);}
			if(mouseY>500) {
			logica.peluditos.get(2).setNroLista(5);
			logica.peluditos.get(3).setNroLista(3);
			logica.peluditos.get(4).setNroLista(4);
			logica.peluditos.get(1).setNroLista(2);
			logica.peluditos.get(0).setNroLista(1);}}
		
	
		if(selected == 4){
			if(mouseY>100&&mouseY<200) {
			logica.peluditos.get(3).setNroLista(1);
			logica.peluditos.get(0).setNroLista(2);
			logica.peluditos.get(1).setNroLista(3);
			logica.peluditos.get(2).setNroLista(4);}
			if(mouseY>200&&mouseY<300) {
			logica.peluditos.get(0).setNroLista(1);
			logica.peluditos.get(1).setNroLista(3);
			logica.peluditos.get(3).setNroLista(2);}
			if(mouseY>300&&mouseY<400) {
			logica.peluditos.get(0).setNroLista(1);
			logica.peluditos.get(1).setNroLista(2);
			logica.peluditos.get(2).setNroLista(4);
			logica.peluditos.get(3).setNroLista(3);}
			if(mouseY>500) {
			logica.peluditos.get(0).setNroLista(1);
			logica.peluditos.get(1).setNroLista(2);
			logica.peluditos.get(2).setNroLista(3);
			logica.peluditos.get(3).setNroLista(5);
			logica.peluditos.get(4).setNroLista(4);}}
	
		
		if(selected == 5){
			if(mouseY>100&&mouseY<200) {
			logica.peluditos.get(4).setNroLista(1);
			logica.peluditos.get(0).setNroLista(2);
			logica.peluditos.get(1).setNroLista(3);
			logica.peluditos.get(2).setNroLista(4);
			logica.peluditos.get(3).setNroLista(5);}
			if(mouseY>200&&mouseY<300) {
			logica.peluditos.get(0).setNroLista(1);
			logica.peluditos.get(1).setNroLista(3);
			logica.peluditos.get(4).setNroLista(2);
			logica.peluditos.get(3).setNroLista(5);
			logica.peluditos.get(2).setNroLista(4);}
			if(mouseY>300&&mouseY<400) {
			logica.peluditos.get(0).setNroLista(1);
			logica.peluditos.get(1).setNroLista(2);
			logica.peluditos.get(4).setNroLista(3);
			logica.peluditos.get(2).setNroLista(3);
			logica.peluditos.get(3).setNroLista(5);}
			if(mouseY>400&&mouseY<500) {
			logica.peluditos.get(0).setNroLista(1);
			logica.peluditos.get(1).setNroLista(2);
			logica.peluditos.get(2).setNroLista(3);
			logica.peluditos.get(3).setNroLista(5);
			logica.peluditos.get(4).setNroLista(3);}}
	
	}
	

}
