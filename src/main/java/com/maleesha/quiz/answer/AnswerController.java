package com.maleesha.quiz.answer;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AnswerController {

	@Autowired
	private AnswerRepository answerRepo;

	@RequestMapping(value = "/save_answer", method = RequestMethod.POST)
	public AnswerDTO saveAnswer(HttpServletResponse response, @RequestBody AnswerDTO answer) {

		answerRepo.save(answer);
		return answer;
	}

}
