package fr.epsi.repository;

import java.util.List;

import fr.epsi.entite.Idee;
import fr.epsi.entite.Notation;
import fr.epsi.entite.Utilisateur;

public interface UserDao {

	void createUser(Utilisateur u);
	
	Utilisateur getUser(String User);

}
