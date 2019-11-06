package com.bwei.beans;

public class Goods {
	
	private Integer gid;
	private String gcname;
	private String gename;
	private Double gsize;
	private Double gprice;
	private Integer gsum;
	private String glabel;
	private String gpic;
	
	private Integer bid;
	private Integer sid;
	private String bname;
	private String sname;
	
	public Goods(Integer gid, String gcname, String gename, Double gsize, Double gprice, Integer gsum, String glabel,
			String gpic, Integer bid, Integer sid, String bname, String sname) {
		super();
		this.gid = gid;
		this.gcname = gcname;
		this.gename = gename;
		this.gsize = gsize;
		this.gprice = gprice;
		this.gsum = gsum;
		this.glabel = glabel;
		this.gpic = gpic;
		this.bid = bid;
		this.sid = sid;
		this.bname = bname;
		this.sname = sname;
	}

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGcname() {
		return gcname;
	}

	public void setGcname(String gcname) {
		this.gcname = gcname;
	}

	public String getGename() {
		return gename;
	}

	public void setGename(String gename) {
		this.gename = gename;
	}

	public Double getGsize() {
		return gsize;
	}

	public void setGsize(Double gsize) {
		this.gsize = gsize;
	}

	public Double getGprice() {
		return gprice;
	}

	public void setGprice(Double gprice) {
		this.gprice = gprice;
	}

	public Integer getGsum() {
		return gsum;
	}

	public void setGsum(Integer gsum) {
		this.gsum = gsum;
	}

	public String getGlabel() {
		return glabel;
	}

	public void setGlabel(String glabel) {
		this.glabel = glabel;
	}

	public String getGpic() {
		return gpic;
	}

	public void setGpic(String gpic) {
		this.gpic = gpic;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gcname=" + gcname + ", gename=" + gename + ", gsize=" + gsize + ", gprice="
				+ gprice + ", gsum=" + gsum + ", glabel=" + glabel + ", gpic=" + gpic + ", bid=" + bid + ", sid=" + sid
				+ ", bname=" + bname + ", sname=" + sname + "]";
	}

	public Goods() {
		super();
	}
	
	

}
