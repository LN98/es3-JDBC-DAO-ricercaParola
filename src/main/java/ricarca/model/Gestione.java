package ricarca.model;

import ricerca.db.ParolaDAO;

public class Gestione {
	
	public int nParola(String s) {
		return ParolaDAO.nParole(s);
	}
	
	public int nParolaList(String s) {
		return ParolaDAO.nParoleList(s);
	}

}
