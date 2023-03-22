package database.dao;

/*
 * Query sulla relazione Desiderio nella base di dati.
 * Rappresenta la 'lista desideri' che un utente ha nel nostro sito.
 */

public interface DesiderioDao {
	
	public void insert(String codUtente, String codArticolo);
	public void delete(String codUtente, String codArticolo);

}
