package struttura;

/*
 * Classe: INDIRIZZO
 * Rappresenta l'indirizzo di spedizione utilizzato da un cliente.
 */

public class Indirizzo {
	
	String idIndirizzo;
	String nazione;
	String citt�;
	String cap;
	String via;
    String numeroCivico;
    String codCliente;
    
    public Indirizzo() {}
    
    public Indirizzo(String idIndirizzo, String nazione, String citt�, String cap, String via,
    		         String numeroCivico, String codCliente)
    {
    	this.idIndirizzo = idIndirizzo;
    	this.nazione = nazione;
    	this.citt� = citt�;
    	this.cap = cap;
    	this.via = via;
    	this.numeroCivico = numeroCivico;
    	this.codCliente = codCliente;
    }

    //SET & GET
	public String getIdIndirizzo() { return idIndirizzo; }
	public void setIdIndirizzo(String idIndirizzo) { this.idIndirizzo = idIndirizzo; }

	public String getNazione() { return nazione; }
	public void setNazione(String nazione) { this.nazione = nazione; }

	public String getCitt�() { return citt�; }
	public void setCitt�(String citt�) { this.citt� = citt�; }

	public String getCap() { return cap; }
	public void setCap(String cap) { this.cap = cap; }

	public String getVia() { return via; }
	public void setVia(String via) { this.via = via; }

	public String getNumeroCivico() { return numeroCivico; }
	public void setNumeroCivico(String numeroCivico) { this.numeroCivico = numeroCivico; }

	public String getCodCliente() { return codCliente; }
	public void setCodCliente(String codCliente) { this.codCliente = codCliente; }
	
	@Override
	public String toString()
	{
		return "idIndirizzo: "+idIndirizzo+"\n"+
	           "nazione: "+nazione+"\n"+
			   "citt�: "+citt�+"\n"+
	           "cap: "+cap+"\n"+
			   "via: "+via+"\n"+
	           "numero civico: "+numeroCivico+"\n"+
	           "codice cliente: "+codCliente;
	}
}
