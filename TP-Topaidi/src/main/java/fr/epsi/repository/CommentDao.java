package fr.epsi.repository;

import java.util.List;

import fr.epsi.entite.Commentaire;
import fr.epsi.entite.Idee;
import fr.epsi.entite.Notation;

public interface CommentDao {

	void createcomment(Commentaire c);
	
	List<Commentaire> getComment(String Titre);
	

}
