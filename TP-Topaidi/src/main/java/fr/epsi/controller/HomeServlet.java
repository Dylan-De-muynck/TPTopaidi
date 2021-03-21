package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Idee;
import fr.epsi.service.IdeeService;


public class HomeServlet extends HttpServlet {

	@EJB
	private IdeeService service;
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
        {
    	
		//req.setAttribute("username", req.getUserPrincipal());
		//req.setAttribute("isAdmin", req.isUserInRole("ADMIN"));
    	
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Home.jsp").forward(req, resp);
		req.setAttribute("Idees", service.getALLIdee());
		
    		if(req.isUserInRole("ADMIN"))
    		{
    			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Home.jsp").forward(req, resp);
    		} else {
    			//this.getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
    		
    		}
    	
        }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
        {
    		// CONNEXION 
	    	 if (req.getParameter("actionPost").equals("formUser")) {
	    		
	    		 req.getParameter("User");

	    	}
    	}
}
