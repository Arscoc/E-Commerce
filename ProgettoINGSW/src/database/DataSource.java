package database;

import java.sql.*;

/*
 * Classe: DATA SOURCE
 * Si occupa di stabire una connessione con la base di dati.
 */

public class DataSource {
	
	String indirizzo;
	String username;
	String password;
	Connection connessione;
	
	/* !!! DATABASE ONLINE !!!
	 * username: lzqahepc
	 * password: EI86PKQM-mY0-9zbPGjjljQTK58bomPc
	 * 
	 * indirizzo: 1. rogue.db.elephantsql.com 
	 *            2. postgres://lzqahepc:EI86PKQM-mY0-9zbPGjjljQTK58bomPc@rogue.db.elephantsql.com:5432/lzqahepc
	 */
	
	public DataSource() throws ClassNotFoundException 
	{
		indirizzo = "jdbc:postgresql://rogue.db.elephantsql.com:5432/";
		username = "lzqahepc";
		password = "EI86PKQM-mY0-9zbPGjjljQTK58bomPc";
		
		try
		{
			Class.forName("org.postgresql.Driver");
		    connessione = DriverManager.getConnection(indirizzo,username, password);
		   
				
		} catch(SQLException e) {e.getMessage();}  
	}

	//SET & GET
	public String getIndirizzo() { return indirizzo; }
	public void setIndirizzo(String indirizzo) { this.indirizzo = indirizzo; }

	public String getUsername() { return username; }
	public void setUsername(String username) { this.username = username; }

	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }

	public Connection getConnessione() { return connessione; }
	public void setConnessione(Connection connessione) { this.connessione = connessione; }

}
