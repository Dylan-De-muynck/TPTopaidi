package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Idee;
import fr.epsi.entite.Notation;

public interface IdeeService {

	void createidee(Idee i);
	
	List<Idee> getALLIdee();
	
	List<Idee> getIdee(String User);
	
	List<Notation> getListIdeeWithNote(String User);
	
	List<Notation> getClassementTop();
}
