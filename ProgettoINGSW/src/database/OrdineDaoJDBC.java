package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import database.dao.OrdineDao;
import struttura.Ordine;

public class OrdineDaoJDBC implements OrdineDao {

	DataSource dataSource;
	
	public OrdineDaoJDBC(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	
	@Override
	public void insert(Ordine ordine) 
	{
		boolean controllaDuplicato = true;
		String idOrdine = "";
		
		while(controllaDuplicato)
		{
			idOrdine = creaChiave();
			controllaDuplicato = trovaOrdine(idOrdine);
		}	
		
		String articoli = "{"; //lista di articoli
		String quantità = "{";
		
		for(int i=0;i<ordine.getCodArticoli().size();i++)
			{
			  if(i+1< ordine.getCodArticoli().size())
				 {
				  articoli+=ordine.getCodArticoli().get(i)+",";
				  quantità+=ordine.getQuantità().get(i)+",";
				 }
			  else 
				 {
				  articoli+=ordine.getCodArticoli().get(i);
				  quantità+=ordine.getQuantità().get(i);		  
				 }
			}
		
		articoli+="}";
		quantità+="}";
				
		try 
		{	
			String insert="INSERT INTO public.\"Ordine\"(\r\n" + 
					"\"idOrdine\", \"dataOrdine\", \"articoli\", \"quantità\", \"prezzoTotale\", \"codIndirizzo\",\"codUtente\")\r\n" + 
					"	VALUES ('"+idOrdine+
					"' , '"+ordine.getDataOrdine()+
					"' , '"+articoli+
					"' , '"+quantità+
					"' , '"+ordine.getPrezzoTotale()+
					"' , '"+ordine.getCodIndirizzo()+
					"' , '"+ordine.getCodUtente()+
					"')";
		
			PreparedStatement statement = dataSource.getConnessione().prepareStatement(insert);
			statement.executeUpdate();	
	
		} catch (SQLException e) {e.printStackTrace();}	
		
	}

	@Override
	public void delete(String chiave) 
	{
		try 
		{
			String delete = "DELETE FROM public.\"Ordine\"\r\n" + 
					"	WHERE \"idOrdine\"='"+chiave+"';";
			
			PreparedStatement statement = dataSource.getConnessione().prepareStatement(delete);	
			statement.executeUpdate();
		} 
		catch (SQLException e) {e.getMessage();} 	
	}

	@Override
	public String creaChiave() 
	{
		String chiave="";
		
		Random r = new Random();
		for(int i=0;i<12;i++)
		{
			if(i%2 == 0)
				chiave+=(int) (Math.random()*9);
			else
				chiave+=(char)(r.nextInt(26) + 'a');
		}
		    
		return chiave;
	}

	@Override
	public boolean trovaOrdine(String chiave) 
	{
		try
		{
		String insert="SELECT \"idOrdine\"\r\n" + 
				"	FROM public.\"Ordine\"\r\n" + 
				"	WHERE \"idIndirizzo\"='"+chiave+"';";
		
		PreparedStatement statement = dataSource.getConnessione().prepareStatement(insert);
		ResultSet result = statement.executeQuery();
		
		if(result.next())
		 if(chiave.equals(result.getString("idOrdine"))) //controlla se sono uguali
			 return true;
				
		} catch(Exception e) { e.getMessage(); }
		
		return false;
	}

}
