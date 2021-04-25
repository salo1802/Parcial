package Model;

public class Peluditos {

	public int id;
	public int nroLista;
	public String nombre;
	public String raza;
	public String fechaNA;
	public int edad;
	
	public Peluditos(int id, String nombre, String raza, String fechaNA, int edad) {
		this.id = id;
		nroLista = id;
		this.nombre = nombre;
		this.raza = raza;
		this.fechaNA =  fechaNA;
		this.edad = edad;
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
	
	
	public int idCompareTo(Peluditos nextPeluditos) {
		return this.id - nextPeluditos.getId();
	}
	
	public int edadCompareTo(Peluditos nextPeluditos) {
		return this.id - nextPeluditos.getId();
	}
	
	
}
