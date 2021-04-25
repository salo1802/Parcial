package Model;

import java.util.Comparator;

public class NroLista implements Comparator<Peluditos>{

	@Override
	public int compare(Peluditos o1, Peluditos o2) {
		// TODO Auto-generated method stub
		return o1.getNroLista() - o2.getNroLista();
	}

}
