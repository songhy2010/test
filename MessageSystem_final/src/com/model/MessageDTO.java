package com.model;

public class MessageDTO {
	
	private int num;
	private String receive;
	private String send;
	private String content;
	private String date;
	
	public MessageDTO(int num, String receive, String send, String content, String date) {
		super();
		this.num = num;
		this.receive = receive;
		this.send = send;
		this.content = content;
		this.date = date;
	}
	
	
	
	public MessageDTO(String receive, String send, String content) {
		super();
		this.receive = receive;
		this.send = send;
		this.content = content;
	}



	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getReceive() {
		return receive;
	}

	public void setReceive(String receive) {
		this.receive = receive;
	}

	public String getSend() {
		return send;
	}

	public void setSend(String send) {
		this.send = send;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	
	

}
