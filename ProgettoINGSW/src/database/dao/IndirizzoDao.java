package database.dao;

import struttura.Indirizzo;

/*
 * Query sulla relazione Indirizzo nella base di dati.
 */

public interface IndirizzoDao {
	
	public void insert(Indirizzo indirizzo);
	public void update(Indirizzo indirizzo);
	public void delete(String chiave);
	
	public String creaChiave();
	public boolean trovaIndirizzo(String chiave);

}
