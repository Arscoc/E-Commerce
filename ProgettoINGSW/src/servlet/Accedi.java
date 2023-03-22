package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.DataSource;
import database.UtenteDaoJDBC;
import database.dao.UtenteDao;
import struttura.Utente;


/**
 * Servlet implementation class Accedi
 */

@WebServlet("/Accedi")
public class Accedi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Accedi() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out= response.getWriter();
		
		try
		{
	     DataSource data = new DataSource();
		 UtenteDao utente = new UtenteDaoJDBC(data);
	     Utente u = new Utente();

	     u=utente.accedi(request.getParameter("email"),request.getParameter("password"));
	     HttpSession session=request.getSession();
	    
	     
	     if(u==null)
	   	    response.sendRedirect("accedi.html");    
	     else
	     {
	     session.setAttribute("utente",u.getNome()+" "+u.getCognome());
	     session.setAttribute("codiceFiscale",u.getCodiceFiscale());     
	     session.setAttribute("nome",u.getNome());
	     session.setAttribute("cognome",u.getCognome());
	     session.setAttribute("sesso",u.getSesso());
	     session.setAttribute("numeroTelefonico",u.getNumeroTelefonico());
	     session.setAttribute("email",u.getEmail());
	     session.setAttribute("password",u.getPassword());
	     session.setAttribute("gradoDiAccesso",u.getGradoDiAccesso());
		
	     response.sendRedirect("paginaPersonale.jsp");	
	     
	     }	
	     
	  } catch(Exception e) {e.getMessage();}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
