package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Feedback 
{
	@Id
	@GeneratedValue
	private int ID;
	private String responderName;
	private String feedbackString;
	public Feedback(String responderName, String feedbackString) {
		super();
		this.responderName = responderName;
		this.feedbackString = feedbackString;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getResponderName() {
		return responderName;
	}
	public void setResponderName(String responderName) {
		this.responderName = responderName;
	}
	public String getFeedbackString() {
		return feedbackString;
	}
	public void setFeedbackString(String feedbackString) {
		this.feedbackString = feedbackString;
	}
	@Override
	public String toString() {
		return "Feedback [ID=" + ID + ", responderName=" + responderName + ", feedbackString=" + feedbackString + "]";
	}
}
