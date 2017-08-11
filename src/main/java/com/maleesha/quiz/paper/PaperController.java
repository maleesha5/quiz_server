package com.maleesha.quiz.paper;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class PaperController {

	@RequestMapping(value = "/save_paper", method = RequestMethod.POST)
	public PaperDTO setPaper(HttpServletResponse response, @RequestBody PaperDTO paper) {

		return paper;
	}
}
