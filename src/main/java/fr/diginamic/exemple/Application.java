package fr.diginamic.exemple;

import fr.diginamic.exemple.daos.RechercherPopulationVillesDao;

public class Application {

	public static void main(String[] args) {
		RechercherPopulationVillesDao dao = new RechercherPopulationVillesDao();
		
		try {
			dao.extraireVilles("34");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
