package com.daw.clubspringboot.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author jrbalsas
 */
@Controller
public class ClubDefaultController {

	@GetMapping("/logout")
	public String logout (HttpSession session ) {
            session.invalidate();
            return "redirect:/";
	}
        
}
