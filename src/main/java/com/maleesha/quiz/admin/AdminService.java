package com.maleesha.quiz.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.maleesha.quiz.student.StudentDTO;
import com.maleesha.quiz.student.StudentRepository;
import com.maleesha.quiz.user.UserDTO;



public class AdminService implements UserDetailsService {

	@Autowired
	private StudentRepository studentRepo;

	//Returning the userDetails as requested by entered userName 
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		StudentDTO studentDTO = studentRepo.findOneByemail(email);
		UserDTO userDTO = new UserDTO(studentDTO.getEmail(), studentDTO.getPassword(), studentDTO.getAuthorities());

		return userDTO;
	}

}