package struttura;

/*
 * Classe: ARTICOLO
 * Rappresenta il singolo prodotto all'interno dell'e-commerce.
 */

public class Articolo {
	
	String idArticolo;
	String categoria;
	String marca;
	String colore;
	String dimensioni;
	String peso;
	double prezzo;
	String modello;
	int disponibilità;
	
	public Articolo(String idArticolo, String categoria, String marca, String colore,
			        String dimensioni, String peso, double prezzo, String modello, int disponibilità)
	{
		this.idArticolo = idArticolo;
		this.categoria = categoria;
		this.marca = marca;
		this.colore = colore;
		this.dimensioni = dimensioni;
		this.peso = peso;
		this.prezzo = prezzo;
		this.modello = modello;
		this.disponibilità = disponibilità;
	}
		
	//SET & GET
	public String getIdArticolo() { return idArticolo; }
	public void setIdArticolo(String idArticolo) { this.idArticolo = idArticolo; }
	
	public String getCategoria() { return categoria; }
	public void setCategoria(String categoria) { this.categoria = categoria; }
	
	public String getMarca() { return marca; }
	public void setMarca(String marca) { this.marca = marca; }
	
	public String getColore() { return colore; }
	public void setColore(String colore) { this.colore = colore; }
	
	public String getDimensioni() { return dimensioni; }
	public void setDimensioni(String dimensioni) { this.dimensioni = dimensioni; }
	
	public String getPeso() { return peso; }
	public void setPeso(String peso) { this.peso = peso; }
	
	public double getPrezzo() { return prezzo; }
	public void setPrezzo(double prezzo) { this.prezzo = prezzo; }
		
	public String getModello() { return modello; }
	public void setModello(String modello) { this.modello = modello; }
	
	public int getDisponibilità() { return disponibilità; }
	public void setDisponibilità(int disponibilità) { this.disponibilità = disponibilità; }

	@Override
	public String toString()
	{
		return "idArticolo: "+idArticolo+"\n"+
	           "marca: "+marca+"\n"+
			   "colore: "+colore+"\n"+
	           "dimensioni: "+dimensioni+"\n"+
			   "peso: "+peso+"\n"+
			   "prezzo: "+prezzo+"\n"+
			   "modello: "+modello+"\n"+
	           "disponibilità: "+disponibilità;        
	}
}
