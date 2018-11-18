package manyClass;

public class ExamClass {
	private String Tnum ;
	private String Tyear;
	private String Tsems;
	private String Tgrade;
	private String Tclass;
	private String Tquality;
	private String TSdate;
	private String TCdate;
	
	public ExamClass(String Tnum, String Tyear, String Tsems, 
			  String Tgrade, String Tclass,String Tquality,
			  String TSdate, String TCdate){
		this.Tnum = Tnum;
		this.Tyear = Tyear;
		this.Tsems = Tsems;
		this.Tgrade = Tgrade;
		this.Tclass = Tclass;
		this.Tquality = Tquality;
		this.TSdate = TSdate;
		this.TCdate = TCdate;
		
	}

	public String getTnum() {
		return Tnum;
	}

	public void setTnum(String tnum) {
		Tnum = tnum;
	}

	public String getTyear() {
		return Tyear;
	}

	public void setTyear(String tyear) {
		Tyear = tyear;
	}

	public String getTsems() {
		return Tsems;
	}

	public void setTsems(String tsems) {
		Tsems = tsems;
	}

	public String getTgrade() {
		return Tgrade;
	}

	public void setTgrade(String tgrade) {
		Tgrade = tgrade;
	}

	public String getTclass() {
		return Tclass;
	}

	public void setTclass(String tclass) {
		Tclass = tclass;
	}

	public String getTquality() {
		return Tquality;
	}

	public void setTquality(String tquality) {
		Tquality = tquality;
	}

	public String getTSdate() {
		return TSdate;
	}

	public void setTSdate(String tSdate) {
		TSdate = tSdate;
	}

	public String getTCdate() {
		return TCdate;
	}

	public void setTCdate(String tCdate) {
		TCdate = tCdate;
	}
	
	
}
