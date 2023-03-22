package struttura;

/*
 * Classe: UTENTE
 * Rappresenta il cliente che interagisce con il nostro sistema.
 */

public class Utente {
	
	String codiceFiscale;
	String nome;
	String cognome;
	String email;
	String password;
	String dataNascita;
	String numeroTelefonico;
	String sesso;
	String gradoDiAccesso;
	
	public Utente() {}
	
	public Utente(String codiceFiscale, String nome, String cognome,  String sesso, String dataNascita, String numeroTelefonico,
			String email, String password, String gradoDiAccesso)
	{
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.dataNascita = dataNascita;
		this.numeroTelefonico = numeroTelefonico;
		this.sesso = sesso;
		this.gradoDiAccesso = gradoDiAccesso;
	}

	///METODI SET & GET
	public String getCodiceFiscale() { return codiceFiscale; }
	public void setCodiceFiscale(String codiceFiscale) { this.codiceFiscale = codiceFiscale; }

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

	public String getCognome() { return cognome; }
	public void setCognome(String cognome) { this.cognome = cognome; }

	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }

	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }

	public String getNumeroTelefonico() { return numeroTelefonico; }
	public void setNumeroTelefonico(String numeroTelefonico) { this.numeroTelefonico = numeroTelefonico; }

	public String getSesso() { return sesso; }
	public void setSesso(String sesso) { this.sesso = sesso; }

	public String getGradoDiAccesso() { return gradoDiAccesso; }
	public void setGradoDiAccesso(String gradoDiAccesso) { this.gradoDiAccesso = gradoDiAccesso; }

	
	
	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	@Override
	public String toString()
	{
		return "codice fiscale: "+codiceFiscale+"\n"+
	           "nome: "+nome+"\n"+
			   "cognome: "+cognome+"\n"+
	           "email: "+email+"\n"+
			   "password: "+password+"\n"+
	           "numero di telefono: "+numeroTelefonico+"\n"+
	           "sesso: "+sesso+"\n"+
	           "grado di accesso: "+gradoDiAccesso;
	}
}
