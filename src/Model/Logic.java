package Model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import processing.core.PApplet;

public class Logic {
	
	
	public int  prueba;
	public ArrayList <Peluditos> peluditos;
	
	
	public Logic() {
	
		peluditos = new ArrayList<Peluditos>();
		
		
	}
	
	public void draw(PApplet app){
		for(int i=0; i< peluditos.size();i++) {
			Peluditos actual;
			actual = peluditos.get(i);
			actual.pintarPeludito(app);
		}
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
			int index = i;
			int id = 0;
			int edad = 0;
			int dia = 0;
			int mes = 0;
			int a�o = 0;
			int [] nrosFecha = null;
			String fecha = null;
			String nombre = null; 
			String raza = null;
			Peluditos actual;
		
			id = Integer.parseInt(palabras1.get(index*2));
				nombre = palabras1.get((index*2)+1);
		
				raza = palabras2.get(index*3+1);
				fecha = palabras2.get(index*3+2);
				nrosFecha = PApplet.parseInt(PApplet.split(fecha, "-"));
			dia=nrosFecha[0];
			mes=nrosFecha[1];
			a�o=nrosFecha[2];
			
		if(mes<=app.month()) {
			if(dia<=app.day()) {
			edad =	app.year()-a�o;
			}} else { edad = app.year()-(a�o+1);}
		actual = new Peluditos(id, nombre, raza, fecha,edad);
		peluditos.add(actual);
		}	
		
		
		
		
		
		
			
		}
				
		public void OrdenarAtributo(int bot�n) {
			
			Nombre n = null;
			Raza r = null;
			Fecha f = null;
			Edad ed = null;
			n =  new Nombre();
			r = new Raza();
			f = new Fecha();
			ed =  new Edad();
			
			
			//creaci�n de los nuevos TXT
			switch (bot�n) {
			case 0:
			//por ID
			Collections.sort(peluditos);
			File file = new File ("./data/exports/ordenPorId.txt");
			try {
				FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);
				for(int i=0;i<peluditos.size();i++) {
					bw.write(peluditos.get(i).getId()+"    "+peluditos.get(i).getNombre()+"    "+peluditos.get(i).getRaza()+" "
							+peluditos.get(i).getFechaNA()	+ "   "+"    "+peluditos.get(i).getEdad());
					bw.newLine();

				}
				
				bw.close();
			}
			catch(IOException e) {
				
			}
			break;
			
			
			
		case 1:
		//por nombre
		Collections.sort(peluditos, n);
		File file1 = new File ("./data/exports/ordenPorNombre.txt");
		try {
			FileWriter fw = new FileWriter(file1);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0;i<peluditos.size();i++) {
				bw.write(peluditos.get(i).getId()+"    "+peluditos.get(i).getNombre()+"    "+peluditos.get(i).getRaza()+" "
						+peluditos.get(i).getFechaNA()	+ "   "+"    "+peluditos.get(i).getEdad());
				bw.newLine();

			}
			
			bw.close();
		}
		catch(IOException e) {
			
		}
		break;
		
		case 2:
			//por raza
			Collections.sort(peluditos, r);
			File file2 = new File ("./data/exports/ordenPorRaza.txt");
			try {
				FileWriter fw = new FileWriter(file2);
				BufferedWriter bw = new BufferedWriter(fw);
				for(int i=0;i<peluditos.size();i++) {
					bw.write(peluditos.get(i).getId()+"    "+peluditos.get(i).getNombre()+"    "+peluditos.get(i).getRaza()+" "
							+peluditos.get(i).getFechaNA()	+ "   "+"    "+peluditos.get(i).getEdad());
					bw.newLine();

				}
				
				bw.close();
			}
			catch(IOException e) {
				
			}
			break;
			
					
		case 3:
			//por edad
			Collections.sort(peluditos, ed);
			File file4 = new File ("./data/exports/ordenPorEdad.txt"); 
			try {
				FileWriter fw = new FileWriter(file4);
				BufferedWriter bw = new BufferedWriter(fw);
				for(int i=0;i<peluditos.size();i++) {
					bw.write(peluditos.get(i).getId()+"    "+peluditos.get(i).getNombre()+"    "+peluditos.get(i).getRaza()+" "
							+peluditos.get(i).getFechaNA()	+ "   "+"    "+peluditos.get(i).getEdad());
					bw.newLine();
					System.out.println(peluditos.get(i).getEdad());
				}
				
				bw.close();
			}
			catch(IOException e) {
				
			}
			break;
		
		case 4:
			//por fecha
			String[] fecha;

			for(int i=0;i<5;i++) {
			fecha = PApplet.split(peluditos.get(i).getFechaNA(), "-");
			peluditos.get(i).setFechaNA(""+fecha[2]+"-"+fecha[1]+"-"+fecha[0]);}
			
			Collections.sort(peluditos, f);
			
			for(int i=0;i<5;i++) {
				fecha = PApplet.split(peluditos.get(i).getFechaNA(), "-");
				peluditos.get(i).setFechaNA(""+fecha[2]+"-"+fecha[1]+"-"+fecha[0]);}
			
			File file3 = new File ("./data/exports/ordenPorFecha.txt");
			try {
				FileWriter fw = new FileWriter(file3);
				BufferedWriter bw = new BufferedWriter(fw);
				for(int i=0;i<peluditos.size();i++) {
					bw.write(peluditos.get(i).getId()+"    "+peluditos.get(i).getNombre()+"    "+peluditos.get(i).getRaza()+" "
							+peluditos.get(i).getFechaNA()	+ "   "+"    "+peluditos.get(i).getEdad());
					bw.newLine();

				}
				
				bw.close();
			}
			catch(IOException e) {
				
			}
			break;

			
			}}
		
			
			
 
	
		public int getPrueba(int i) {
			return prueba;
		}
	}

		
		

	



	

