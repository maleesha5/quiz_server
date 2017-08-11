package com.maleesha.quiz.answer;

import javax.persistence.Id;

public class AnswerDTO {

	private String body;
	private boolean isCorrect;

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	@Override
	public String toString() {
		return "AnswerDTO [body=" + body + ", isCorrect=" + isCorrect + "]";
	}

	

}
