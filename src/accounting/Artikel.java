package accounting;

import java.util.concurrent.atomic.AtomicInteger;

public class Artikel {

	private static final AtomicInteger idCounter = new AtomicInteger(0);
    private final int artikelNummer;
    private String bezeichnung;
    private double preis;


	public Artikel(String bezeichnung, double preis) {
    this.artikelNummer = idCounter.incrementAndGet();
    this.bezeichnung = bezeichnung;
    this.preis = preis;
	}
	
	public int getArtikelNummer() {
        return artikelNummer;
    }
    public String getBezeichnung() {
        return bezeichnung;
    }
    public double getPreis() {
        return preis;
    }

	
	
}