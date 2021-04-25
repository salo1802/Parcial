package Model;

import java.util.Comparator;

public class Edad implements Comparator<Peluditos>{

	@Override
	public int compare(Peluditos o0, Peluditos o1) {
		// TODO Auto-generated method stub
		return o0.getEdad() - o1.getEdad();
	}

}
