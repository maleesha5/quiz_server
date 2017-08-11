package com.maleesha.quiz.question;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.maleesha.quiz.answer.AnswerDTO;

@JsonIgnoreProperties(ignoreUnknown = true)
public class McqQuestionDTO {

	@Id
	private String qID;
	private String body;
	private String category;
	private int mark;
	private List<AnswerDTO> answers;

	public String getqID() {
		return qID;
	}

	public void setqID(String qID) {
		this.qID = qID;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public List<AnswerDTO> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerDTO> answerDTOs) {
		this.answers = answerDTOs;
	}

	@Override
	public String toString() {
		return "McqQuestionDTO [qID=" + qID + ", body=" + body + ", category=" + category + ", mark=" + mark
				+ ", answers=" + answers + "]";
	}


}
