package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.dao.ArticoloDao;
import struttura.Articolo;

public class ArticoloDaoJDBC implements ArticoloDao {

	DataSource dataSource;
	
	public ArticoloDaoJDBC(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	
	@Override
	public void insert(Articolo articolo) 
	{
		try 
		{	
			String insert="INSERT INTO public.\"Articolo\"(\r\n" + 
					"\"idArticolo\", \"categoria\", \"marca\", \"colore\", \"dimensioni\", \"peso\", \"prezzo\",\"modello\",\"disponibilità\")\r\n" + 
					"	VALUES ('"+articolo.getIdArticolo()+
					"' , '"+articolo.getCategoria()+
					"' , '"+articolo.getMarca()+
					"' , '"+articolo.getColore()+
					"' , '"+articolo.getDimensioni()+
					"' , '"+articolo.getPeso()+
					"' , '"+articolo.getPrezzo()+
					"' , '"+articolo.getModello()+	
					"' , '"+articolo.getDisponibilità()+		
					"')";
		
			PreparedStatement statement = dataSource.getConnessione().prepareStatement(insert);
			statement.executeUpdate();
			
		} catch (SQLException e) {e.printStackTrace();}		
	}

	@Override
	public void update(Articolo articolo) 
	{
		try 
		{
			String update = "UPDATE public.\"Articolo\"\r\n" + 
					"	SET \"idArticolo\"='"+articolo.getIdArticolo()+"', "
							+ "\"categoria\"='"+articolo.getCategoria()+"', "
						    + "\"marca\"='"+articolo.getMarca()+"', "
							+ "\"colore\"='"+articolo.getColore()+"', "
							+ "\"dimensioni\"='"+articolo.getDimensioni()+"', "
							+ "\"peso\"='"+articolo.getPeso()+"', "
							+ "\"prezzo\"='"+articolo.getPrezzo()+"', "
						    + "\"modello\"='"+articolo.getModello()+"', "
							+ "\"disponibilità\"='"+articolo.getDisponibilità()+"'\r\n" + 
					"	WHERE \"idArticolo\"='" +articolo.getIdArticolo()+"';";
			
			PreparedStatement statement = dataSource.getConnessione().prepareStatement(update);	
            statement.executeUpdate();				
			
		} catch (SQLException e) {e.getMessage();}	
	}

	@Override
	public void delete(String chiave) 
	{
		try 
		{
			String delete = "DELETE FROM public.\"Articolo\"\r\n" + 
					"	WHERE \"idArticolo\"='"+chiave+"';";
			
			PreparedStatement statement = dataSource.getConnessione().prepareStatement(delete);	
			statement.executeUpdate();
		} 
		catch (SQLException e) {e.getMessage();} 		
	}

}
