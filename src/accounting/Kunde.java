package accounting;

import java.util.concurrent.atomic.AtomicInteger;

public class Kunde {

	  private static final AtomicInteger idCounter = new AtomicInteger(0);
	    private final int kundenID;
	    private String name;
	    private String adresse;
	    private int kontakt;
	
}
