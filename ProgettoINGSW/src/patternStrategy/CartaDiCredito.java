package patternStrategy;
import struttura.Ordine;

/*
 * Classe: CARTA DI CREDITO
 * Gestisce le transazioni sugli ordini tramite Carta di credito.
 */

public class CartaDiCredito implements StrategiaDiPagamento{

	String titolare;
	String numeroCarta;
	String cvv;
	String dataScadenza;
	
	public CartaDiCredito(String titolare, String numeroCarta, String cvv, String dataScadenza)
	{
		this.titolare = titolare;
		this.numeroCarta = numeroCarta;
		this.cvv = cvv;
		this.dataScadenza = dataScadenza;
	}
	
	@Override
	public void pagaOrdine(Ordine ordine) 
	{
		//pago l'ordine attraverso la carta di credito
	}

	//SET & GET
	public String getTitolare() { return titolare; }
	public void setTitolare(String titolare) { this.titolare = titolare; }

	public String getNumeroCarta() { return numeroCarta; }
	public void setNumeroCarta(String numeroCarta) { this.numeroCarta = numeroCarta; }

	public String getCvv() { return cvv; }
	public void setCvv(String cvv) { this.cvv = cvv; }

	public String getDataScadenza() { return dataScadenza; }
	public void setDataScadenza(String dataScadenza) { this.dataScadenza = dataScadenza; }

}
