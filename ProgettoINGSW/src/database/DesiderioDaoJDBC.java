package database;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.dao.DesiderioDao;

public class DesiderioDaoJDBC implements DesiderioDao {
	
	DataSource dataSource;
	
	public DesiderioDaoJDBC(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}

	@Override
	public void insert(String codUtente, String codArticolo) 
	{
		try 
		{	
			String insert="INSERT INTO public.\"Desiderio\"(\r\n" + 
					"\"codUtente\", \"codArticolo\")\r\n" + 
					"	VALUES ('"+codUtente+
					"' , '"+codArticolo+
					"')";
		
			PreparedStatement statement = dataSource.getConnessione().prepareStatement(insert);
			statement.executeUpdate();	
	
		} catch (SQLException e) {e.printStackTrace();}	
	}

	@Override
	public void delete(String codUtente, String codArticolo) 
	{
		
	}

}
