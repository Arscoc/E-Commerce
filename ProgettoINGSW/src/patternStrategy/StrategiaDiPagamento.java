package patternStrategy;
import struttura.Ordine;

/*
 * L'utente sceglie il metodo di pagamento piu opportuno.
 * Adottiamo il pattern Strategy per soddisfare tale esigenza.
 */

public interface StrategiaDiPagamento {
	
	public void pagaOrdine(Ordine ordine);

}
