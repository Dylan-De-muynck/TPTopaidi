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

import fr.epsi.entite.Idee;
import fr.epsi.entite.Notation;
import fr.epsi.entite.Utilisateur;
import fr.epsi.repository.IdeeDao;
import fr.epsi.repository.IdeeDaoImpl;
import fr.epsi.repository.UserDao;
import fr.epsi.repository.UserDaoImpl;

//@Stateless
//@TransactionManagement(TransactionManagementType.BEAN)
public class UserServiceImpl implements UserService{

	//@PersistenceContext
	private EntityManager em;
	
	//@Resource
	private UserTransaction utx;
	
	public void createUser(Utilisateur u) {
		
		UserDao dao = new UserDaoImpl(em, utx);
		dao.createUser(u);
		
	}
	
	public Utilisateur getUser(String User){

		UserDao dao = new UserDaoImpl(em, utx);
		return dao.getUser(User);
		
	}

}
