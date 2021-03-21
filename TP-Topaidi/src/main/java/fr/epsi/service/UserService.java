package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Idee;
import fr.epsi.entite.Notation;
import fr.epsi.entite.Utilisateur;

public interface UserService {

	void createUser(Utilisateur u); // Pas utilisé
	
	Utilisateur getUser(String User);
	
	
}
