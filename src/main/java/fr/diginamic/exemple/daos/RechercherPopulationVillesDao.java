package fr.diginamic.exemple.daos;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.exemple.entites.Ville;
import fr.diginamic.exemple.exceptions.CodeDeptNullException;

public class RechercherPopulationVillesDao {
	
	public List<Ville> extraireVilles(String codeDept) throws Exception {
		if(codeDept == null) {
			 throw new Exception("Attention je veux un codeDept");
		}
		List<Ville> villes = new ArrayList<Ville>();
		//TODO Accès BDD
	
		return villes;
	}
}
