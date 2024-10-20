package accounting;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Rechnung {

	 private static final AtomicInteger idCounter = new AtomicInteger(0);
	    private final int rechnungsNummer;
	    private Kunde kunde;
	    private List<Artikel> artikelListe;
	    private Date rechnungsDatum;

	    public Rechnung(Kunde kunde, Date rechnungsDatum) {
	        this.rechnungsNummer = idCounter.incrementAndGet();
	        this.kunde = kunde;
	        this.artikelListe = new ArrayList<>();
	        this.rechnungsDatum = rechnungsDatum;
	    }
	    
	    
	    public int getRechnungsNummer() {
	        return rechnungsNummer;
	    }
	    public Kunde getKunde() {
	        return kunde;
	    }
	    public Date getRechnungsDatum() {
	        return rechnungsDatum;
	    }
	    
	    
	    public void addArtikel(Artikel artikel) {
	        this.artikelListe.add(artikel);
	    }
	    public void removeArtikel(Artikel artikel) {
	        this.artikelListe.remove(artikel);
	    }
	    
	    
	    public double berechneGesamtbetrag() {
	        double gesamtbetrag = 0;
	        for (Artikel artikel : artikelListe) {
	        	gesamtbetrag += artikel.getPreis();        }        
	        return gesamtbetrag;
	    }
	    
	    @Override
		public String toString() {
	        return "Rechnung Nr: " + rechnungsNummer + ", Kunde: " + kunde + ", Datum: " + rechnungsDatum;
	    }
	}
	    
	    
	    
}


