package com.nt.command;

public class StudentCommand {
	
	private int sno;
	private String sname;
	private String sadd;
	public StudentCommand() {
	System.out.println("StudentCommand.StudentCommand()");
	}
	
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}


	@Override
	public String toString() {
		return "StudentCommand [sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + "]";
	}
	
	
	

}
