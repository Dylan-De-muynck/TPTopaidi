package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Commentaire;
import fr.epsi.entite.Idee;
import fr.epsi.entite.Notation;

public interface CommentService {

	void createcomment(Commentaire c);
	
	List<Commentaire> getComment(String Titre);
	
	
}
