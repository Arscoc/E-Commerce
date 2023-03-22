package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.dao.UtenteDao;
import struttura.Utente;

public class UtenteDaoJDBC implements UtenteDao {

	DataSource dataSource;
	
	public UtenteDaoJDBC(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	
	@Override
	public void insert(Utente utente) 
	{
		Connection connection=null;
		try 
		{
			connection=this.dataSource.getConnessione();
			
			String insert="INSERT INTO public.\"Utente\"(\r\n" + 
					"\"codiceFiscale\", \"nome\", \"cognome\", \"sesso\", \"dataNascita\", \"numeroTelefonico\", \"email\", \"password\",\"gradoDiAccesso\")\r\n" + 
					"	VALUES ('"+utente.getCodiceFiscale()+
					"' , '"+utente.getNome()+
					"' , '"+utente.getCognome()+
					"' , '"+utente.getSesso()+
					"' , '"+utente.getDataNascita()+
					"' , '"+utente.getNumeroTelefonico()+
					"' , '"+utente.getEmail()+
					"' , '"+utente.getPassword()+
					"' , '"+utente.getGradoDiAccesso()+	
					"')";
		
			PreparedStatement statement = connection.prepareStatement(insert);
			statement.executeUpdate();
			connection.close();
			
		} catch (SQLException e) {e.printStackTrace();}		
	}
	


	@Override
	public void update(Utente utente) 
	{
		Connection connection = null;
		try 
		{
			connection=this.dataSource.getConnessione();
			String update = "UPDATE public.\"Utente\"\r\n" + 
					"	SET \"codiceFiscale\"='"+utente.getCodiceFiscale()+"', "
							+ "\"nome\"='"+utente.getNome()+"', "
						    + "\"cognome\"='"+utente.getCognome()+"', "
							+ "\"sesso\"='"+utente.getSesso()+"', "
							+ "\"numeroTelefonico\"='"+utente.getNumeroTelefonico()+"', "
							+ "\"email\"='"+utente.getEmail()+"', "
							+ "\"password\"='"+utente.getPassword()+"', "
							+ "\"gradoDiAccesso\"='"+utente.getGradoDiAccesso()+"'\r\n" + 
					"	WHERE \"codiceFiscale\"='" +utente.getCodiceFiscale()+"';";
			
			PreparedStatement statement = connection.prepareStatement(update);	
            statement.executeUpdate();				
			connection.close();
			
		} catch (SQLException e) {e.getMessage();}	
		
	}

	@Override
	public void delete(String chiave) 
	{
		Connection connection = null;
		try 
		{
			connection=this.dataSource.getConnessione();
			String delete = "DELETE FROM public.\"Utente\"\r\n" + 
					"	WHERE \"codiceFiscale\"='"+chiave+"';";
			
			PreparedStatement statement = connection.prepareStatement(delete);	
			statement.executeUpdate();
			connection.close();
		} 
		catch (SQLException e) {e.getMessage();} 
	}

	@Override
	public Utente accedi(String email, String password) 
	{
		Utente utente = null;
		
		try 
		{
			String query = "SELECT *\r\n" + 
					"FROM public.\"Utente\"\r\n" + 
					"where \"email\"='"+email+"' AND \"password\"='"+password+"';";
			
			System.out.println(query);
			PreparedStatement statement= dataSource.getConnessione().prepareStatement(query);		
			ResultSet result = statement.executeQuery();
			
			if (result.next()) 
			{
				utente=new Utente();
				utente.setCodiceFiscale(result.getString("codiceFiscale"));	
				utente.setNome(result.getString("nome"));
				utente.setCognome(result.getString("cognome"));
				utente.setSesso(result.getString("sesso"));
				utente.setNumeroTelefonico(result.getString("numeroTelefonico"));
				utente.setEmail(result.getString("email"));
				utente.setPassword(result.getString("password"));
				utente.setGradoDiAccesso(result.getString("gradoDiAccesso"));				
			}
			
		} catch (SQLException e) {e.getMessage();} 
		
	return utente;
		
	}

}
