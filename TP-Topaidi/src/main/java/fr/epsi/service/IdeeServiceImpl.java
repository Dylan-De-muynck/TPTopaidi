package fr.epsi.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Idee;
import fr.epsi.entite.Notation;
import fr.epsi.entite.Notes;
import fr.epsi.repository.IdeeDao;
import fr.epsi.repository.IdeeDaoImpl;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class IdeeServiceImpl implements IdeeService{

	@PersistenceContext
	private EntityManager em;
	
	@Resource
	private UserTransaction utx;
	
	public void createidee(Idee i) {
		IdeeDao dao = new IdeeDaoImpl(em, utx);
		dao.create(i);
		System.out.println(i.getTitre());
		
	}
	
	public List<Idee> getALLIdee(){
		IdeeDao dao = new IdeeDaoImpl(em, utx);
		return dao.getALLIdee();
	}
	
	public List<Idee> getIdee(String User){

		IdeeDao dao = new IdeeDaoImpl(em, utx);
		return dao.getIdee(User);
		
	}
	
	public List<Notation> getListIdeeWithNote(String User){
		IdeeDao dao = new IdeeDaoImpl(em, utx);
		return dao.getListIdeeWithNote(User);
	}
	
	public List<Notation> getClassementTop(){
		IdeeDao dao = new IdeeDaoImpl(em, utx);
		List<Notation> NoteTop = dao.getClassementTop();
		for (Notation notes : NoteTop) {
			
			if (notes.getNotes() == Notes.Top) {
				
			}
				
				
		}
		
		return NoteTop;
		
	}
	
	
}
