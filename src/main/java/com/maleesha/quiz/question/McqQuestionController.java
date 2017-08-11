package com.maleesha.quiz.question;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maleesha.quiz.admin.AdminDTO;

@CrossOrigin(origins = "http://localhost")
@Controller
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class McqQuestionController {

	@Autowired
	private McqRepository mcqRepo;

	@RequestMapping(value = "/save_question", method = RequestMethod.POST)
	@ResponseBody
	public McqQuestionDTO setQuestion(HttpServletResponse response, @RequestBody McqQuestionDTO mcqQuestion) {

		System.out.println(mcqRepo.save(mcqQuestion));
		response.setStatus(202);
		return mcqQuestion;
	}
	
	@GetMapping("/get_all_questions")
	public @ResponseBody List<McqQuestionDTO> getAdmin() {

		return mcqRepo.findAll();
	}

}
