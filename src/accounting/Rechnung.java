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
}


