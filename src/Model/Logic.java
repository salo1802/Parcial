package Model;

import java.util.ArrayList;
import java.util.Arrays;

import processing.core.PApplet;

public class Logic {
	
	
	public int[]  prueba;
	public ArrayList <Peluditos> peluditos;
	
	public Logic() {
	
		peluditos = new ArrayList<>();
		
		
	}

	
	public void crearLista (PApplet app) {
		String[] texto1;
		String[] texto2;
		String[] lineas1;
		String[] lineas2;
		
		texto1 = app.loadStrings("imports/1.txt");
		texto2 = app.loadStrings("imports/2.txt");
		ArrayList <String> palabras1;
		palabras1 = new ArrayList<>();
		ArrayList <String> palabras2;
		palabras2 = new ArrayList<>();
		
		//crear y organizar las dos listas de texto
		for (int i = 0; i < texto1.length; i++) {
			lineas1 = PApplet.split(texto1[i], " ");
			for (int j = 0; j < lineas1.length; j++) {
				palabras1.add(lineas1[j]);
				}}
		
		
		for (int i = 0; i < texto2.length; i++) {
			Arrays.sort(texto2);
			lineas2 = PApplet.split(texto2[i], " ");
				
			for (int j = 0; j < lineas2.length; j++) {
				palabras2.add(lineas2[j]);}}
		
		//crear los objetos de peludito
			
		for (int i = 0; i < 5; i++) {
			int id = 0;
			int edad = 0;
			int dia = 0;
			int mes = 0;
			int año = 0;
			int [] nrosFecha = null;
			String fecha = null;
			String nombre = null; 
			String raza = null;
			Peluditos actual;
		for (int j = 0; j < palabras1.size();j++) {
			int index = j;
			if(j%2 == 0) {
				id = Integer.parseInt(palabras1.get(j));
				nombre = palabras1.get(index+1);}}
		for (int j = 0; j < palabras2.size();j++) {
			int index = j;
			if(j%3 == 0) {
				raza = palabras2.get(index+1);
				fecha = palabras2.get(index+2);
				nrosFecha = PApplet.parseInt(PApplet.split(fecha, "-"));
			dia=nrosFecha[0];
			mes=nrosFecha[1];
			año=nrosFecha[2];}}
		if(mes>=app.month()) {
			if(dia>=app.day()) {
			edad =	app.year()-año;
			}} else { edad = app.year()-(año+1);}
		actual = new Peluditos(id, nombre, raza, fecha,edad);
		peluditos.add(actual);
		}	
		
		//creación de los nuevos TXT
		
		
		
		
			
		}
				
		public void OrdenarAtributo(int botón) {
			
		}
		
			
			
 
	
		public ArrayList<Peluditos> getPrueba() {
			return peluditos;
		}
	}

		
		

	



	

