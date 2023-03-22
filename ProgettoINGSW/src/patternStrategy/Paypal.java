package patternStrategy;

import struttura.Ordine;

/*
 * Classe: PAYPAL
 * Gestisce le transazioni sugli ordini tramite Paypal.
 */

public class Paypal implements StrategiaDiPagamento {

	String emailPaypal;
	String passwordPaypal;
	
	public Paypal(String emailPaypal, String passwordPaypal)
	{
		this.emailPaypal = emailPaypal;
		this.passwordPaypal = passwordPaypal;
	}
	
	@Override
	public void pagaOrdine(Ordine ordine) 
	{
		//pago l'ordine attraverso paypal.
	}

	public String getEmailPaypal() { return emailPaypal; }
	public void setEmailPaypal(String emailPaypal) { this.emailPaypal = emailPaypal; }

	public String getPasswordPaypal() { return passwordPaypal; }
	public void setPasswordPaypal(String passwordPaypal) { this.passwordPaypal = passwordPaypal; }

}
