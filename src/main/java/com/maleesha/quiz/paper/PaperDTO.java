package com.maleesha.quiz.paper;

import java.sql.Date;
import java.util.List;

import javax.persistence.Id;

import com.maleesha.quiz.question.McqQuestionDTO;

public class PaperDTO {

	@Id
	private String pID;

	private List<McqQuestionDTO> qList;

	private double duration;

	private Date date;

	public String getpID() {
		return pID;
	}

	public void setpID(String pID) {
		this.pID = pID;
	}

	public List<McqQuestionDTO> getqList() {
		return qList;
	}

	public void setqList(List<McqQuestionDTO> qList) {
		this.qList = qList;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Paper [pID=" + pID + ", qList=" + qList + ", duration=" + duration + ", date=" + date + "]";
	}

}
