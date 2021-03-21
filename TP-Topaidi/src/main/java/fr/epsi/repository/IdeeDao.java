package fr.epsi.repository;

import java.util.List;

import fr.epsi.entite.Idee;
import fr.epsi.entite.Notation;

public interface IdeeDao {

	void create(Idee i);
	
	List<Idee> getALLIdee();
	
	List<Idee> getIdee(String User);
	
	List<Notation> getListIdeeWithNote(String User);
	
	List<Notation> getClassementTop();

}
