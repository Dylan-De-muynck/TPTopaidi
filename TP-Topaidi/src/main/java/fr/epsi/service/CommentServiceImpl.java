package fr.epsi.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Commentaire;
import fr.epsi.entite.Idee;
import fr.epsi.entite.Notation;
import fr.epsi.repository.CommentDao;
import fr.epsi.repository.CommentDaoImpl;
import fr.epsi.repository.IdeeDao;
import fr.epsi.repository.IdeeDaoImpl;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class CommentServiceImpl implements CommentService{

	//@PersistenceContext
	private EntityManager em;
	
	//@Resource
	private UserTransaction utx;
	
	public void createcomment(Commentaire c) {
		
		CommentDao dao = new CommentDaoImpl(em, utx);
		dao.createcomment(c);
		
	}
	
	public List<Commentaire> getComment(String Titre){

		CommentDao dao = new CommentDaoImpl(em, utx);
		return dao.getComment(Titre);
		
	}

}
