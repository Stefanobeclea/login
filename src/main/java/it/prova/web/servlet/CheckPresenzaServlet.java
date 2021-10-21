package it.prova.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.web.model.Persona;


@WebServlet("/CheckPresenzaServlet")
public class CheckPresenzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CheckPresenzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Creo una persona solo per la verifica
		Persona personaConosciuta = new Persona("Mario", "Rossi");		
		
		//Ottengo il nome e il cognome dati in input grazie al getParameter
		String nome = request.getParameter("nomeInput");
		String cognome = request.getParameter("cognomeInput");
		
		//creo l'oggetto persona e gli passo i campi di input presi dal client
		Persona personaInput = new Persona(nome, cognome);
		
		//faccio il confronto tra la persona che conosco e quella data in input
		if(personaConosciuta.getNome().equalsIgnoreCase(personaInput.getNome()) && 
				personaConosciuta.getCognome().equalsIgnoreCase(personaInput.getCognome())) {
			request.setAttribute("personaAttribute", personaInput);
			RequestDispatcher rd = request.getRequestDispatcher("riconosciuto.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("personaAttribute", personaInput);
			RequestDispatcher rd = request.getRequestDispatcher("sconosciuto.jsp");
			rd.forward(request, response);
		}
		
		
	}

}
