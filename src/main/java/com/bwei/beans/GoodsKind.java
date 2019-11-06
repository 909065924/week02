package com.bwei.beans;

public class GoodsKind {
	
	private Integer sid;
	private String sname;
	@Override
	public String toString() {
		return "GoodsKind [sid=" + sid + ", sname=" + sname + "]";
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public GoodsKind(Integer sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public GoodsKind() {
		super();
	}
	

}
