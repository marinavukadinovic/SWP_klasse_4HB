package accounting;

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
}
