package Model;

import java.util.Comparator;

public class Raza implements Comparator<Peluditos>{

	@Override
	public int compare(Peluditos o1, Peluditos o2) {
		// TODO Auto-generated method stub
		return o1.getRaza().compareTo(o2.getRaza());
	}

}
