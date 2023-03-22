package database.dao;

import struttura.Articolo;

/*
 * Query sulla relazione Articolo nella base di dati.
 */

public interface ArticoloDao {
	
	public void insert(Articolo articolo);
	public void update(Articolo articolo);
	public void delete(String chiave);

}
