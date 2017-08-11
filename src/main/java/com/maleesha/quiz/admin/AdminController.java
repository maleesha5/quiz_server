package com.maleesha.quiz.admin;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maleesha.quiz.student.StudentDTO;
import com.maleesha.quiz.student.StudentRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminRepository adminRepo;

	@Autowired
	private StudentRepository studentRepo;

	@GetMapping("/save_admin_page")
	public String saveAdminPage(Model model) {

		model.addAttribute("admin", new AdminDTO());
		return "enterAdmin";
	}

	@GetMapping("/save_student_page")
	public String saveStudentPage(Model model) {

		model.addAttribute("student", new StudentDTO());
		return "enterStudent";
	}

	@GetMapping("/get_student")
	@ResponseBody
	public List<StudentDTO> getStudents(HttpServletResponse response) {
		System.out.println("Student Repo " + studentRepo.findAll());
		response.addHeader("Content", "studentDetails");
		System.out.println("Locale Variable " + response.getLocale());
		System.out.println("Status " + response.getStatus());
		//response.setStatus(202);
		return studentRepo.findAll();
	}

	@GetMapping("/get_admin")
	public @ResponseBody List<AdminDTO> getAdmin() {

		return adminRepo.findAll();
	}

	@PostMapping("/save_admin")
	public void saveAdmin(@ModelAttribute AdminDTO adminDTO) {

		adminRepo.save(adminDTO);
	}

	@RequestMapping(value = "/save_student", method = RequestMethod.POST)
	public @ResponseBody StudentDTO saveStudent(@ModelAttribute StudentDTO studentDTO) {

		studentDTO.setAuthorities(new String[] { "User" });
		studentRepo.save(studentDTO);
		return studentDTO;
	}

	@GetMapping("/")
	public String welcome() {

		// model.addAttribute("admin", new Admin());
		System.out.println("Welcome!!!");
		return "welcome";
	}

}
