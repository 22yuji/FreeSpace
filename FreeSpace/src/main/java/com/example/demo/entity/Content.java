package com.example.demo.entity;

public class Content {
	private int content_id;
	private int user_id;
	private String up_date;
	private String up_time;
	private String content;
	
	
	public void setContentId(int content_id) {
		this.content_id = content_id;
	}
	public int getContentId() {
		return content_id;
	}
	
	public void setUserId(int user_id) {
		this.user_id = user_id;
	}
	public int getUserId() {
		return user_id;
	}
	
	public void setUpDate(String up_date) {
		this.up_date = up_date;
	}
	public String getUpDate() {
		return up_date;
	}
	
	public void setUpTime(String up_time) {
		this.up_time = up_time;
	}
	public String getUpTime() {
		return up_time;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}
}
