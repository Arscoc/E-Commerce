package database.dao;

import struttura.Ordine;

/*
 * Query sulla relazione Ordine nella base di dati.
 */

public interface OrdineDao {
	
	public void insert(Ordine ordine);
	public void delete(String chiave);
	
	public String creaChiave();
	public boolean trovaOrdine(String chiave);

}
