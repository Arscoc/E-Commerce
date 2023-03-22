package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import database.dao.IndirizzoDao;
import struttura.Indirizzo;

public class IndirizzoDaoJDBC implements IndirizzoDao {

	DataSource dataSource;
	
	public IndirizzoDaoJDBC(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	
	@Override
	public void insert(Indirizzo indirizzo) 
	{
		boolean controllaDuplicato = true;
		String idIndirizzo = "";
		
		while(controllaDuplicato)
		{
			idIndirizzo = creaChiave();
			controllaDuplicato = trovaIndirizzo(idIndirizzo);
		}
		
		try 
		{	
			String insert="INSERT INTO public.\"Indirizzo\"(\r\n" + 
					"\"idIndirizzo\", \"nazione\", \"città\", \"cap\", \"via\", \"numeroCivico\",\"codUtente\")\r\n" + 
					"	VALUES ('"+idIndirizzo+
					"' , '"+indirizzo.getNazione()+
					"' , '"+indirizzo.getCittà()+
					"' , '"+indirizzo.getCap()+
					"' , '"+indirizzo.getVia()+
					"' , '"+indirizzo.getNumeroCivico()+
					"' , '"+indirizzo.getCodCliente()+
					"')";
		
			PreparedStatement statement = dataSource.getConnessione().prepareStatement(insert);
			statement.executeUpdate();	
	
		} catch (SQLException e) {e.printStackTrace();}	
	}

	@Override
	public void update(Indirizzo indirizzo) 
	{
		try 
		{
			String update = "UPDATE public.\"Indirizzo\"\r\n" + 
					"	SET \"idIndirizzo\"='"+indirizzo.getIdIndirizzo()+"', "
							+ "\"nazione\"='"+indirizzo.getNazione()+"', "
						    + "\"città\"='"+indirizzo.getCittà()+"', "
							+ "\"cap\"='"+indirizzo.getCap()+"', "
							+ "\"via\"='"+indirizzo.getVia()+"', "
							+ "\"numeroCivico\"='"+indirizzo.getNumeroCivico()+"', "
							+ "\"codUtente\"='"+indirizzo.getCodCliente()+"'\r\n" + 
					"	WHERE \"idIndirizzo\"='" +indirizzo.getIdIndirizzo()+"';";
			
			
			PreparedStatement statement = dataSource.getConnessione().prepareStatement(update);	
            statement.executeUpdate();				
			
		} catch (SQLException e) {e.getMessage();}	
	}

	@Override
	public void delete(String chiave) 
	{
		try 
		{
			String delete = "DELETE FROM public.\"Indirizzo\"\r\n" + 
					"	WHERE \"idIndirizzo\"='"+chiave+"';";
			
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
	public boolean trovaIndirizzo(String chiave) 
	{
		try
		{
		String insert="SELECT \"idIndirizzo\"\r\n" + 
				"	FROM public.\"Indirizzo\"\r\n" + 
				"	WHERE \"idIndirizzo\"='"+chiave+"';";
		
		PreparedStatement statement = dataSource.getConnessione().prepareStatement(insert);
		ResultSet result = statement.executeQuery();
		
		if(result.next())
		 if(chiave.equals(result.getString("idIndirizzo"))) //controlla se sono uguali
			 return true;
				
		} catch(Exception e) { e.getMessage(); }
		
		return false;
	}
}
