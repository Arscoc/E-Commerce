package database.dao;

import struttura.Utente;

/*
 * Query sulla relazione Utente nella base di dati.
 */

public interface UtenteDao {
	
	public void insert(Utente utente);
	public void update(Utente utente);
	public void delete(String chiave);
	
	public Utente accedi(String email,String password);
	
}
