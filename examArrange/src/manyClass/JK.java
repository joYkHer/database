package manyClass;

public class JK {
	private String JKnum;
	private String Tnum;
	private String Tgrade;
	private String Troom;
	private String TSubject;
	private String TSubName;
	private String TeacherNum;
	
	public JK(String JKnum, String Tnum, String Tgrade,
			String Troom, String TSubject, String TSubName,
			String TeacherNum) {
		this.JKnum = JKnum;
		this.Tnum = Tnum;
		this.Tgrade = Tgrade;
		this.Troom = Troom;
		this.TSubject = TSubject;
		this.TSubName = TSubName;
		this.TeacherNum = TeacherNum;
	}

	public String getJKnum() {
		return JKnum;
	}

	public void setJKnum(String jKnum) {
		JKnum = jKnum;
	}

	public String getTnum() {
		return Tnum;
	}

	public void setTnum(String tnum) {
		Tnum = tnum;
	}

	public String getTgrade() {
		return Tgrade;
	}

	public void setTgrade(String tgrade) {
		Tgrade = tgrade;
	}

	public String getTroom() {
		return Troom;
	}

	public void setTroom(String troom) {
		Troom = troom;
	}

	public String getTSubject() {
		return TSubject;
	}

	public void setTSubject(String tSubject) {
		TSubject = tSubject;
	}

	public String getTSubName() {
		return TSubName;
	}

	public void setTSubName(String tSubName) {
		TSubName = tSubName;
	}

	public String getTeacherNum() {
		return TeacherNum;
	}

	public void setTeacherNum(String teacherNum) {
		TeacherNum = teacherNum;
	}
	
	

}
