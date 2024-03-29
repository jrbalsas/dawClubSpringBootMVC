package com.daw.clubspringboot.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author jrbalsas
 */
@Controller
public class ClubDefaultController {

	@GetMapping("/logout")
	public String logout (HttpServletRequest request ) throws ServletException {
            request.logout();
            request.getSession().invalidate();
            return "redirect:/";
	}        
}
