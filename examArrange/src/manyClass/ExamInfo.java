package manyClass;

public class ExamInfo {
	private String Tnum;
	private String PYnum;
	private String Tdate;
	private String TStime;
	private String TLast;
	private String TCtime;
	
	public ExamInfo(String Tnum, String PYnum, String Tdate,
			String TStime, String TLast, String TCtime) {
		this.Tnum = Tnum;
		this.PYnum = PYnum;
		this.Tdate = Tdate;
		this.TStime = TStime;
		this.TLast = TLast;
		this.TCtime = TCtime;
	}

	public String getTnum() {
		return Tnum;
	}

	public void setTnum(String tnum) {
		Tnum = tnum;
	}

	public String getPYnum() {
		return PYnum;
	}

	public void setPYnum(String pYnum) {
		PYnum = pYnum;
	}

	public String getTdate() {
		return Tdate;
	}

	public void setTdate(String tdate) {
		Tdate = tdate;
	}

	public String getTStime() {
		return TStime;
	}

	public void setTStime(String tStime) {
		TStime = tStime;
	}

	public String getTLast() {
		return TLast;
	}

	public void setTLast(String tLast) {
		TLast = tLast;
	}

	public String getTCtime() {
		return TCtime;
	}

	public void setTCtime(String tCtime) {
		TCtime = tCtime;
	}
	
}
