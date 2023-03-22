package struttura;

import java.time.LocalDate;
import java.util.*;

/*
 * Classe: ORDINE
 * Rappresenta una lista di articoli comprati da un cliente con relativo indirizzo di spedizione.
 */

public class Ordine {
	
	String idOrdine;
	LocalDate dataOrdine;
	List<String> codArticolo; //conterr� le chiavi primarie di ciascun articolo
	List<Integer> quantit�; //conterr� le quantit� riferire ad ogni articolo in posizione i-esima
	String codUtente;
	String codIndirizzo;
	double prezzoTotale;
	
	public Ordine(String idOrdine, String codUtente,List<String> codArticolo,
			      List<Integer> quantit�, String codIndirizzo, double prezzoTotale)
	{
		this.idOrdine = idOrdine;
		this.dataOrdine = LocalDate.now();
		this.codUtente = codUtente;
		this.codArticolo = codArticolo;
		this.quantit� = quantit�;
		this.codIndirizzo = codIndirizzo;
		this.prezzoTotale = prezzoTotale;
	}

	//SET & GET
	public String getIdOrdine() { return idOrdine; }
	public void setIdOrdine(String idOrdine) { this.idOrdine = idOrdine; }

	public LocalDate getDataOrdine() { return dataOrdine; }
	public void setDataOrdine(LocalDate dataOrdine) { this.dataOrdine = dataOrdine; }

	public String getCodUtente() { return codUtente; }
	public void setCodUtente(String codUtente) { this.codUtente = codUtente; }

	public List<String> getCodArticoli() { return codArticolo; }
	public void setCodArticolo(List<String> codArticolo) { this.codArticolo = codArticolo; }

	public List<Integer> getQuantit�() { return quantit�; }
	public void setQuantit�(List<Integer> quantit�) { this.quantit� = quantit�; }

	public String getCodIndirizzo() { return codIndirizzo; }
	public void setCodIndirizzo(String codIndirizzo) { this.codIndirizzo = codIndirizzo; }

	public double getPrezzoTotale() { return prezzoTotale; }
	public void setPrezzoTotale(double prezzoTotale) { this.prezzoTotale = prezzoTotale; }
	
	@Override
	public String toString()
	{
		return "idOrdine: "+idOrdine+"\n"+
	           "data ordine: "+dataOrdine.now()+"\n"+
			   "cod cliente: "+codUtente+"\n"+
	           "cod articolo: "+codArticolo+"\n"+
			   "quantit�: "+quantit�+"\n"+
	           "cod indirizzo: "+codIndirizzo+"\n"+
	           "prezzo totale: "+prezzoTotale;
	}

}
