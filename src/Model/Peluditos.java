package Model;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Peluditos implements Comparable<Peluditos>{

	public int id;
	public int nroLista;
	public String nombre;
	public String raza;
	public String fechaNA;
	public int edad;
	public int y;
	PImage foto;
	
	public Peluditos(int id, String nombre, String raza, String fechaNA, int edad,PApplet app) {
		this.id = id;
		nroLista = id;
		this.nombre = nombre;
		this.raza = raza;
		this.fechaNA =  fechaNA;
		this.edad = edad;
		foto = app.loadImage("/imports/"+id+".png");
	}
	
	public void pintarPeludito(PApplet app) {
	y = (nroLista*100)+50;
	app.rectMode(PConstants.CENTER);
	app.stroke(0);
	app.strokeWeight(10);
	app.fill(255);
	app.rect(700, y-10, 1400, 100);
	app.rect(70, y-10, 70, 100);
	app.line(190, y-60, 190, y+40);
	app.line(440, y-60, 440, y+40);
	app.line(820, y-60, 820, y+40);
	app.line(1100, y-60,1100, y+40);
	app.line(1195, y-60,1195, y+40);
	app.fill(0);
	app.textAlign(PConstants.CENTER);
	app.text(""+id, 150, y);
	app.textAlign(PConstants.LEFT);
	app.text(nombre, 200, y);
	app.text(raza, 450, y);
	app.textAlign(PConstants.CENTER);
	app.text(fechaNA, 950, y);	
	app.text(""+edad, 1150, y);
	app.fill(255,182,174);
	
	app.circle(50, y-10, 100);
	app.image(foto, 50, y);
	
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getFechaNA() {
		return fechaNA;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getNroLista() {
		return nroLista;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public void setNroLista(int nroLista) {
		this.nroLista = nroLista;
	}
		
	public void setFechaNA(String fechaNA) {
		this.fechaNA = fechaNA;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int compareTo(Peluditos nextPeluditos) {
		return this.id - nextPeluditos.getId();
	}
}
