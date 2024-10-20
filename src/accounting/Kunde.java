package accounting;

import java.util.concurrent.atomic.AtomicInteger;

public class Kunde {

	 private static final AtomicInteger idCounter = new AtomicInteger(0);
	    private final int kundenID;
	    private String name;
	    private String adresse;
	    private int kontakt;
	

	public Kunde(String name, Adresse adresse, Kontakt kontakt) {
    this.kundenID = idCounter.incrementAndGet();
    this.name = name;
    this.adresse = adresse;
    this.kontakt = kontakt;
    
	}
	
	public int getKundenID() {
	        return kundenID;
	    }
	    public String getName() {
	        return name;
	    }
	    public Adresse getAdresse() {
	        return adresse;
	    }
	    public Kontakt getKontakt() {
	        return kontakt;
	    }
	    
	     @Override
		public String toString() {
	        return "Kunde ID: " + kundenID + ", Name: " + name;
	     } 
	    
	    public void Adresse (String strasse, String stadt, String plz){
	            this.strasse = strasse;
	            this.stadt = stadt;
	            this.plz = plz;
	    
	    }
	    
	    String toString1() {
	        return strasse + ", " + stadt + ", " + plz;
	        }
}

	    
	   
	   


