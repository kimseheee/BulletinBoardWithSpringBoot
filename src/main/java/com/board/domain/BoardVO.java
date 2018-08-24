package com.board.domain;

import java.util.Date;

public class BoardVO {
	private int bno;
	private String subject;
	private String content;
	private String writer;
	private Date reg_date;
	private int hit;
	
	public int getBno() {
		return bno;
	}
	
	public void setBon(int bno) {
		this.bno = bno;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public Date getReg_Date() {
		return reg_date;
	}
	
	public void setReg_Date(Date reg_date) {
		this.reg_date = reg_date;
	}
	
	public int getHit() {
		return hit;
	}
	
	public void setHit(int hit) {
		this.hit = hit;
	}
}