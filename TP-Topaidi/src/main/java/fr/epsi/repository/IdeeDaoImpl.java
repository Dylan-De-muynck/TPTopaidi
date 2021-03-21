package fr.epsi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Idee;
import fr.epsi.entite.Notation;

public class IdeeDaoImpl implements IdeeDao {

	EntityManager em;
	
	UserTransaction utx;
	
	public IdeeDaoImpl(EntityManager em, UserTransaction utx) {
		this.em = em;
		this.utx = utx;
	}
	
	public void create(Idee i) {
		
		try {
			utx.begin();
			em.persist(i);
			utx.commit();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RollbackException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (HeuristicMixedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (HeuristicRollbackException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}
	
	
	public List<Idee> getALLIdee() {
		
		return (List<Idee>) em.createQuery("select i from Idee i").getResultList();
		
	}
	
	public List<Idee> getIdee(String User) {
		
		return (List<Idee>) em.createQuery("select i from Idee i JOIN i.id n JOIN n.utilisateur u JOIN u where u.nom = :nom").setParameter("nom", User).getResultList();
		
	}
	
	public List<Notation> getListIdeeWithNote(String User){
		
		return em.createQuery("select n from Notation n", Notation.class).getResultList();
		
	}
	
	public List<Notation> getClassementTop(){
		
		return em.createQuery("select COUNT(n.notes) from Notation n", Notation.class).getResultList();
		
	}
}
