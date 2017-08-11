package com.maleesha.quiz.student;

import com.maleesha.quiz.user.UserParent;

public class StudentDTO extends UserParent {

	private String university;
	private int mark;

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [university=" + university + ", mark=" + mark + "]";
	}

}
