package Model;

import java.util.Comparator;

public class Nombre implements Comparator<Peluditos>{

	@Override
	public int compare(Peluditos o1, Peluditos o2) {
		
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
