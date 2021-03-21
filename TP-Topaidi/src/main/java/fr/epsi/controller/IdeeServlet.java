package fr.epsi.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Idee;
import fr.epsi.entite.Notation;
import fr.epsi.entite.Notes;
import fr.epsi.service.CommentService;
import fr.epsi.service.IdeeService;
import fr.epsi.service.IdeeServiceImpl;

@WebServlet("/Idee")
public class IdeeServlet extends HttpServlet {

	//@EJB
	//private IdeeService service;
	
	@EJB
	private CommentService serviceC;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
        {
    	
    	// Commentaire
    	if (req.getParameter("Comment").isEmpty()) {
    		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Comment.jsp").forward(req, resp);
    		req.setAttribute("Titre", "");
    	} else {
    		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Comment.jsp").forward(req, resp);
    		req.setAttribute("Titre", serviceC.getComment(req.getParameter("Comment")));
    	}
    	
    	// List Idées
    	if (req.getParameter("User").isEmpty()) {
    		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ListIdeeNotee.jsp").forward(req, resp);
    		req.setAttribute("Idees", "");
    	} else {
    		req.setAttribute("User", req.getParameter("User"));
    		//req.setAttribute("Idees", service.getIdee(req.getParameter("User")));
    	}
    	
    	
    		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Home.jsp").forward(req, resp);
    	
        }

	
}
