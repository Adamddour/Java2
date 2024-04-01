package versuch3_datenstruckten;

public class Title {
	
	    private String durance;
	    private String interpret;
	    private String name;
	    private String title;
	    private int trackNr;
		private int cdNr;

	    public Title(int cdNr, int trackNr) {
	        this.cdNr = cdNr;
	        this.trackNr = trackNr;
	        this.durance = "";
	        this.interpret = "";
	        this.name = "";
	        this.title = "";
	    }

	    public int getCdNr() {
	        return cdNr;
	    }

	    public void setCdNr(int cdNr) {
	        this.cdNr = cdNr;
	    }

	    public String getDurance() {
	        return durance;
	    }

	    public void setDurance(String durance) {
	        this.durance = durance;
	    }

	    public String getInterpret() {
	        return interpret;
	    }

	    public void setInterpret(String interpret) {
	        this.interpret = interpret;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public int getTrackNr() {
	        return trackNr;
	    }

	    public void setTrackNr(int trackNr) {
	        this.trackNr = trackNr;
	    }
	}



