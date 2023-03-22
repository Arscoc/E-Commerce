package main;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import database.*;
import database.dao.ArticoloDao;
import database.dao.DesiderioDao;
import database.dao.OrdineDao;
import database.*;
import struttura.*;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException 
	{
		/*
		Utente utente1 = new Utente("ABCDE","Emanuela","Scarrigli","emanuel.scarriglia97@libero.it","*******","3881599593","UOMO","ADMIN");
		Indirizzo indirizzo1 = new Indirizzo(null,"Germani","Cosenza","84036","Via Louise Braille","1F",utente1.getCodiceFiscale());	
	    List<String> codiceArticoli = new ArrayList<String>();
	    codiceArticoli.add("CF12");
	    codiceArticoli.add("CFA");
	    codiceArticoli.add("CFA6");
	    List<Integer> quantità = new ArrayList<Integer>();
	    quantità.add(1);
	    quantità.add(2);
	    quantità.add(3);
		
	    try 
		{
			DataSource data = new DataSource();
			DesiderioDao listaDesideri = new DesiderioDaoJDBC(data);
			ArticoloDao articolo = new ArticoloDaoJDBC(data);
			OrdineDao ordine = new OrdineDaoJDBC(data);
			
			Ordine ordine1 = new Ordine(null,utente1.getCodiceFiscale(),codiceArticoli,quantità,
					"IN1",700);
			ordine.delete("0o1r7s4g0v3k");
			
		} catch (ClassNotFoundException e)  { e.printStackTrace(); }
		*/
		
		DataSource data = new DataSource();
		UtenteDaoJDBC udao = new UtenteDaoJDBC(data);
		udao.insert(new Utente("codfisc", "provarobert", "prova", "trans", "morto", "wind", "stocazzo@ciao.com", "*****", "Admin"));
	}

}
